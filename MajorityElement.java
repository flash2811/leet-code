class Solution {
    public int majorityElement(int[] nums) {
        
        
        
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    counter++;
                }            
            }
            
            
            if (counter > nums.length / 2) {
                return nums[i];
            } 
            
        }
        return -1;
    }
}
