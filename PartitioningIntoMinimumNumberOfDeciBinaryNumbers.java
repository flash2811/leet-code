class Solution {
    public int minPartitions(String n) {
        int rez = 0;
        for (int i = 0; i < n.length(); ++i)
            if (rez < n.charAt(i) - '0') {
                rez = n.charAt(i) - '0';
            }
        return rez;
    }
}
