class Solution {
    public int removeDuplicates(int[] nums) {
        int[] n = new int[nums.length];
        int temp = nums[0];
        n[0] = temp;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(temp == nums[i]){
                continue;
            }
            else{
                n[j++] = nums[i];
                temp = nums[i];
            }
        }
        for(int i=0;i<j;i++){
            nums[i] = n[i];
        }
        return j;
    }
}
