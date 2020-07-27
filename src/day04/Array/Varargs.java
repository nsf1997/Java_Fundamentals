package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 可变参数
 * @author: Sam
 * @create: 2020-07-27 16:15
 */
class Sum{
    public static int sum(int ...data){
        int sum=0;
        for(int temp:data){
            sum+=temp;
        }
        return sum;
    }
    public static void printArray(int[] temp){
        for (int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"\t");
        }
    }
}
public class Varargs {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        System.out.println(Sum.sum(data));
    }
}
