public class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
    
    // wrong way, question is asking for the max profit  
    //        int buyingPrice = prices[0];
    //        int buyingCounter = 0;
    //
    //        for (int i = 0; i < prices.length; i++) {
    //            if(prices[i] < buyingPrice && prices[i] <= prices[buyingCounter]) {
    //                buyingPrice = prices[i];
    //                buyingCounter = i;
    //
    //            }
    //        }
    //
    //        int sellingCounter = 0;
    //        int sellingPrice = 0;
    //
    //        for (int j = buyingCounter; j < prices.length; j++) {
    //            if(prices[j] > sellingPrice) {
    //                sellingPrice = prices[j];
    //            }
    //        }
    //
    //        System.out.println(buyingPrice);
    //        System.out.println(sellingPrice);
    //
    //        return sellingPrice - buyingPrice;
    //    }

}
