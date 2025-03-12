public class prac3 {
    public static int len(String str,int idx){//count
        //   if(str.length()==idx || str.length()==0){
        //     return count;
        //   }
        //   return len(str,idx+1,count+1);
        //or
        if (idx == str.length()) {
            return 0;
        }
        return 1 + len(str, idx + 1);
    }

   public static void main(String[] args) {
       String str="Sanjana";
    //    int count=0;
    //    System.out.println(len(str,0,count));
       System.out.println(len(str,0));
   } 
}
