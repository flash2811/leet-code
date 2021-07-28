class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList();
        
        for (int n = left; n <= right; ++n) {
            if(selfDividing(n))
                result.add(n);
        }
        
        return result;
    }
    
    public boolean selfDividing(int n) {
        int x = n;
        
        while(x > 0) {
            int divide = x % 10;
            x = x / 10;
            if(divide == 0 || (n % divide) > 0) 
                return false;
        }
        
        return true;
    }
}
