package template_1;

/* 题目描述：
 * 给你一个非负整数x ，计算并返回x的算术平方根 。
 * 由于返回类型是整数，结果只保留整数部分，小数部分将被舍去 。
 * 不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 */

public class lc69_SqrtX {
    public static int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l <= r) {
            // 防止溢出
            int mid = l + (r - l) / 2;
            // 转成long，防止溢出，用除法的话，要多判断一个为0的情况，这样写0也能处理
            if ((long) mid * mid <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}