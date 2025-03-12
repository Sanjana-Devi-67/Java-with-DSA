import java.util.ArrayList;
public class operations{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add elements->O(1)
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(22);
        list.add(12);
        System.out.println(list);
        //get element->O(1)
        int ele=list.get(2);
        System.out.println(ele);
        //remove element->O(n)
        list.remove(2);
        System.out.println(list);
        //set element->O(n)
        list.set(2,10);
        System.out.println(list);
        //contains->O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(7));
        //adding element at index->O(n)
        list.add(1,9);
        System.out.println(list);
        //size
        System.out.println("size:"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //reverse
        System.out.println("Reverse of list");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}