// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position
// :)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            else if(nums[i] > target) {
                return i;
            }
        }
        return i;
    }
}
