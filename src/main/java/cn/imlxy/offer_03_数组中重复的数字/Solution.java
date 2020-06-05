package cn.imlxy.offer_03_数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : Solution
 * @Description :题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * @Author : LiuXinyu
 * @Site : www.imlxy.cn
 * @Date: 2020-05-01 13:06
 */
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    //从头到尾依次扫描数组中每一个数字。当扫描到第i个元素时，比较该位置数值m是否等于i。若是，接着扫描下一个数字；否则，将其与第m个数字进行比较。若相等，则返回该重复数字；否则，交换两个数字，继续重复前面的过程。
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return false;
    }
}

/*public class Solution {
    //利用 HashSet 解决，从头到尾扫描数组，每次扫描到一个数，判断当前数是否存在 HashSet 中，如果存在，则重复，对 duplication 赋值返回，否则将该数加入到 HashSet 中
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        Set set = new HashSet();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }else {
                set.add(numbers[i]);
            }
        }
        return false;
    }
}*/
/*public class Solution {
    //先对数组进行排序，然后再查找排序后的数组中的重复元素
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < length - 1; i++) {
            if (numbers[i + 1] == numbers[i]) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}*/
