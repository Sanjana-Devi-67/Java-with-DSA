public class sumofdigits {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum += digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10250));
    }
}
