public class selection{
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        int min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
           
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
}