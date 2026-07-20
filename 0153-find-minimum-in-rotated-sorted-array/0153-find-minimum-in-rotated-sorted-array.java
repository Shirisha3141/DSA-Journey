class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        int t=mi(nums);
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==t) return nums[m];
            if(nums[i]<nums[m]){
                if(t>=nums[i] && t<nums[m]) j=m-1;
                else i=m+1;
            }else{
                if(t>nums[m] && t<=nums[j]) i=m+1;
                else j=m-1;
            }
        }
        return t;
    }
    int mi(int[] n){
        int min=n[0];
        for (int i = 1; i < n.length; i++) {
        if (n[i] < min) {
            min = n[i];
        }
        }
        return min;
    }
}