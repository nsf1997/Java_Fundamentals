/**
面向对象


面向过程：c语言
面向对象：c++，java

特征：	封装性：内部操作对外部不可见。
		继承性：在已有结构的基础上继续进行功能的扩充。
		多态性：在继承性的基础上，进行类型的转换处理。

开发步骤：	OOA(Object-Oriented Analysis):面向对象分析
			OOD(Object-Oriented Design)：面向对象设计
			OOP(Object-Oriented Programming)：面向对象编程
*/

/**
类与对象

类是对某一事物共性的抽象概念，而对象描述的是一个具体的产物。
类是一个模版，对象是类可以使用的实例。
先有类，再有对象。
	
	类：	成员属性(Field)：又称属性。
		操作方法(Method):定义对象具有的处理行为。

*/
package day02.Introduction;

class Person{//定义一个类
	String name;
	int age;//定义两个属性
	public void tell(){//定义方法
		System.out.println(name+"."+age);

	}
}
/**
类与对象的定义及使用

类使用class来定义，属性定义具体的变量，方法就是可以重复执行的代码;

声明并实例化对象：类名称 对象名称 = new 类名称();
分步骤完成：
	·声明对象：类名称 对象名称 = null；
	·实例化对象：对象名称 = new 类名称();
当获取了实例化的对象之后，那么就需要通过对象进行类中的操作调用
	·调用类中的属性：实例化对象.成员属性;
	·调用类中的方法：实例化对象.方法名称();

如果程序没有进行对象属性的设置，则该数据内容为其对应数据的默认值;
 

*/
public class Introduction{
	public static void main(String args[]){
		Person per = new Person();//声明并实例化对象
		per.name = "Sam";
		per.age = 23;
		per.tell();
	}
}


