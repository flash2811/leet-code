class Solution(object):
    def isPalindrome(self, x):
        tempX = x
        rev = 0
        
        if (tempX < 0):
            return False
        
        while(tempX > 0): 
            a = tempX % 10
            rev = rev * 10 + a 
            tempX = tempX // 10
                    
        if(x == rev):
            return True
