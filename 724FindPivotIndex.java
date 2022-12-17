class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int F[] = new int[n];
        int R[] = new int[n];
        F[0] = nums[0];
        R[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            F[i] = nums[i]+F[i-1]; 
            R[(n-1)-i] = nums[(n-1)-i] + R[((n-1)-i)+1];
        }
        for(int i=0;i<n;i++){
            if(F[i] == R[i]){
                return i;
            }
        }
        return -1;
    }
}
