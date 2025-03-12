public class interfaceex{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        Bear b=new Bear();
        b.predator();
        b.diet();
    }
}
//multiple inheritance
interface Herbivore{
  void diet();
}
interface Carnivore{
  void predator();
}
class Bear implements Herbivore,Carnivore{
  public void diet(){
    System.out.println("It eats fish, honey, and other things");
  }
  public void predator(){
    System.out.println("It is a predator");
  }
}
//total abstraction
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
      public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal-(in all 4 directions)");
      }
}
class Rook implements ChessPlayer{
    public void moves(){
      System.out.println("Up, Down, Right, Left");
    }
}
class King implements ChessPlayer{
    public void moves(){
      System.out.println("Up, Down, Right, Left, Diagonal-(By 1 step)");
    }
}
