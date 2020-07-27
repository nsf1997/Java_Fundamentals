package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 对象数组
 * @author: Sam
 * @create: 2020-07-27 18:49
 */

/**
 * 对象驻足的定义：
 *      ·动态初始化：类[] 对象数组名称 = new 类[长度]，每一个元素都是null;
 *      ·静态初始化：类[] 对象数组名称 = new 类[长度]{实例化对象，实例化对象。。。。}；
 *
 * 优势：线性保存，根据索引访问，速度较快
 * 劣势：长度固定
 */
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getInfo(){
        return "姓名："+this.name+"年龄："+this.age;
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        Person[] per = new Person[2];
        per[0] = new Person("Sam",23);
        per[1] = new Person("David",24);
        for(int x=0;x<per.length;x++){
            System.out.println(per[x].getInfo());
        }

    }

}
