package cn.imlxy.offer_03_数组中重复的数字;

/**
 * @ClassName : Other
 * @Description :
 * @Author : LiuXinyu
 * @Site : www.imlxy.cn
 * @Date: 2020-05-01 16:01
 */
public class Other {
    /**
     *
     * 1）把1~n的数字从中间的数字m分为两部分，前面一半为1~m，后面一半为m+1~n
     *
     * 2）如果1~m这部分的数字对应数组里的值超过m个，这个区间就包含有重复的数字，否则就是另外一个区间包含重复的数字。就算两个区间都有重复的也只要再对某一个区间进行二分，因为题目要求只要找到任意一个重复的数字
     *
     * 3）继续把重复数字的区间进行二分，直到找到一个重复的数字
     */
    /**
     * int mid = (start+end)/2可能会溢出，用>>是遇到负奇数的时候求上下界统一
     * -5/2=-2   5/2=2   上下界求法不统一
     * -5>>1=-3  5>>1=2  统一
     */
    int getDuplication(int[] numbers, int length) {

        int start = 1;
        int end = length - 1;
        while (end >= start) {

            int mid = start + (end - start) >> 1;
            int count = countRange(numbers, length, start, mid);
            if (end == start) {
                if (count > 1) {
                    return start;
                }
                break;
            }
            if (count > (mid - start + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    int countRange(int[] numbers, int length, int start, int end) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                ++count;
            }
        }
        return count;
    }
}
