public class binarysearch {
    public static int binary(int[] num, int key){
           int start=0;
           int end=num.length-1;
           while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(key>num[mid]){
                 start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        // int n=numbers.length;
        // boolean found=false;
        // int min=0;
        // int max=n-1;
        // for(int i=0;i<numbers.length;i++){
        //    int mid=(min+max)/2;
        //    if(key==numbers[mid]){
        //      System.out.println("Key found at index: "+ mid);
        //      found=true;
        //      break;
        //    }
        //    else if(key>numbers[mid]){
        //        min=mid+1;
        //    }
        //    else{
        //        max=mid-1;
        //    }
        // }
        // if(!found){
        //     System.out.println("key not found");
        // }
        int res=binary(numbers, key);
        if(res==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index:"+res);
        }
    }
}
