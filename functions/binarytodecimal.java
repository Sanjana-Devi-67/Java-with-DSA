public class binarytodecimal {
    public static void bitodec(int biNum){
        int power=0;
        int decNum=0;
        while(biNum>0){
            int digit=biNum%10;
            decNum=decNum+(digit*(int)Math.pow(2,power));
            power++;
            biNum=biNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
       bitodec(10100011);
    }
}
