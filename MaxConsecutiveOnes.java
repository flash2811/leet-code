class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                count++;
            }
            else {
                if(maxCount < count)
                    maxCount = count;
                count = 0;
            }
        }
        if(maxCount < count)
            maxCount = count;

        return maxCount;
    }
}
