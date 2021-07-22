class Solution {
  //o(n)
    public int[] minOperations(String boxes) {        
        int[] ans = new int[boxes.length()];
		    int cnt = boxes.charAt(0) - '0';
		
        for(int i=1;i<boxes.length(); i++) {
			    ans[i] = ans[i-1] + cnt;
			    cnt += boxes.charAt(i) - '0';
		    }
		
		  int runner = 0; 
		  cnt = boxes.charAt(boxes.length()-1) - '0';
		
      for(int i=boxes.length()-2;i>=0; i--) {
			  runner += cnt; 
			  ans[i] += runner;
			  cnt += boxes.charAt(i) - '0'; 
		  }
      return ans;  
  }
  
  o(n^2)
  public int[] minOperations(String boxes) {

        int a[] = new int[boxes.length()];

        for(int i=0;i<boxes.length();i++){

            for(int j=0;j<boxes.length();j++){

                if(i !=j && boxes.charAt(j)=='1'){
                    a[i] += Math.abs(i-j);
                }

            }
        }
    return a;
    }
}
