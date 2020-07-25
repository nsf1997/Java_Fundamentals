package day03.Block;

/**
 * @program: Java_Fundamentals
 * @description: 构造代码块
 * @author: Sam
 * @create: 2020-07-25 23:52
 */

/**
 * 构造块定义在一个类之中
 * 构造块会优先于构造方法执行，并且每一次实例化新对象的时候都会调用构造块中的代码
 */
class Person{
    public Person(){
        System.out.println("【构造方法】");
    }
    {
        System.out.println("【构造块】");
    }
}
public class ConstructorBlock {
    public static void main(String[] args) {
        new Person();
    }
}
