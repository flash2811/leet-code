class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");        
        String [] rez = new String [words.length];
        
        for (String word : words) {
            
            
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1)));
            
            // add to the rez position
            rez [index - 1] = word.substring (0, word.length() - 1);
        }
        
        String resultString = "";
        int count = 1;
        for (String word : rez) {
            if (count < rez.length) {
                resultString += word;
                resultString += " ";
                count++;
            }
            else
                resultString += word;                
        }
        
        return resultString;
    }
}
