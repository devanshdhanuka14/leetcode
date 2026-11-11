
class Solution {
    public long countValidSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;
        long count = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (ch == 'a') {
                a = right;
            }
            else if (ch == 'b') {
                b = a;
            }
            else if (ch == 'c') {
                c = b;
            }

            count += right - c;
        }

        return count;
    }
}
