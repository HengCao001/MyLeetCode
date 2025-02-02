package template_1;

/*
 *猜数字游戏的规则如下：
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 */

public class lc374_GuessNumberHigherOrLower {
    public static class Solution {
        public int guessNumber(int n) {
            int l = 1;
            int r = n;
            int ans = -1;
            while (l <= n) {
                int mid = l + (r - l) / 2;
                int flag = guess(mid);
                if (flag == 0) {
                    ans = mid;
                    return ans;
                }
                if (flag == -1) {
                    r = mid - 1;
                }
                if (flag == 1) {
                    l = mid + 1;
                }
            }
            return ans;
        }
    }

    // 仅用于不让idea报错
    public static int guess(int n) {
        return 0;
    }
}
