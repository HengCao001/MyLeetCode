package template_3;

/**
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
public class lc34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (nums[l] == target && nums[r] == target) {
                    return new int[]{l, r};
                } else if (nums[l] == target) {
                    r--;
                } else if (nums[r] == target) {
                    l++;
                } else {
                    l++;
                    r--;
                }
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}

















