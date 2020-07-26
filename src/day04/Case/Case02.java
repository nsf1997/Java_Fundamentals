package day04.Case;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析2
 * @author: Sam
 * @create: 2020-07-26 18:12
 */
class Employee{
    private double id;
    private String name;
    private double salary;
    private double rate;

    public Employee(double id,String name,double salary,double rate){
        this.id = id;
        this.name= name;
        this.salary = salary;
        this.rate = rate;
    }
    public double salaryIncreaseValue(){
        return this.salary*rate;
    }
    public double salaryIncrease(){
        this.salary = this.salary*(this.rate+1);
        return this.salary*(this.rate+1);
    }
    public String getInfo(){
        return "编号："+id+
                "\t姓名："+name+
                "\t基本薪水："+salary+
                "\t工资增长率："+rate;
    }


}
public class Case02 {
    public static void main(String[] args) {
        Employee emp = new Employee(10000,"Sam",3000,0.3);
        System.out.println(emp.getInfo());
        System.out.println("工资调整额度："+emp.salaryIncreaseValue());
        System.out.println("上调后的工资："+emp.salaryIncrease());


    }

}
