class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int rez = 0;
        
        //for every word
        for (String s : words) {
            boolean isValid = true;
            
            //for every char
            for (char ch : s.toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    isValid = false;
                }
            }
            
            if (isValid) 
                rez++;
        }

    return rez;
            
    }
}
