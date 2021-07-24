class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase(); lol
        
        char[] a = s.toCharArray();
        
        for (int i = 0; i < a.length; i++)
            
            //check if the val is uppercase
            if ('A' <= a[i] && a[i] <= 'Z')
                //move forward 32 ascii and reach the lowercase
                a[i] += 32;
        
        return new String(a);
    }
}
