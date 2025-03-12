public class substring {
    public static void main(String[] args) {
        String str="HelloWorld";
        int si=0;
        int ei=5;
        String subStr="";
        for(int i=si;i<ei;i++ ){
            subStr+=str.charAt(i);
        }
        System.out.println(subStr);
        //inbuilt
        System.out.print(str.substring(0,5));
    }
}
