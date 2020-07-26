package day04.Case;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析4
 * @author: Sam
 * @create: 2020-07-26 22:26
 */
class Account{
    private String name;
    private double balance;
    public Account(){
    }
    public Account(String name){
        this(name,0.0);
    }
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getInfo(){
        return "账户名称："+this.name+"\t余额："+this.balance;
    }
}
public class Case04 {
    public static void main(String[] args) {
        Account acc= new Account("Sam",1000000);
        System.out.println(acc.getInfo());
        System.out.println(acc.getBalance());
    }
}
