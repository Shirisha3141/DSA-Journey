class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int c=-1;
        while(i<=j){
            int m=(int)((i+j)/2);
            if(nums[m]==target) return m;
            else if(nums[m]<target)
            i=m+1;
            else
            j=m-1;
        }
        return c;
    }
}