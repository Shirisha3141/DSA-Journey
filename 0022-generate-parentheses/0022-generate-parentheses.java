class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> s=new LinkedList<>();
        solve(s,"",0,0,n);
        return s;
    }
    void solve(List<String> s,String st,int o,int i,int n){
        if(st.length()==n*2){
            s.add(st);
            return;
        }
        if(o<n){
            solve(s,st+"(",o+1,i,n);
        }
        if(i<o){
            solve(s,st+")",o,i+1,n);
        }
    }
}