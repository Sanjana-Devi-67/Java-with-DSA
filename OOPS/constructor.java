public class constructor{
    public static void main(String[] args) {
        // Student s1=new Student("Sanjana");
        Student s1=new Student();
        Student s2=new Student("Sanjana");
        Student s3=new Student(101);
       
    }
}
class Student{
    String name;
    int roll;
    //to initialize student we create a constructor
    // Student(String name){
    //    this.name=name;
    // }
    //nonparameterized
    Student(){
        System.out.println("Constructor is called...");
     }
     //parameterized
    Student(String name){
       this.name=name;
    }
    Student(int roll){
        this.roll=roll;
     }
}