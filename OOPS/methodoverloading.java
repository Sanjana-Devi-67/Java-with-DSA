public class methodoverloading{
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.sum(2,5));
        System.out.println(c.sum(2.5f,6.5f));
        System.out.println(c.sum(2,5,8));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}