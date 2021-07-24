class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String conc1 = word1.toString();
        // String conc2 = word2.toString();
        
        String conc1 = String.join("", word1);
        String conc2 = String.join("", word2);
        
        return conc1.equals(conc2);
    }
}
