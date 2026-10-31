class Solution {
    public int balancedStringSplit(String s) {
        int equal = 0;
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'R'){
                equal++;
            }
            else if(ch == 'L'){
                equal--;
            }
            if(equal == 0){
                count++;
            }
        }
        return count;
    }
}