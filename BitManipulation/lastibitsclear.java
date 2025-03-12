public class lastibitsclear{
    public static void main(String[] args) {
        int n=15;
        int i=2;
        int bitMask=(-1<<i); //or (~0)<<i
        System.out.println(n & bitMask);
    }
}