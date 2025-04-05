import java.util.*;
public class stackandqueueusingdq {
    static class Stack{
        Deque<Integer> dq=new LinkedList<>();
        public void push(int data){
             dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    static class Queue{
        Deque<Integer> dq1=new LinkedList<>();
        public void add(int data){
            dq1.addLast(data);
        }
        public int remove(){
            return dq1.removeFirst();
        }
        public int peek1(){
            return dq1.getFirst();
        }
    }
    public static void main(String[] args) {
        //stack
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.println(s.pop()+" ");
        //queue
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek1());
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
    }
}
