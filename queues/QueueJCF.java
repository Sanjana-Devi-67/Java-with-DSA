import java.util.*;
public class QueueJCF {
    public static void main(String[] args) {
        //linkedlist
        Queue<Integer> q=new LinkedList<>();//or ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
        }
        //ArrayDeque
        Queue<Integer> q1=new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        while(!q1.isEmpty()){
          System.out.println(q1.peek());
          q1.remove();
        }
    }
}
