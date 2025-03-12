public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("a="+a+" "+"b="+b);
    }
}
