class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int c = 0, v = 0;
        for(int i=0;i<nums.length;i++){
            if(v == 0){
                c = nums[i];
            }
            if(c == nums[i])v++;
            else v--;
        }
        return c;
    }
}
