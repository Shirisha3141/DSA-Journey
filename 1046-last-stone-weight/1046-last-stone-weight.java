class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            p.add(i);
        }
        while(p.size()>=2){
            int t1=p.poll();
            int t2=p.poll();
            if(t1==t2) continue;
            else
            p.add(t1-t2);
        }
        return (p.size()==1)?p.peek():0;
    }
}