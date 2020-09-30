class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while(n>0) {
            n--;
            s = ((char)(n % 26 +'A')) + s;
            n / = 26;
        }
        return s;
    }
}
