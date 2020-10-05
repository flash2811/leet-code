class Solution {
    public int addDigits(int num) {
        while(num >= 10) {
            num = intSum(num);
        }
        return num;
    }
    
    private int intSum(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
