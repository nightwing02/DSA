package debug;

import java.util.Arrays;

public class stock {
    public int maxProfit(int[] prices) {
        
    	 int minPrice = prices[0];
         int maxProfit = 0;

         // Iterate over each price in the array
         for (int price : prices) {
             // Update the minimum price if the current price is lower
             if (price < minPrice) {
                 minPrice = price;
             } 
             // Calculate the potential profit if selling at the current price
             else {
                 int potentialProfit = price - minPrice;
                 // Update the maximum profit if the potential profit is higher
                 maxProfit = Math.max(maxProfit, potentialProfit);
             }
         }

    	return maxProfit;
    }
    public static void main(String args[]) {
    	stock obj = new stock();
    	int[]  prices = {7,1,5,3,6,4};
    	int result = obj.maxProfit(prices);
    	System.out.println(result);
    	
    	
    }
}
