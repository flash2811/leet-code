class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int newArr[] = new int[length];
        
        for(int i = 0; i < length; i++) {
            if(i == 0) {  
                newArr[i] = nums[i]; 
            } 
            else {            
                newArr[i] = newArr[i - 1] + nums[i];
            }
        }
        return newArr;
    }
}
