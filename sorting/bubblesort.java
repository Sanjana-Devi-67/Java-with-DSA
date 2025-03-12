public class bubblesort{
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            // swap=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // swap++;  
                }
            }
            // if(swap==0){
            //     System.out.println("Already sorted");
            //     return;
            // }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}