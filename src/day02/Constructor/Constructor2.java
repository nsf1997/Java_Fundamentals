package day02.Constructor;

/**
 * 构造方法内存分析
 */
class Message{
    private String title;
    public Message(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
}
class Person2{
    private String name;
    private int age;
    public Person2(Message msg, int a) {
        name = msg.getTitle();
        age = a;
    }
    public Message getInfo(){
        return new Message(name+"---"+age);
    }
}

public class Constructor2{
    public static void main(String args[]){
        Message msg = new Message("mldn");
        Person2 per = new Person2(msg,23);
        msg = per.getInfo();
        System.out.println(msg.getTitle());

    }
}