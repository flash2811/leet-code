class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rez = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                  rez[i]++;  
                }
            } 
        }
        return rez;
    }
}
