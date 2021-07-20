class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] rez = new int[nums.length * 2];
	    
        for(int i=0;i<nums.length;i++) {
            rez[i] = nums[i];
		    rez[i + nums.length] = nums[i];            
        }
	    
        return rez;
    }
}
