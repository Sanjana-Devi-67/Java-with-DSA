public class accessmodifier{
    public static void main(String[] args) {
        BankAccount myAcc=new BankAccount();
        myAcc.username="Alice";
        // myAcc.password="abcdefg"; ->gives error since its declared as private (The field BankAccount.password is not visible ,The field BankAccount.password is not visible)
        myAcc.setPassword("abcdef");
        System.out.println("name:"+myAcc.username);
        // System.out.println("password:"+myAcc.password);//error we can only set password we cant access it or print it
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }

}