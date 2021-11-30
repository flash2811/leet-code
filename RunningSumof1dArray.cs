public class Solution {
    public int[] RunningSum(int[] nums) {
        int[] result = new int [nums.Length];
        
        for(int i = 0; i < nums.Length; i++) {
            if(i == 0) {
                result[0] = nums[0];
            }
            else {
                result[i] = result[i - 1] + nums[i];
            }
        }
        return result;
    }
}
