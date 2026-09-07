class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new LinkedList<>();
        int ans=0;
        for(int e=0;e<s.length();e++){
            char c=s.charAt(e);
            if(q.contains(c)){
                while(!q.isEmpty() && q.peek()!=c){
                    q.remove();
                }
                q.remove();
            }
            q.add(c);
            ans=Math.max(ans,q.size());
        }
        return ans;
    }
}