public class decimaltobinary {
    public static void dectobi(int decNum){
        int power=0;
        int bin=0;
        while(decNum>0){
                int rem=decNum%2;
                bin=bin+(rem*(int)Math.pow(10,power));
                power++;
                decNum=decNum/2;
        }
            System.out.println(bin);
        }
     public static void main(String[] args) {
            dectobi(163);
            dectobi(15);
    }
}
