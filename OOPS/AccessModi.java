package OOPS;

public class AccessModi {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.username="Aryan";
        acc.setPassword("abcdefghijklmnopqrstuvwxyz");
        System.out.println(acc.username);
    }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
