class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0;
        int count = 0;

        for(int i = 0; i < s.length && k < g.length; i++){
            if(s[i] >= g[k]){
                count++;
                k++;
            }
        }
        return count;
    }
}