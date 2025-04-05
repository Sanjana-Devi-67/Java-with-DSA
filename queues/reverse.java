import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        for(int i = 1; i <=5; i++) {
            q.add(i);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}