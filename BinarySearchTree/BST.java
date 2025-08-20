import java.util.*;

public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            //left subtree
            root.left=insert(root.left,val);//insert node to left of root and returns a pointer to the left subtree which we store
        }
        else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
      
    }
    public static Node delete(Node root,int val){
        //search
        if(val>root.data){
            root.right=delete(root.right,val);
        }else if(val<root.data){
            root.left=delete(root.left,val);
        }
        else{
            //case1-leaf node:
            if(root.left==null && root.right==null){
                return null;//we send null to leaf's parent hence subtree of parent now has null and the leaf node gets deleted automatically
            }
            //case2-single child
            if(root.left==null){
                return root.right;//child is in right hence we return it to parent
            }
            else if(root.right==null){
                return root.left;
            }
            //case3-both children
            //find inorder successor
            Node IS=findInorderSuccessor(root.right);//we find it in right part coz IS is leftmost node of right tree
            //replace
            root.data=IS.data;
            //delete
            root.right=delete(root.right,IS.data);//delete inorder successor present in right side of tree

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root) {
        //root null case is not required coz root cannot become null as we have handled it in case2 of delete fnx (ie root.right==null) 
        while(root.left!=null){
            root=root.left;
          }
          return root;
    }
    //print in range
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        //c1:between range
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        //c2:elements in leftsubtree only
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }
        //c3:elements in rightsubtree only
        else{
            printInRange(root.right, k1, k2);
        }
    }
    //root to leaf
    public static void root2leaf(Node root, ArrayList<Integer> path ){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
           for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
           }
           System.out.println("null");
        }
        root2leaf(root.left,path);
        root2leaf(root.right,path);
        path.remove(path.size()-1);
        
    }
    //validate BST
    public static boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && min.data>=root.data){
            return false;
        }
        if(max!=null && max.data<=root.data){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right, root, max);
    }
    //MIRROR BST
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
        Node lefts=mirrorBST(root.left);
        Node rights=mirrorBST(root.right);
        root.left=rights;
        root.right=lefts;
        return root;
    }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        ArrayList<Integer> path =new ArrayList<>();
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.print("Inorder:");
        inorder(root);
        System.out.println();
        System.out.println("Search:"+search(root,11));
        System.out.print("After Deleting:");
        // delete(root, 1);
        // inorder(root);
        System.out.println();
        System.out.print("Print in range:");
        printInRange(root, 5, 12);
        System.out.println();
        System.out.println("Root to leaf:");
        root2leaf(root,path);
        System.out.print("Validate Bst:");
        if(isValid(root, null, null)){
            System.out.print("Valid");
        }else{
            System.out.print("Not Valid");
        }
        System.out.println();
       root = mirrorBST(root);
       System.out.print("Mirror inorder: ");
       inorder(root);
       System.out.println();

    }
}