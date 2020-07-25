package day03.StaticKeyword;

/**
 * @program: Java_Fundamentals
 * @description: 声明static属性方法
 * @author: Sam
 * @create: 2020-07-25 21:57
 */


/**
 * static 属性可以由类名称直接调用
 * static 属性虽然定义在类之中，但是其并不受到类实例化对象控制，static属性可以在没有实例化对象的时候使用
 * 进行类设计的时候首选的一定是非static属性（95%），而考虑到公共信息存储的时候才会使用到static属性（5%）；
 * 非static必须在实例化对象产生之后才可以使用，而static可以再没有实例化对象产生的情况下直接通过类名称进行调用
 *
 * static 方法只允许调用static属性或static方法；
 * 非static方法允许调用static属性或static方法；
 *
 * static定义的方法或者是属性都不是代码编写之初所需要考虑的内容，只有在回避实例化对象调用并且描述公共属性的情况下才会考虑使用static定义的方法或者是属性
 */
class  Person{
    private String name;
    private int age;
    static String country = "中华民国";
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getInfo(){
        return "姓名："+name+
                "\n年龄："+age+
                "\n国家："+country;
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Person perA = new Person("Sam",10);
        Person perB = new Person("David",11);
        Person perC = new Person("Jason",12);
        Person.country = "中华人民共和国";//static 属性可以由类名称直接调用
        System.out.println(perA.getInfo());
        System.out.println(perB.getInfo());
        System.out.println(perC.getInfo());

/*
        System.out.println(Person.country);
        Person.country = "中华人民共和国";//static 属性可以由类名称直接调用
*/
    }

}
