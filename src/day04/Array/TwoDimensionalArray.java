package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 二维数组
 * @author: Sam
 * @create: 2020-07-27 14:18
 */

/**
 * 二维数组的定义：
 *      ·数组的动态初始化：
 *          -数据类型 [][]数组名称 = new 数据类型[行个数][列个数]；
 *      ·数组的静态初始化：
 *          -数据类型 [][]数组名称 = new 数据类型[行个数][列个数]{{数据，数据。。}{数据，数据。。}}；
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] data = new int [][]{
                {1,2,3,4,5},{1,2,3},{5,6,7,8}
        };
        for (int x=0; x<data.length;x++){
            for (int y=0;y<data[x].length;y++){
                System.out.println("data["+x+"]["+y+"]="+data[x][y]);
            }
            System.out.println();
        }
        for (int temp[]:data){//foreach输出
            for (int num : temp){
                System.out.println((num));
            }
            System.out.println();
        }
    }
}
