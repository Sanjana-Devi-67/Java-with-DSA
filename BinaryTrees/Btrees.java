import java.util.*;
public class Btrees{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        //level order traversal
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){//last node
                       break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        //height of tree
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        //count of nodes
        public static int countofnode(Node root){
            if(root==null){
                return 0;
            }
            int lcount=countofnode(root.left);
            int rcount=countofnode(root.right);
            return lcount+rcount+1;
        }
        //sum of nodes
        public static int sumofnodes(Node root){
            if(root==null){
                return 0;
            }
        
            int lsum=sumofnodes(root.left);
            int rsum=sumofnodes(root.right);
            return lsum+rsum+root.data;
        }
        //diameter of tree -> Approach 1
        public static int diam(Node root){
            if(root==null){
                return 0;
            }
            int ldiam=diam(root.left);
            int rdiam=diam(root.right);
            int lh=height(root.left);
            int rh=height(root.right);
            int selfdiam=lh+rh+1;
            int max1=Math.max(ldiam,rdiam);
            return Math.max(max1,selfdiam);
            //or
            //return Math.max(selfdiam,Math.max(ldiam,rdiam));
        }
        //diameter->(Approach 2)
        static class Info{
            int diam;
            int ht;
            Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info diameter(Node root){
            if(root==null){
                return new Info(0,0); 
            }
            Info leftinfo=diameter(root.left);
            Info rightinfo=diameter(root.right);
            int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
            int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
            return new Info(diam,ht);
        }
        //subTree
        public static boolean isIdentical(Node root,Node subRoot){
            if(root==null && subRoot==null){
                return true;
            }
            else if(root==null || subRoot==null || root.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(root.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(root.right, subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubTree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            //match subroot with tree root 
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            // boolean leftAns=isSubTree(root.left, subroot);//if its in left subtree->true
            // boolean rightAns=isSubTree(root.right, subroot);
            // return leftAns||rightAns;
            return isSubTree(root.left, subroot)||isSubTree(root.right, subroot);
        }
        //top&bottom view of a tree
        static class Info1{
            Node node;
            int hd;
            public Info1(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        //top view
        public static void topView(Node root){
            //level order traversal
            Queue<Info1> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0;
            int max=0;
            q.add(new Info1(root, 0));
            q.add(null);
            while(!q.isEmpty()){
                Info1 curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){//first occurence of hd
                        map.put(curr.hd,curr.node);
                    }
                    if(curr.node.left!=null){
                        q.add(new Info1(curr.node.left, curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new Info1(curr.node.right, curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    }
                }
              
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
            
        }
        //bottom view
        public static void bottomView(Node root){
            //level order traversal
            Queue<Info1> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0;
            int max=0;
            q.add(new Info1(root, 0));
            q.add(null);
            while(!q.isEmpty()){
                Info1 curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    map.put(curr.hd,curr.node);//we have to overwrite the occurence incase of bottom view
                    if(curr.node.left!=null){
                        q.add(new Info1(curr.node.left, curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new Info1(curr.node.right, curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    }
                }
              
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
            
        }
        //Kth level of tree
        public static void kLevel(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(k==level){
                System.out.print(root.data+" ");
                return;
            }
            kLevel(root.left,level+1,k);
            kLevel(root.right,level+1,k);
        }
       //kth level using level order
       public static void klevello(Node root, int k) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=1;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null) {
                level++; // we finished one level
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(level == k){
                    System.out.print(currNode.data + " ");
                }
               if(currNode.left != null){
                    q.add(currNode.left);
                }
               if(currNode.right != null){
                    q.add(currNode.right);
                }
              }
           }
        }
        //lowest common ancestor->Approach1
        public static boolean getPath(Node root,int n,ArrayList<Node> path){
              if(root==null){
                return false;
              }
              path.add(root);
              if(root.data==n){
                return true;
              }
              boolean foundleft=getPath(root.left, n, path);
              boolean foundright=getPath(root.right, n, path);
              if(foundleft || foundright){
                return true;
              }
              path.remove(path.size()-1);//remove the current root whose children does not match n as it indicates its not part of the path
              return false;
            }
        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();
            getPath(root,n1,path1);//stores path from root to n1 in path1 arraylist
            getPath(root,n2,path2);
            //lca
            int i=0;
            for(; i<path1.size() && i<path2.size(); i++){
                if(path1.get(i)!=path2.get(i)){
                     break;
                }
            }
            //last equal node will be at i-1th index
            Node lca=path1.get(i-1);
            return lca;
        }
         //lowest common ancestor->Approach2
         public static Node lca2(Node root,int n1,int n2){
              if (root == null) {
                  return null;
              }
            if(root.data==n1 || root.data==n2){
                return root;
            }
            //find lca in left subtree
            Node leftlca=lca2(root.left, n1, n2);
            //find lca in right subtree
            Node rightlca=lca2(root.right, n1, n2);
            //case1:left lca valid value & right lca is null
            if(rightlca==null){
                return leftlca;
            }
             //case2:right lca valid value & left lca is null
             if(leftlca==null){
                return rightlca;
            }
            //case3:no null->one subtree has n1 and another has n2
            return root;
        }
        //minimum distance b/w nodes
        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=lcaDist(root.left,n);
            int rightDist=lcaDist(root.right,n);
            if(leftDist==-1 && rightDist==-1){
                return -1;
            }else if(leftDist==-1){
                return rightDist+1;
            }else{
                return leftDist+1;
            }
        }
        public static int miniDist(Node root,int n1,int n2){
            Node lca=lca2(root,n1,n2);//gives lca
            //function to find distance from lca to node
            int dist1=lcaDist(lca,n1);
            int dist2=lcaDist(lca,n2);
            return dist1+dist2;
        }
        //kth ancestor of node
        public static int KAncestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=KAncestor(root.left, n, k);
            int rightDist=KAncestor(root.right, n, k);
            if(leftDist==-1 && rightDist==-1 ){
                return -1;
            }
            //we take max of the both which we get as valid value
            int max=Math.max(leftDist,rightDist);
            //to check if it is the kth ancestor
            if(max+1==k){
                 System.out.println(root.data);
            }
            return max+1;
        }
        //sum tree
        public static int SumTree(Node root){
            if(root==null){
                return 0;
            }
            int leftChild=SumTree(root.left);
            int rightChild=SumTree(root.right);
            int data=root.data;
            int newLeft=root.left==null?0:root.left.data;
            int newRight=root.right==null?0:root.right.data;
            root.data=newLeft+leftChild+newRight+rightChild;
            return data;
        }
    }
      public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes1[]={2,4,-1,-1,5,-1,-1};
        BinaryTree tree1=new BinaryTree();
        BinaryTree.idx = -1; //every time you build a new tree, reset idx = -1 first, coz its static and idx will be increased to end of array
        Node subRoot=tree1.buildTree(nodes1);
        BinaryTree tree=new BinaryTree();
        BinaryTree.idx = -1;
        Node root=tree.buildTree(nodes);
        System.out.println("Root="+root.data);
        System.out.print("PreOrder: ");
        tree.preorder(root);
        System.out.print("\nInOrder: ");
        tree.inorder(root);
        System.out.print("\nPostOrder: ");
        tree.postorder(root);
        System.out.println("\nLevel order Traversal");
        tree.levelorder(root);
        // tree1.levelorder(subRoot);
        System.out.println("Height="+tree.height(root));
        System.out.println("Count of nodes="+tree.countofnode(root));
        System.out.println("Sum of nodes="+tree.sumofnodes(root));
        System.out.println("Diameter(Approach 1)="+tree.diam(root));
        System.out.println("Diameter(Approach 2)="+tree.diameter(root).diam);
        System.out.println("Subtree exists in main tree?="+tree.isSubTree(root, subRoot));
        System.out.print("Top view of tree: ");
        tree.topView(root);
        System.out.print("Bottom view of tree: ");
        tree.bottomView(root);
        System.out.print("Kth level of tree: ");
        tree.kLevel(root,1,3);
        System.out.println();
        System.out.print("Kth level of tree usin level order: ");
        tree.klevello(root,2);
        System.out.println();
        int n1=4;
        int n2=5;
        System.out.print("Lowest common ancestor approach1:"+tree.lca(root, n1, n2).data);
        System.out.println();
        System.out.print("Lowest common ancestor approach2:"+tree.lca2(root, n1, n2).data);
        System.out.println();
        System.out.print("Minimum distance between nodes:"+tree.miniDist(root, 4, 6));
        System.out.println();
        System.out.print("Kth Ancestor:");
        tree.KAncestor(root, 5, 2);
        System.out.print("Sum Tree:");
        tree.SumTree(root);
        tree.preorder(root);
    }
}