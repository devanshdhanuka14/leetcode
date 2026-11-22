/*class Solution {
    public boolean checkString(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                stack.push('a');
            }
            else{
                stack.poll();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}*/

class Solution {
    public boolean checkString(String s) {
        int b = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                if(b==1) return false;
                continue;
            }
            else{
                b = 1;
            }
        }
        return true;
    }
}