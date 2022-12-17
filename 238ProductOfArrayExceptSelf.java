class Solution {
    public int[] productExceptSelf(int[] nums) {
        int F = 1;
        int res[] = new int[nums.length];
        res[0] = F;
        for(int i=1;i<nums.length;i++){
            F *= nums[i-1];
            res[i] = F;
        }
        F = 1;
        for(int i=nums.length-2;i>=0;i--){
            F *= nums[i+1];
            res[i] *= F;
        }
        return res;
    }
}
