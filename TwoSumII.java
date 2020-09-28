// Input array is sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target && i != j) {
                    int[] result = {i + 1, j + 1};
                    return result;
                }
            }
        }
        int[] result = {0, 0};
        return result;
    }
}
