package day03.thisKeyword;

/**
 * 调用本类属性，一定要加this
 *
 * 构造方法必须在实例化新对象的时候调用，所以“this()”的语句必须放在构造方法的首行
 * 构造方法互相调用时，请保留有程序的出口，别形成死循环
 */
class Person{
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name){
        this();
        this.name = name;
    }
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    //setter and getter省略
    public void tell(){
        System.out.println("姓名："+this.name+"年龄"+this.age);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Person per = new Person("Sam",23);
        per.tell();
    }
}
