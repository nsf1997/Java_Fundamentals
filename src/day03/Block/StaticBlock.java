package day03.Block;

/**
 * @program: Java_Fundamentals
 * @description: 静态代码块
 * @author: Sam
 * @create: 2020-07-25 23:57
 */

/**
 * 使用static关键字定义的代码块
 *      主类定义静态块
 *      其他定义静态块
 *
 * 静态代码块会优先于构造块和主方法执行，并且不管有多少个实例化对象出现，静态代码块只会执行一次，静态代码块主要目的是为了类中的静态属性初始化
 */
class Message{
    public static String getCountry(){
        return "中华人民共和国";
    }
}
class Country{
    private static String country;
    static{
        //可能有很多语句要执行
        country =Message.getCountry();
        System.out.println(country);
    }
}
class Book{
    public Book(){
        System.out.println("【构造方法】");
    }
    {
        System.out.println("【构造块】");
    }
    static{
        System.out.println("【静态代码块】");
    }
}
public class StaticBlock {
    static{
        System.out.println("******************");
    }
    public static void main(String[] args) {
        new Book();
        new Book();
        new Book();
        new Country();
    }
}