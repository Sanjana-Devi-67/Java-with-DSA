import java.util.*;
public class deque {
    public static void main(String[] args) {
       Deque<Integer> dq=new LinkedList<>();
       dq.addFirst(1);//1
       dq.addFirst(2);//2
       dq.addLast(3);
       dq.addLast(4);
       System.out.println(dq);//[2,1]
       System.out.println("first element:"+dq.getFirst());
       System.out.println("Last element:"+dq.getLast());
       dq.removeFirst();
       dq.removeLast();
       System.out.println(dq);
       
    }
}
