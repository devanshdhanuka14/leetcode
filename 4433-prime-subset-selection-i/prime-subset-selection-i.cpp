class Solution {
private:
public:
    vector<int> maxPrimes(int n, int s) {
        vector<bool> isPrime(n+1,true);
        vector<int> primes;
        vector<int> ans;
        if(n>=0) isPrime[0] = false;
        if(n>=1) isPrime[1] = false;
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=0;i<isPrime.size();i++){
            if(isPrime[i]==true) primes.push_back(i);
        }
        for(int i=0;i<primes.size();i++){
            if(s-primes[i]>=0){
                ans.push_back(primes[i]);
                s-=primes[i];
            }
            else break;
        }
        return ans;
    }
};