package day04.Array;

import java.lang.reflect.Array;

/**
 * @program: Java_Fundamentals
 * @description: 数组与方法
 * @author: Sam
 * @create: 2020-07-27 14:45
 */
class ArrayUtil{
    private int sum;
    private double avg;
    private int max;
    private int min;
    public ArrayUtil(int[] temp){
        this.max =temp[0];
        this.min =temp[0];
        for (int i=0;i<temp.length;i++){
            this.sum += temp[i];
            if(temp[i]>max){
                this.max = temp[i];
            }
            if(temp[i]<min){
                this.min = temp[i];
            }
        }
        this.avg = sum/temp.length;
    }
    public int getSum(){
        return this.sum;
    }
    public double getAvg(){
        return this.avg;
    }
    public int getMax(){
        return this.max;
    }
    public int getMin(){
        return this.min;
    }

}
public class Method {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        ArrayUtil util = new ArrayUtil(data);
        System.out.println("和："+util.getSum());
        System.out.println("平均值："+util.getAvg());
        System.out.println("最大值："+util.getMax());
        System.out.println("最小值："+util.getMin());
    }
}
