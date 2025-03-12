public class methodoverriding{
    public static void main(String[] args) {
         Deer d=new Deer();
         Animal a=new Animal();
         d.eat();
         a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("Eats grass");
    }
} 