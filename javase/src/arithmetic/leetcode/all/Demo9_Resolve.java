package arithmetic.leetcode.all;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Demo9_Resolve {
    public static void main(String[] args) {
        boolean flag = isPalindrome(123321);
        System.out.println(flag);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);

        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char  end = str.charAt(str.length()-1-i);
            if (!(start == end)) {
                return false;
            }
        }
        return true;
    }
}
