class Solution {
    public boolean isPalindrome(String s) {
        if (s == "") {
            return true; 
        }
        
        s = s.toLowerCase();
        
        s = s.replaceAll( 
          "[^a-zA-Z0-9]", ""); 
        
        System.out.println(s);
        
        char[] cArr = s.toCharArray();
        
        int i = 0;
        int j = cArr.length - 1;
        for (; i < j; i++, j--) { 
            //for (int j = cArr.length - 1; j <= cArr.length / 2; j--) {
                if(cArr[i] != cArr[j]) {
                    return false;
                }
            //}
        }
        return true;
    }
}
