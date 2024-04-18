
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = left +( right - left) / 2;
//            middle = (right + left) / 2;
            if (target == nums[middle])
                return middle;
            if (target < nums[middle]) {
                right = middle - 1;
//                middle = (left + right) / 2;
            } else if (target > nums[middle]) {
                left = middle + 1;
//                middle = (left + right) / 2;
            } else
                return middle;

        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
