class Solution {
    public int[] buildArray(int[] nums) {
        int[]  rez = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            rez[i] = nums[nums[i]];
        }
        
        return rez;
    }
}
