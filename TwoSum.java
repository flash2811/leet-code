class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++ ){        
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }
    
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        for(int i = 0; i < nums.length; i++ ){        
            if(map.containsKey(target - nums[i])){
                int[] result = {map.get(target - nums[i]), i};
                return result;
            }
            
            map.put(nums[i], i);
        }
        
        return null;
    }
    
}
