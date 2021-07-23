class Solution {
    public int xorOperation(int n, int start) {
        if (n == 1)
            return start;
        
        int rez = 0;
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++){
            nums[i] = start + 2*i;
            rez = rez ^ nums[i];
        }
        
        return rez;
    }
}
