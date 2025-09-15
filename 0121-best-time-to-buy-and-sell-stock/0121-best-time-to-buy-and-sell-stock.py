class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        min_price = 100000 # 최대값
        max_profit = 0
        for price in prices:
            # 현개 가격이 min_price 보다 작으면 min_price 갱신
            if price < min_price:
                min_price = price
            
            elif price - min_price > max_profit:
                max_profit = price - min_price
                
        return max_profit