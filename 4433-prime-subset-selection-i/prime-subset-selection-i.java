class Solution {
    public boolean isprime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> maxPrimes(int n, int s) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 2; i<=n; i++){
            if(isprime(i)){
                sum += i;
                if(sum<=s){
                    list.add(i);
                }
                else{
                    break;
                }
            }
        }
        return list;
    }
}