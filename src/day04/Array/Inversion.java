package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 数组反转
 * @author: Sam
 * @create: 2020-07-27 14:57
 */
class ArrayInversion{
    public static void inversion(int[] data){
        for (int y = 0; y < data.length/2; y++) {
            data[y] = data[y] + data[data.length-1-y];
            data[data.length-1-y] = data[y] - data[data.length-1-y];
            data[y] = data[y] - data[data.length-1-y];
        }

    }
    public static void printArray(int[] temp){
        for (int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"\t");
        }
    }
}
public class Inversion {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5,6,7,8,9,10};
        /*int[] temp = new int[data.length];
        for(int x=0;x<data.length;x++){
            temp[data.length-1-x]=data[x];
        }
        data=temp;*/
        ArrayInversion.inversion(data);
        ArrayInversion.printArray(data);
    }



}
