/**
 * Classname: 有序数组的平方_97
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Alex Liang
 * @Create 2024/6/22 20:26
 * @Version 1.0
 */

public class 有序数组的平方_97 {

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int k = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j;) {
            if (nums[i] * nums[i] >= nums[j] * nums[j]) {
                res[k--] = nums[i] * nums[i];
                i++;
            }else {
                res[k--] = nums[j] * nums[j];
                j--;
            }


        }
        return res;
    }
}
