class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = -999;
        
        for(int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            
            if(altitude > max)
                max = altitude;
        }
        
        if(max < 0)
            max = 0;
    
        return max;
    }
    
}
