public class inheritance{
    public static void main(String args[]){
    //    Fish goldy=new Fish();
    //    goldy.eat();
    //    goldy.breathe();
    //    goldy.swim();
       //multi-level inheritance
         Dog d=new Dog();
         d.eat();
         d.breathe();
         d.color="brown/black";
         System.out.println(d.color);
         d.legs=4;
         System.out.println(d.legs);
         d.feed();
         d.breed="German Shepherd";
         System.out.println(d.breed);
         //heirarchial inheritance
         Fish goldy=new Fish();
         goldy.eat();
         goldy.swim();
         Bird b=new Bird();
         b.breathe();
         b.fly();
    }
}
class Animal {
     String color;
     void eat(){
        System.out.println("eats");
     }
     void breathe(){
        System.out.println("Breathes");
     }
}
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims");
//     }
// }
//Multiple inheritance
class Mammal extends Animal{
    int legs;
    void feed(){
        System.out.println("feeds");
    }
}
class Dog extends Mammal{
    String breed;
}

//heirarchial inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}