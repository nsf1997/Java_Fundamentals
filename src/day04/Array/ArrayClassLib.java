package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 数组类库
 * @author: Sam
 * @create: 2020-07-27 16:02
 */

/**
 * java.util.Arrays.sort() //排序
 * System.arraycopy(源数组，源数组开始点，目标数组，目标数组开始点，拷贝长度)；
 *
 */
public class ArrayClassLib {
    public static void main(String[] args) {
        int[] dataA = new int []{1,2,3,4,5,6,7,8,9};
        int[] dataB =new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataA,5,dataB,3,3);
        printArray(dataB);
    }
    public static void printArray(int[] temp){
        for (int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"\t");
        }
    }
}
