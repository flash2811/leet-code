class Solution {
    public String defangIPaddr(String address) {
        String defangIP = "";
     
        for(int i = 0; i < address.length(); i++) {
           char c = address.charAt(i);
           if(c == '.') {
               defangIP += "[.]";
           }
           else {
               defangIP += c;
           }
        }
        return defangIP;
    }
}
