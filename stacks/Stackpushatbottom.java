import java.util.*;
public class Stackpushatbottom {
    public static void pushatbottom(Stack<Integer> s,int data){
        //if empty push data
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //store top element
        int top=s.pop();
        //call for next level
        pushatbottom(s, data);
        //add the removed element back to stack 
        s.push(top);
    }
   public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    pushatbottom(s, 4);
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
   } 
}
