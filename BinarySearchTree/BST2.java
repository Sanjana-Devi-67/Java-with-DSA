
import java.util.*;

public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //sorted arr to BST
    public static Node createBST(int[] arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    //balanced Bst
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static Node createBSTforBalanced(ArrayList<Integer> arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBSTforBalanced(arr,st,mid-1);
        root.right=createBSTforBalanced(arr,mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer> arr=new ArrayList<>();
        getInorder(root, arr);
        //sorted arr->Balanced BST
        root=createBSTforBalanced(arr, 0, arr.size()-1);
        return root;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=createBST(arr, 0, arr.length-1);
        System.out.print("Sorted arr to BST:");
        preorder(root);
        System.out.println();
        Node root1=new Node(8);
        root1.left=new Node(6);
        root1.left.left=new Node(5);
        root1.left.left.left=new Node(3);
        root1.right=new Node(10);
        root1.right.right=new Node(11);
        root1.right.right.right=new Node(12);
        System.out.print("Balanced BST:");
        root=balancedBST(root);
        preorder(root);
        System.out.println();
    }
}

