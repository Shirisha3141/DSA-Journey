class Solution {
    public int shipWithinDays(int[] w, int d) {
        int max=0,r=-1,l=0;
        for(int i:w){
            l=Math.max(i,l);
            max+=i;
        }
        int h=max;
        while(l<=h){
            int m=(l+h)/2;
            int sum=0,c=1;
            for(int i:w){
                if(sum+i<=m){
                sum+=i;
                }else{
                    c++;
                    sum=i;
                }
            }
            System.out.println(c);
            if(c<=d){
                r=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return r;
    }
}