class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        
        int rez = 0;
        
        char[] sChar = s.toCharArray();
        
        for(int i = 0; i < sChar.length; i++) {
            if(sChar[i] == 'R') {
                count++;                
            }
            else {
                count--;
            }
            if (count == 0) rez++;
        }
        
        return rez;
    }
}
