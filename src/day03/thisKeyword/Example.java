package day03.thisKeyword;

/**
 * @program: Java_Fundamentals
 * @description:构造方法互相调用案例
 * @author: Sam
 * @create: 2020-07-25 21:25
 */
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(){
        this(1000,"无名氏",null,0.0);
    }
    public Employee(int id){
        this(id,"新员工","未定",0.0);
    }
    public Employee(int id,String name,String department){
        this(id,name,department,2500);
    }
    public Employee(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public void getInfo(){
        System.out.println("编号："+this.id+
                "\n姓名："+this.name+
                "\n部门："+department+
                "\n工资："+salary);
    }
}
public class Example {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getInfo();
    }
}
