public class firstoccurence {
    public static int fo(int[] a ,int i,int key){
        if(a.length-1==i){
            return -1;
        }
        if(key==a[i]){
            return i;
        }
        return fo(a,i+1,key);
    }
    public static void main(String[] args) {
        int a[]={8,3,6,9,5,10,2,5,3};
        int i=0;
        System.out.println(fo(a,i,5));
    }
}
