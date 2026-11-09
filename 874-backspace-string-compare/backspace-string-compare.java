class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!='#'){
                stack1.push(s.charAt(i));
            }
            else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }

        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)!='#'){
                stack2.push(t.charAt(i));
            }
            else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }

        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }

        if(stack1.size()!=stack2.size()){
            return false;
        }

        while(!stack1.isEmpty()){
            char x = stack1.pop();
            char y = stack2.pop();

            if(x != y){
                return false;
            }
        }
        return true;
    }
}