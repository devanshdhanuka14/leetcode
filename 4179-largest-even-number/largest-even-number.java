class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        for(int i = s.length()-1; i>=0; i--){
            if(sb.charAt(i)=='1'){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}