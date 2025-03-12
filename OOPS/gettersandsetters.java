public class gettersandsetters{
    public static void main(String[] args) {
        Pen p1=new Pen();
        Pen p2=new Pen();
        p1.setColor("Violet");
        p1.setTip(7);
        System.out.println("Color:"+p1.getColor());
        System.out.println("Tip:"+p1.getTip());
        p2.setColor("Magenta");
        p2.setTip(6);
        System.out.println("Color:"+p2.getColor());
        System.out.println("Tip:"+p2.getTip());

    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip( int newTip){
        this.tip=newTip;
    }
}