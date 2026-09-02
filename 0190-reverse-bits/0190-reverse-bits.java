class Solution {
    public int reverseBits(int n) {
        long ans=Integer.reverse(n)&0xFFFFFFFFL;
        return (int)ans;
    }
}