public class prac1{
    public static void find(int[] a,int key,int idx){
        if(idx==a.length){
            return;
        }
        if(a[idx]==key){
            System.out.print(idx+" ");
        }
        find(a,key,idx+1);
        
    }
    public static void main(String args[]){
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        find(arr,key,0);
    }
}
