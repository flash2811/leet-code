class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0; 
        int tempX = x;
        
        if (tempX < 0){
            return false;
         }
        
        while(tempX > 0) 
        { 
            int a = tempX % 10;
            rev = rev * 10 + a; 
            tempX = tempX / 10;
        }
        
        if(Integer.compare(rev,x) == 0){
            return true;
        }
        else{    
            return false;            
        }
    }
}
