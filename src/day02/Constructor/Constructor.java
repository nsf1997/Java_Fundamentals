package day02.Constructor;
/**
 可以通过构造方法实现实例化对象中的属性初始化
 ·方法名称必须与类名称保持一致
 ·构造方法不允许设置任何的返回值类型，即没有返回值定义
 ·构造方法是在使用关键字new实例化对象时候自动调用
 */
class Message{
    private String title;
    public Message(String t){
        title = t;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
}
class Person{
    private String name;
    private int age;
    //方法名称与类名称相同，并且无返回值定义
    public Person(String n, int a) {//定义有参构造
        name = n; //为类中的属性赋值（初始化）
        age = a;
    }
    public void tell(){
        System.out.println(name + "、" + age);
    }
}

public class Constructor{
    public static void main(String args[]){
        Person per = new Person("Sam",23);
        per.tell();
    }
}
/**
 * 当前对象实例化与之前的对象实例化对比
 * Person per = new Person();
 * "Person":主要是定义对象的所属类型，类型决定你可以调用的方法；
 * "per"：实例化对象的名称，所有的操作通过对象来进行访问；
 * "new"：开辟新的堆内存空间
 * "Person("Sam",23)"：调用有参构造 Person()：调用无参构造
 *
 * 一个类至少存在有一个构造方法
 *
 * 普通方法与构造方法的区别：
 * 构造方法在类对象实例化的时候调用，普通方法在类独享实例化后调用
 *
 * 构造方法重载
 * setter不仅可以设置数据还可以修改数据
 *
 * 匿名对象
 * 可以通过new 类名称()进行设置， 但是由于此对象没有任何的引用名称，所以该对象使用一次就会被gc当做垃圾进行回收与释放
 *
 *
 */

