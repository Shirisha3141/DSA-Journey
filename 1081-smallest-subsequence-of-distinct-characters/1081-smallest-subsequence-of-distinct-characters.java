class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder t=new StringBuilder();
        boolean[] b=new boolean[26];
        int[] f=new int[26];
        Stack<Character> se=new Stack<>();
        for(char c:s.toCharArray())
        f[c-'a']++;
        for(char c:s.toCharArray()){
            f[c-'a']--;
            if(b[c-'a']) continue;
            while(!se.isEmpty() && c<se.peek() && f[se.peek()-'a']>0){
                b[se.pop()-'a']=false;
            }
            se.push(c);
            b[c-'a']=true;
        }
        for(char c:se){
            t.append(c);
        }
        return t.toString();
    }
}