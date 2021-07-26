class Solution {
    public int findLucky(int[] arr) {
        int maxLuckyNumber = -1;
        
        for (int num : arr) {
            int count = 0;
            
            for (int innerNum : arr) {
                if (innerNum == num) 
                    count++;
            }
            
            if (count == num && num > maxLuckyNumber) 
                maxLuckyNumber = num;
        }
        
        return maxLuckyNumber;
    }
}
