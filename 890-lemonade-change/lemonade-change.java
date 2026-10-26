class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();

        if(bills[0]==10 || bills[0]==20){
            return false;
        }
        
        for(int i = 0; i<bills.length; i++){
            if(bills[i]==5){
                map.put(5,map.getOrDefault(5,0)+1);
            }
            else if(bills[i]==10){
                
                if(map.get(5)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.getOrDefault(10,0)+1);
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                
                if(map.getOrDefault(5,0)>0 && map.getOrDefault(10,0)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                    map.put(20,map.getOrDefault(20,0)+1);
                    continue;
                }
                else if(map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                    map.put(20,map.getOrDefault(20,0)+1);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}