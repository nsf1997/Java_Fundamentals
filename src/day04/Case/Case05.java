package day04.Case;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析5
 * @author: Sam
 * @create: 2020-07-26 22:31
 */
class User{
    private String uid;
    private String password;
    private static int count = 0;
    public User(){
        this("NoID","NoPass");
    }
    public User(String uid){
        this(uid,"java");
    }
    public User(String uid, String password){
        this.uid=uid;
        this.password=password;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public String getInfo(){
        return "用户名："+this.uid+"\t密码:"+this.password;
    }

}
public class Case05 {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("GOD");
        User user2 = new User("Sam","123456");
        System.out.println(user.getInfo());
        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
        System.out.println(User.getCount());

    }
}
