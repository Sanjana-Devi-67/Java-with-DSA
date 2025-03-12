public class reverse {
    public static void rev(int num[]){
        //swapping starting and ending index
        int start=0;
        int end=num.length-1;
        while(start<end){
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
         
    public static void main(String[] args) {
        int[] num={2,4,6,8,10,12,56,45,21,9,7};
        //taking a new array
        // int[] num1=new int[num.length];
        // for(int i=0;i<num.length;i++){
        //     num1[i]=num[(num.length-1)-i];
        // }
        // num=num1;
       rev(num);
       for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
         }


    }
}
