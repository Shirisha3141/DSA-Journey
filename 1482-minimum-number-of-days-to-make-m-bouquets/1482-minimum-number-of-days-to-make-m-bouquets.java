class Solution {
    public int minDays(int[] bl, int m, int k) {
        long mul=(long)m*k;
        if(mul>bl.length) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int b:bl){
            min=Math.min(min,b);
            max=Math.max(max,b);
        }
        int l=min,h=max,r=-1;
        while(l<=h){
            int mi=(l+h)/2;
            if(p(bl,mi,m,k)){
                r=mi;
                h=mi-1;
            }else{
                l=mi+1;
            }
        }
        return r;
    }
    boolean p(int[] bl,int mid,int m,int k){
        int c=0,bo=0;
        for(int b:bl){
            if(b<=mid){
                c++;
                if(c==k){
                    bo++;
                    c=0;
                }
            }else{
                c=0;
            }
        }
        return bo>=m;
    }
}