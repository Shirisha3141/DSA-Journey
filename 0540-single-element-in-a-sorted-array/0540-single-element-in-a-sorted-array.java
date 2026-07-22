class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            int m=(i+j)/2;
            if(m%2==0){
            if(nums[m]!=nums[m+1]){
                j=m;
            }else{
                i=m+1;
            }
            }else{
                if(nums[m]!=nums[m+1])
                i=m+1;
                else
                j=m-1;
            }
        }
        return nums[i];

    }
}