public class Solution {
    public int FinalValueAfterOperations(string[] operations) {
        int val = 0;
        for(int i = 0; i < operations.Length; i++) {
            if(operations[i][1] == '+') {
                val++;
            }
            else val--;
        }
        return val;
    }
}
