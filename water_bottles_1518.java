class water_bottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int i = 1;
        int drinked = 0;

        while(numBottles > 0) {
            drinked++;

            if(i == numExchange) {
                i = 1;
                continue;
            }

            numBottles--;
            i++;
        }

        return drinked;
    }
}

// Example 1:

// Input: numBottles = 9, numExchange = 3
// Output: 13
// Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
// Number of water bottles you can drink: 9 + 3 + 1 = 13.
  
// Example 2:

// Input: numBottles = 15, numExchange = 4
// Output: 19
// Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
// Number of water bottles you can drink: 15 + 3 + 1 = 19.

