package day04.Case;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析3
 * @author: Sam
 * @create: 2020-07-26 22:20
 */
class Dog{
    private String name;
    private String color;
    private int age;

    public Dog(){

    }
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo(){
        return "姓名："+this.name+"\t颜色："+this.color+"\t年龄："+this.age;
    }
}
public class Case03 {
    public static void main(String[] args) {
        Dog dog = new Dog("Ohayo","Black",3);
        System.out.println(dog.getInfo());
    }
}
