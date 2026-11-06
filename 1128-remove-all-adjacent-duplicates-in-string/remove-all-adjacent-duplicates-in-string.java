class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);            
            if(stack.isEmpty() || stack.peek()!=ch){
                stack.push(ch);
            }
            else if(stack.peek()==ch){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }
        return answer.reverse().toString();
    }
}