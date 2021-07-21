class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;
         for (int i = 0; i < candies.length; i++) {
            if (candies[i] > largest) 
                largest = candies[i];
        }
        
        List<Boolean> b = new ArrayList<>();
        
        for (int i = 0; i < candies.length; i++) {
		   b.add(candies[i] + extraCandies >= largest);
        }
        return b;
    }
}
