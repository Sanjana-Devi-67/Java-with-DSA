public class doublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //addfirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //addlast
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        tail=newNode;
            //or
        // tail.next=newNode;
        // newNode.prev=tail;
        // tail=newNode;
        
    }
    //remove first
    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        int val=head.data;
        // System.out.println(val);
        head=head.next;
        head.prev=null;
        size--;
    }
    //remove last
    public void removeLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        int val=head.data;
        // System.out.println(val);
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        
        temp.next.prev=null;
        temp.next=null;
        tail=temp;
        size--;
            //or
        // tail.prev.next=null;
        // tail=tail.prev;
        // tail.prev=null;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        System.out.print("null<->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        doublyLL dll=new doublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addlast(5);
        dll.addlast(6);
        dll.addlast(7);
        dll.printList();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.printList();
        dll.removeLast();
        dll.printList();
        System.out.println(dll.size);
        dll.reverse();
        dll.printList();
    }
}
