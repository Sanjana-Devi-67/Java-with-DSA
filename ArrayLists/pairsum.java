import java.util.ArrayList;
public class pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        int tar=5;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)+list.get(j)==tar){
                    System.out.println("true");
                    return;
                }
            }
            System.out.println("false");
            return;
        }
        
    }
}
