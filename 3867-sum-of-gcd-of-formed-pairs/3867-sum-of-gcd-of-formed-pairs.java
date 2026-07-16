class Solution {
    public long gcdSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        int m[]=new int[n];
        int p[]=new int[n];
        m[0]=nums[0];
        for(int i=1;i<n;i++){
            m[i]=Math.max(nums[i],m[i-1]);
        }
        for(int i=0;i<n;i++){
            p[i]=gcd(nums[i],m[i]);
        }Arrays.sort(p);
        int i=0,j=n-1;
        while(i<j){
            sum+=gcd(p[i],p[j]);
            i++;
            j--;
        }
        return sum;
    }
    int gcd(int a,int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}