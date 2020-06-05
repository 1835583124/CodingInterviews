package cn.imlxy.offer_05_替换空格;

/**
 * @ClassName : Solution
 * @Description : 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Author : LiuXinyu
 * @Site : www.imlxy.cn
 * @Date: 2020-05-02 18:11
 */
/*public class Solution {
    public String replaceSpace(StringBuffer str) {
        //计算空格的数量
        int blankNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                blankNum++;
            }
        }
        //记录初始的字符串、插入后的字符串的长度
        int originalStringLength = str.length();
        int newStringLength = originalStringLength + blankNum * 2;
        //重新设置str的长度
        str.setLength(newStringLength);
        //定义两个指针，分别指向新旧字符串的末尾
        int indexOfOriginalString = originalStringLength - 1;
        int indexOfNewString = newStringLength - 1;
        //结束条件及确保是否越界
        while (indexOfOriginalString >= 0 && indexOfNewString > indexOfOriginalString) {
            if (str.charAt(indexOfOriginalString) == ' ') {
                //插入语%20
                str.setCharAt(indexOfNewString--, '0');
                str.setCharAt(indexOfNewString--, '2');
                str.setCharAt(indexOfNewString--, '%');
            } else {
                str.setCharAt(indexOfNewString--, str.charAt(indexOfOriginalString));
            }
            indexOfOriginalString--;
        }
        return str.toString();
    }
}*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
