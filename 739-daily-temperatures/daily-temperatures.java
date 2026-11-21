class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Arrays.fill(answer,0);
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;

        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

                index = stack.pop();

                answer[index] = i-index;
            }

            stack.push(i);
        }

        return answer;
        
    }
}