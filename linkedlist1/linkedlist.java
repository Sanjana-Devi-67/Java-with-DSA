public class linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //Add first
    public void addFirst(int data){
        //step1->create new node
        Node newNode=new Node(data);
        size++;
        //if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2->newnode must point to head
        newNode.next=head;
        //step3->make newNode as head
        head=newNode;
    }
     //Add Last
     public void addLast(int data){
        //step1->create new node
        Node newNode=new Node(data);
        size++;
        //if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2->newnode must point to head
        tail.next=newNode;
        //step3->make newNode as head
        tail=newNode;
    }
    //print list
    public void printList(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //add element in middle
    public void addEleInMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(9);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){// making temp as prev node
            temp=temp.next;
            i++;
        }
        //i<idx-1 -> i.e temp point to previous node of idx
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //length of ll
    public int lengthLL(){
        int count=0;
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        return count;
    }
    //remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//or tail.data
        prev.next=null;
        size--;
        return val;
    }
    //search
    public int iterativeSearch(int key){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(key==temp.data){
                return i;
            }else{
                temp=temp.next;
            }
        }
        return -1;
            //or
        //int idx=0;
        //while(temp!=null){
        //    if(temp.data==key){
        //        return idx;
        //    }
        //}
        //temp=temp.next;
        //idx++;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;//no key found
        }
        if(head.data==key){
            return 0;//key found
        }
        int idx=helper(head.next,key);//to check if key is found in remaining ll
        if(idx==-1){
            return -1;
        }
        return idx+1;//to get proper idx we add 1
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }
    //reverse
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    //remove nth node from end
    public void removeNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //if head is the node to be deleted from end
        if(n==sz){
            head=head.next;
            return;
        }
        //to reach till size-n inorder to get prev
        int i=1;
        int iTofind=sz-n;
        Node prev=head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        //now delete the node next to prev
        prev.next=prev.next.next;
    }
    //find mid->slow-fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; //slow is our mid
    }
    //Palindrome
    public boolean Palindrome(){
          if(head==null || head.next==null){ //if there are no elements or single element
            return true;
          }
          //step1-find mid
           Node midNode=findMid(head);
          //step2- reverse 2nd half
           Node prev=null;
           Node curr=midNode;
           Node next;
           while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           }
           Node right=prev; //right half head
           Node left=head;//left half head
          //step3- check left and right
          while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
          }
          return true;
    }
public static void main(String args[]){
        linkedlist ll=new linkedlist();
        //   ll.head=new Node(1);
        //   ll.head.next=new Node(2);
        ll.printList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(8);
        ll.addLast(6);
        ll.printList();
        ll.addEleInMid(2, 9);
        ll.printList();
        // System.out.println(ll.lengthLL());
        //print size
        System.out.println(ll.size);
        //remove first
        System.out.println("Removed element->"+ ll.removeFirst());
        //ll after removing head
        ll.printList();
        // ll after removing last
        System.out.println("Removed element->"+ ll.removeLast());
        ll.printList();
        System.out.println(ll.size);
        //search
        System.out.println(ll.iterativeSearch(5));
        System.out.println(ll.iterativeSearch(8));
        //reverse
        ll.reverse();
        ll.printList();
        //remove nth from end
        ll.removeNthFromEnd(2);
        ll.printList();
        //palindrome 
        System.out.println(ll.Palindrome());
    }
}