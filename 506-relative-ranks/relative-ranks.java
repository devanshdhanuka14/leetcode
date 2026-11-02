class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        String answer[] = new String[n];

        for(int i = 0; i<n; i++){
            pq.add(new int[]{score[i],i});        
        }
        for(int i = 0; i<n; i++){
            int curr[] = pq.poll();
            if(i+1==1){
                answer[curr[1]]="Gold Medal";
            }
            else if(i+1==2){
                answer[curr[1]]="Silver Medal";
            }
            else if(i+1==3){
                answer[curr[1]]="Bronze Medal";
            }
            else{
                answer[curr[1]]=Integer.toString(i+1);
            }
        }
        return answer;
    }
}