public class SparseVector {
    
    private int[] array;
    
    public SparseVector(int[] nums) {
        array = nums;
    }
    
    // Return the dotProduct of two sparse vectors
    public int DotProduct(SparseVector vec) {
        int result = 0;
        
        for (int i = 0; i < array.Length; i++) {
            result += array[i] * vec.array[i];
        }
        
        return result;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.DotProduct(v2);
