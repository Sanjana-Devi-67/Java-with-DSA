public class q1{
    public static void main(String[] args) {
        int arr[]={1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                System.out.print("true");
                return;
               }
            }
        }
        System.out.print("false");
     
    }
}