package day04.Case;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析6
 * @author: Sam
 * @create: 2020-07-26 22:42
 */
class Book{
    private String title;
    private int bid;
    private double price;
    private static int count = 1;
    public Book(String title,double price){
        this.bid = count++;
        this.title = title;
        this.price = price;
    }
    public static int getCount(){
        return count-1;
    }
    public String getInfo(){
        return "书名："+this.title+
                "\t编号："+bid+
                "\t价格："+price;
    }

}
public class Case06 {
    public static void main(String[] args) {
        Book b1 = new Book("A",15);
        Book b2 = new Book("B",20);
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println(Book.getCount());
    }

}
