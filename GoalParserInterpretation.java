class Solution {
    public String interpret(String command) {
        String rez = "";
        
        for(int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                rez += 'G';
            }
            else if(command.charAt(i) == '(' 
               && command.charAt(i + 1) == ')') {
                rez += "o";
                i++;
            }
            else {
                rez += "al";
                i += 3;
            }
            
        }
        
        return rez;
    }
}
