class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int count = 0;

        for(int i = 0; i < boxTypes.length; i++){
            int x = boxTypes[i][0];

            if(x <= truckSize){
                count += x * boxTypes[i][1];
                truckSize -= x;
            }
            else{
                count += truckSize * boxTypes[i][1];
                break;
            }
        }
        return count;
    }
}