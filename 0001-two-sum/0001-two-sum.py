class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} # 지나온 [값, 인덱스] 기록

        for (i, num) in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
