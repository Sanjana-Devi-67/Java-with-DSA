import java.util.*;
public class reverseStack{
    public static void pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        //stack is empty-> empty stack is alwats reversed
        if(s.isEmpty()){
            return;
        }
        //store top element   
        int top=s.pop();
        //call for next level
        reverse(s);
        //as we come down we push elements in reverse order
        pushatbottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);//3,2,1->this line removes all elements in stack there is nothing to reverse hence we dont call it first
        reverse(s);
        printStack(s);//1,2,3
    }
}