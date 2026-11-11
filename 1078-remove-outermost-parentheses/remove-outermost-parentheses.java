class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                depth--;
            }
            if(depth>0){
                str.append(ch);
            }
            if(ch == '('){
                depth++;
            }
        }
        return str.toString();
    }
}

/*class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' && !stack.isEmpty() && stack.peek()=='('){
                continue;
            }
            if(ch == ')' && !stack.isEmpty() && stack.peek()==')'){
                continue;
            }
            stack.push(ch);
        }

        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.pop());
            
        }

        return str.reverse().toString();
    }
}*/