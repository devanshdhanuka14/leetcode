class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Iterator<Character> it = map.keySet().iterator();
        while(it.hasNext()){
            char ch = it.next();
            pq.add(new int[]{ch,map.get(ch)});
        }

        StringBuilder answer = new StringBuilder();

        int[] prev = null;

        while(!pq.isEmpty()){

            int[] curr = pq.poll();
            answer.append((char)curr[0]);
            curr[1]--;

            if(prev != null && prev[1] > 0){
                pq.add(prev);
            }

            prev = curr;
        }

        if(answer.length() != s.length()){
            return "";
        }
        return answer.toString();
    }
}