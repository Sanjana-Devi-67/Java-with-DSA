public class statickeyword{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="Madonna";
        Student s2=new Student();
        System.out.println(s2.schoolName);
        Student s3=new Student();
        s3.schoolName="abc";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
    }
}
class Student{
    int roll;
    String name;
    static String schoolName;
    static int percentage(int C,int M,int P)  {
        return (C+M+P)/3;
    }  
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}