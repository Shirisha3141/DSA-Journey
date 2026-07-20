class Solution {
    public boolean search(int[] nums, int t) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==t) return true;
            if(nums[i]==nums[m] && nums[m]==nums[j]){
                i++;
                j--;
            }
            else if(nums[i]<=nums[m]){
                if(t>=nums[i] && t<nums[m]) j=m-1;
                else i=m+1;
            }else{
                 if(t>nums[m] && t<=nums[j]) i=m+1;
                else j=m-1;
            }
        }
        return false;
    }
}