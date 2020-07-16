package day02.Encapsulation;

public class Encapsulation{
    public static void main(String args[]){
        Person per = new Person();
        per.setName("Sam");
        per.setAge(23);
        change(per);
        per.tell();
    }
    public static void change(Person temp){
        temp.setAge(80);
    }
}
class Person{
    private String name;
    private int age;
    public void tell(){
        System.out.println(name+"."+age);
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age =a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
/**
 设置属性：set
 获取属性：get
 类中的所有属性都用private进行封装，如果访问属性必须提供setter、getter；
 */

