package day03.StaticKeyword;

/**
 * @program: Java_Fundamentals
 * @description: static 应用
 * @author: Sam
 * @create: 2020-07-25 23:12
 */
class Book{
    private String title;
    private static int count = 1;
    public Book(){
        this("NoTitle-"+count++);
    }
    public Book(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
}
public class Example {
    public static void main(String[] args) {
        System.out.println(new Book("Java").getTitle());
        System.out.println(new Book().getTitle());
        System.out.println(new Book("Python").getTitle());
    }

}
