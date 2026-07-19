class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=flo(nums,target);
        int c=cei(nums,target);
        return new int[]{f,c};
    }
    int flo(int[] nums,int target){
        int i=0,j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int m=(int)((i+j)/2);
            if(nums[m]==target){
                ans=m;
                j=m-1;
            }
            else if(nums[m]<target)
            i=m+1;
            else
            j=m-1;
        }
        return ans;
    }
    int cei(int[] nums,int target){
        int i=0,j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int m=(int)((i+j)/2);
            if(nums[m]==target){
                ans=m;
                i=m+1;
            }
            else if(nums[m]<target)
            i=m+1;
            else
            j=m-1;
        }
        return ans;
    }
}