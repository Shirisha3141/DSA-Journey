class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(i<=j){
            if(nums[i]<=nums[j]){
                ans=Math.min(ans,nums[i]);
                break;
            }
            int m=(i+j)/2;
            if(nums[i]<=nums[m]){
               ans=Math.min(ans,nums[i]);
               i=m+1;
            }else{
                ans=Math.min(ans,nums[m]);
               j=m-1;
            }
        }
        return ans;
    }
}