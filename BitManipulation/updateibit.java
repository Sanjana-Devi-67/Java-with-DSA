public class updateibit{
    public static int clearibit(int n,int i){
        int bitMask=~(1<<i);
        return  n & bitMask;
    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        int val=1;
        n=clearibit(n, i);
        int bitMask=val<<i;
        System.out.println(n|bitMask);
     }
} 