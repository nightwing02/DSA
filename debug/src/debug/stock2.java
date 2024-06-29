package debug;

import java.util.ArrayList;
import java.util.Arrays;

public class stock2 {
    public int maxProfit(int[] prices) {
        
    	
    	
//    	// Creating ArrayList 
//        ArrayList<Integer> clist = new ArrayList<>(); 
//  
//        // adding elements of array 
//        // to ArrayList 
//        for (int i : prices) 
//            clist.add(i); 
//        
//    	 int min1 = prices[0];
//         int max1 = 0;
//         int max2 = 0;
//         
//         for(int i = 0;i<prices.length;i++) {
//        	  if(min1>prices[i]) {
//        		 min1 = prices[i];
//        	 }
//         }
//         
//         
//      // returning index of the element 
//         int hello = clist.indexOf(min1);
//       
//         int[] start = Arrays.copyOfRange(prices, hello, prices.length);
//         for(int i = 0;i<start.length;i++) {
//        	 if(max1<start[i])
//        		 max1=start[i];
//         }
//      
//         int maxprofit = max1 - min1;
//       
//    	return maxprofit;
    	
    	
    	        int max = 0;
    	        int start = prices[0];
    	        int len = prices.length;
    	        for(int i = 1;i<len; i++){
    	            if(start < prices[i]) max += prices[i] - start;
    	            start = prices[i];
    	        }
    	        return max;
    	  
    	
    }
    public static void main(String args[]) {
    	stock2 obj = new stock2();
    	int[]  prices = {7,1,5,3,6,4};
    	int result = obj.maxProfit(prices);
    	System.out.println(result);
    	
    	
    }
}
