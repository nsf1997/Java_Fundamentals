package day03.Block;

/**
 * @program: Java_Fundamentals
 * @description: 普通代码块
 * @author: Sam
 * @create: 2020-07-25 23:49
 */
/**
 * 用于在一个方法之中进行一些结构的拆分，以防止相同变量所带来的影响。
 */
public class CommonBlock {
    public static void main(String[] args) {
        {//普通代码块
            int x = 10;
            System.out.println("x="+x);
        }
        int x = 100;
        System.out.println("x="+x);
    }
}
