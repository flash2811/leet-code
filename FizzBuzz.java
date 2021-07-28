class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> rez = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                rez.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                rez.add("Fizz");
            }
            else if(i % 5 == 0) {
                rez.add("Buzz");
            }
            else {
                rez.add(Integer.toString(i));
            }
        }
        return rez;
    }
}
