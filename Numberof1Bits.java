public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0;
        
        while(n != 0) {
            if(n % 10 == 1) {
                counter++;
                n = n / 10;
            }
            
        }
        return counter + 1;
    }
}

public class Solution {
  public int hammingWeight(int n) {
    int bits = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
            bits++;
        }
        mask <<= 1;
    }
    return bits;
  }
}
