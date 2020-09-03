class Solution(object):
    def reverse(self, x):
        rev = 0
        negBool = None
        
        if (x < 0):
            x = abs(x)
            negBool = True
        
        while(x > 0): 
            a = x % 10
            rev = rev * 10 + a 
            x = x // 10
            
        if (negBool):
            rev = rev * -1
            
        if (rev > 2147483647 or rev < -2147483647):
            rev = 0
        
        return rev
