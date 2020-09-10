class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length; 
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0; 
  
        for (int i = 0; i < size; i++) { 
            maxEndingHere = maxEndingHere + nums[i]; 
            
            if (maxSoFar < maxEndingHere) 
                maxSoFar = maxEndingHere; 
            
            if (maxEndingHere < 0) 
                maxEndingHere = 0; 
        } 
        return maxSoFar; 
    }
}
