package cn.imlxy.offer_04_二维数组的查找;

/**
 * @ClassName : Solution
 * @Description :在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author : LiuXinyu
 * @Site : www.imlxy.cn
 * @Date: 2020-05-01 21:36
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows == 0 || cols == 0) {
            return false;
        }
        int col = 0;
        int row = rows - 1;
        while (col < cols && row >= 0) {
            if (array[row][col] < target) {
                col++;
            } else if (array[row][col] > target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }
}