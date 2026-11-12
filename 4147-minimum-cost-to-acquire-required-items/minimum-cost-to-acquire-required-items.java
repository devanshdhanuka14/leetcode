
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long totalCost = 0;

        if (cost1 + cost2 <= costBoth) {
            totalCost = (long)cost1 * need1 + (long)cost2 * need2;
        } else {
            int both = Math.min(need1, need2);
            totalCost = (long)both * costBoth;

            need1 -= both;
            need2 -= both;

            if (need1 > 0) {
                totalCost += (long)need1 * Math.min(cost1, costBoth);
            } else if (need2 > 0) {
                totalCost += (long)need2 * Math.min(cost2, costBoth);
            }
        }
        return totalCost;
    }
}

/*class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long both = Math.min(need1, need2);
        long remaining1 = need1 - both;
        long remaining2 = need2 - both;

        long option1 = both * costBoth + remaining1 * cost1 + remaining2 * cost2;

        long option2 = (long) Math.max(need1, need2) * costBoth;

        long option3 = (long) need1 * cost1 + (long) need2 * cost2;

        return Math.min(option1, Math.min(option2, option3));
    }
}*/
