class Solution {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!stack.isEmpty() && Character.toLowerCase(ch) == Character.toLowerCase(stack.peek()) && ch!=stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }

            
        }
        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.pop());
            
        }

        return str.reverse().toString();
    }
}