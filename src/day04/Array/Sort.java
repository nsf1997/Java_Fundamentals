package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 数组排序
 * @author: Sam
 * @create: 2020-07-27 14:57
 */
class BubbleSort{
    public static void sort(int[] data){
        for(int x=0;x<data.length-1;x++) {
            for (int y = 0; y < data.length -x- 1; y++) {
                if (data[y] > data[y + 1]) {
                    data[y] = data[y] + data[y + 1];
                    data[y + 1] = data[y] - data[y + 1];
                    data[y] = data[y] - data[y + 1];
                }
            }
        }
    }
    public static void printArray(int[] temp){
        for (int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"\t");
        }
    }
}
public class Sort {
    public static void main(String[] args) {
        int[] data = new int[]{8,9,0,2,3,5,10,7,6,1};
        BubbleSort.sort(data);
        BubbleSort.printArray(data);
    }



}
