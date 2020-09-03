class Solution {
    public int reverse(int x) {
        long rev = 0; 
        boolean negBool = false;
              
         if (x < 0){
            x = x * -1;
            negBool = true;          
         }
        
        while(x > 0) 
        { 
            int a = x % 10;
            rev = rev * 10 + a; 
            x = x / 10;
        } 
        
        if (negBool){
            rev = rev * -1;     
        }
            
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            rev = 0;            
        }
        
        return (int)rev; 
    }
}
