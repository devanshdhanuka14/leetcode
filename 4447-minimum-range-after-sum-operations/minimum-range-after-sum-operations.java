class Solution {
    public int minRange(int a, int b, int c) {
        int max = 0;
        int mid = 0;
        int min = 0;

        if(a>b){
            if(a>c){
                max = a;
                if(b>c){
                    mid = b;
                    min = c;
                }
                else{
                    mid = c;
                    min = b;
                }
            }
            else{
                max = c;
                mid = a;
                min = b;
            }
        }
        else{
            if(b>c){
                max = b;
                if(a>c){
                    mid = a;
                    min = c;
                }
                else{
                    mid = c;
                    min = a;
                }
            }
            else{
                max = c;
                mid = b;
                min = a;
            }
        }

        if((min+mid)<max){
            max = min + mid;
        }

        return max - min;
    }
}