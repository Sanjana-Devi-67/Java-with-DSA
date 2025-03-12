public class linearsearch{
    public static int linear(int[] num,int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        // for(int i=0;i<number.length;i++){
        //     if(number[i]==key){
        //         System.out.print(i);
        //         break;
        //     }
        // }
        System.out.println(linear(number,key));
    }
}