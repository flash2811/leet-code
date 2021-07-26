class Solution {
    
    String vowels = "aeiouAEIOU";

    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        
        int rez = 0;
        
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) 
                rez++;
            
            if (vowels.indexOf(s.charAt(j)) >= 0) 
                rez--;
        }
        
        //if both sides contain equal vowels
        //the the rez will be 0
        return rez == 0;
    }
}
