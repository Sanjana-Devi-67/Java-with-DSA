public class binarystring {
    public static void binary(int n,int lastplace,String str){
        //basecase
        if(n==0){
            System.out.println(str);
            return;
        }

        //work
        // if(lastplace==0){
        //     //place 0 on position n
        //     binary(n-1,0,str.append("0"));
        //     //place 1 on position n
        //     binary(n-1,1,str.append("1"));
        // }else{
        //     binary(n-1,0,str.append("0"));//if lastplace=1 we can only place 0 and not 1
        // }

                      //or
        binary(n-1,0,str+"0");
        if(lastplace==0){
            binary(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        String str="";
        binary(3, 0, str);
        //or binary(3,0,"");
    }
}
