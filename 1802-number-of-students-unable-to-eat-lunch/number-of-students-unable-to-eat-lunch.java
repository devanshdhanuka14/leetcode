class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        int j = 0;
        int count = 0;

        for(int i = 0; i < students.length; i++){
            q.offer(students[i]);
        }

        while(j < sandwiches.length && !q.isEmpty()){

            if(q.peek() != sandwiches[j]){
                int x = q.poll();
                q.offer(x);
                count++;

                if(count == q.size()){
                    break;
                }
            }
            else{
                q.poll();
                j++;
                count = 0;
            }
        }

        return q.size();
    }
}