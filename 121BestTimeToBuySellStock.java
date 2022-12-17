class Solution {
    public int maxProfit(int[] nums) {
		int l = Integer.MAX_VALUE;            //Lowest(l)
		int p = 0;                            //Profit(p)
		for(int i=0;i<nums.length;i++){
		    if(l > nums[i]){
		        l = nums[i];
		    }
		    else{
		        if(nums[i] - l > p){
		            p = nums[i] - l;
		        }
		    }
		}
		return p;
    }
}
