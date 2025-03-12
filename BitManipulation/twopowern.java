public class twopowern{
    public static void main(String[] args) {
        int n=8;
        int res=n&(n-1);
        if(res==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}