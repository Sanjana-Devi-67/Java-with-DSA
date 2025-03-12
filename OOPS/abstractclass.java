public class abstractclass{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();    
        h.walk();
        // System.out.println("color before changing:"+h.color);
        // h.changeColor();
        // System.out.println("color after changing:"+h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        // System.out.println("color before changing:"+c.color);
        // c.changeColor();
        // System.out.println("color after changing:"+c.color);
        Mustang m=new Mustang(); //animal->horse->mustang
    }
}
abstract class Animal{
      String color;
      Animal(){
        // color="brown";
        System.out.println("Animal constructor called");
      }
     //non-abstract method
     void eat(){
        System.out.println("animal eats");
     }
     abstract void walk();
}
class Horse extends Animal{
    Horse(){
        // color="brown";
        System.out.println("Horse constructor called");
      }
    void changeColor(){
        color="Dark brown";
    }
    void walk(){
        System.out.println("Horse walks");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    Chicken(){
        // color="brown";
        System.out.println("Chicken constructor called");
      }
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Chicken walks");
    }
}