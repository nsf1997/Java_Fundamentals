package day04.Reference;

/**
 * @program: Java_Fundamentals
 * @description: 类关联结构
 * @author: Sam
 * @create: 2020-07-27 22:30
 */
class Person{
    private String name;
    private int age;
    private Car car;//一个人只有一辆车
    private Person children[];//一个人有多个孩子

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setChildren(Person children[]){
        this.children=children;
    }
    public Person[] getChildren(){
        return this.children;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }
    public String getInfo(){
        return "姓名："+this.name+"年龄："+this.age;
    }
}
class Car{
    private String name;
    private double price;
    private Person person;
    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void setPerson(Person person){
        this.person = person;
    }
    public Person getPerson(){
        return this.person;
    }
    public String getInfo(){
        return "汽车品牌："+name+"价格："+price;
    }
}

public class ClassAssociateArchitecture {
    public static void main(String[] args) {
        //第一步：声明对象并且设置彼此的关系
        Person per = new Person("Sam",23);
        Person childA = new Person("Jackson",17);
        Person childB = new Person("Angela",13);
        childA.setCar(new Car("BMW",1000000));
        childB.setCar((new Car("Ferrari",2000000)));
        Car car = new Car("Audi",400000.00);
        per.setCar(car);
        car.setPerson(per);
        //第二部：根据关系获取数据
        /*Car c = per.getCar();
        c.getInfo();*/
        System.out.println(per.getCar().getInfo());
        System.out.println(car.getPerson().getInfo());

        for(int x = 0; x<per.getChildren().length;x++){
            System.out.println(per.getChildren()[x].getInfo());
            System.out.println(per.getChildren()[x].getCar().getInfo());
        }
    }
}
