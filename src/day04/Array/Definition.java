package day04.Array;

/**
 * @program: Java_Fundamentals
 * @description: 数组的基本定义
 * @author: Sam
 * @create: 2020-07-26 23:13
 */

/**
 * 数组的定义格式：
 *      ·数组的动态初始化：初始化之后的数组每一个元素的保存内容为其对应数据的默认值
 *          -声明并初始化数组：
 *              ·数据类型 数组名称[] = new 数据类型[长度];
 *              ·数据类型[] 数组名称 = new 数据类型[长度];
 *
 *      ·数组的静态初始化：在数组定义的时候就为其设置好了里面的内容
 *          -简化格式： 数据类型 数组名称[] = {数据1，数据2，数据3,。。。};
 *          -完整格式： 数据类型 数组名称[] = new 数据类型 []{数据1，数据2，数据3,。。。};
 *
 * 数组通过脚标进行每一个元素的访问，脚标从0开始定义，范围到数组名称.length-1
 */
public class Definition {
    public static void main(String[] args) {
        int[] data  = new int [3];
    }
}
