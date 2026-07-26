class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=1,h=arr[arr.length-1]+k;
        int ans=0;
        while(l<=h){
            int c=0;
            int m=(l+h)/2;
            for(int i:arr){
                if(i<=m){
                    c++;
                }
            }
            int r=m-c;
            if(r>=k){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}