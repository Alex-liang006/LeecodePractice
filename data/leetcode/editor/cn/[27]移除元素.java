
//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {
    public int removeElement(int[] nums, int val) {
          int fast, slow = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (val != nums[fast]){
                nums[slow] = nums[fast];
                slow = slow+1;
            }


        }


        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
