class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int r=-1;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int l=1,h=max;
        while(l<=h){
            int m=(l+h)/2;
            int sum=0;
            for(int i:nums){
                sum+=(int)Math.ceil((double)i/m);
            }
            if(sum<=t){
                r=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return r;
    }
}