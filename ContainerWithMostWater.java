import java.io.*;
class Solution {
  
  //O(n^2)
    public int maxArea(int[] height) {
        
        int area = 0;
        
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                
                int min = Math.min(height[i], height[j]);
                
                int tempArea = min * (j - i);
                
                area = Math.max(area, tempArea);
                
            }
        }
        return area;
    }
  
  //o(n)
  public int maxArea(int[] height) {
        
        int l = 0;
        int r = height.length - 1;
        int area = 0;
     
        while (l < r)
        {
            int min = Math.min(height[l], height[r]);
                
            int tempArea = min * (r - l);
                
            area = Math.max(area, tempArea);
                         
            if (height[l] < height[r])
                l += 1;
                 
            else
                r -= 1;
        }
        return area;
    }
}
