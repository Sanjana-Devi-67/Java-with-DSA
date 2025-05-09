public class countingsort{
    public static void main(String[] args){
        int largest=Integer.MIN_VALUE;
        int arr[]={1,4,1,3,2,4,3,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            largest=Math.max(arr[i],largest);
        }
        int[] count=new int[largest+1]; 
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}