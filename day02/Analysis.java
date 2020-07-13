/**
 对象内存分析

 Java之中类属于引用数据类型，引用数据类型最大的困难之处在于进行内存的管理。同时在进行操作的时候会存在内存关系的变化。

 两块最为常用的内存空间
 ·堆内存：保存的是对象的具体信息，在程序之中堆内存空间的开辟，是通过new完成的
 ·栈内存：保存的是一块堆内存的地址。即：通过地址找到栈内存，而后找到对象内容
 */
public class Analysis{
    public static void main(String args[]){
        Person per = null;//定义栈的名称 声明对象
        per= new Person();//开辟新的堆内存 实例化对象
        Person per2 = per;//引用传递
        per2.age=80;
        per.name = "Sam";
        per.age = 23;//赋值
        change(per);//等价于Person temp = per；
        per.tell();
    }
    public static void change(Person temp){
        temp.age=80;
    }
}
class Person{
    String name;
    int age;//定义堆的内容
    public void tell(){
        System.out.println(name+"."+age);

    }
}
/**
 所有的对象在调用类中的属性或方法的时候必须要实例化完成后才可以执行
 */

//Exception in thread "main" java.lang.NullPointerException 代码中只是生命了对象，但是没有为对象进行实例化。NullPointerException（空指向异常）就是在没有开辟堆内存时所产生的问题。并且只有引用数据类型存在此问题。

/**
 对象引用分析

 同一块堆内存间可以被不同的栈内存所指向，也可以更换指向。
 */

 /**
 引用传递与垃圾产生分析

    垃圾空间：没有任何栈内存所指向的堆内存空间，将被GC（Garbage Collector）不定期进行回收并且释放无用内存空间。

    一个栈内存只能够保存有一个堆内存的地址数据，如果发生更改，则之前的地址数据将从此栈内存中彻底消失。
 */