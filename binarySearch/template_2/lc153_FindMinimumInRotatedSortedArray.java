package template_2;

public class lc153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int l = 0;
        int r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= nums[0] && nums[mid] > nums[n]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return nums[l];
    }
}
