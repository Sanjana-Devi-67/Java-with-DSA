public class classesandobjects{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="Blue";
        p1.tip=5;
        System.out.println("Color:"+p1.color);
        System.out.println("Tip:"+p1.tip);
        p1.changecolor("Purple");
        p1.changeTip(6);
        System.out.println("Changed Color:"+p1.color);
        System.out.println("Changed Tip:"+p1.tip);
    }
}
class Pen{
    String color;
    int tip;
    void changecolor(String newColor){
        color=newColor;
    }
    void changeTip( int newTip){
        tip=newTip;
    }
}