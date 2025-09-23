class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} # 지나온 [값, 인덱스] 기록

        for (i, num) in enumerate(nums):
            complement = target - num # 필요한 값
            if complement in seen: # 필요한 값(key)이 지금 seen에 있나?
                return [seen[complement], i] # 있다면 [해당 값의 index, 현재 index] 로 return
            seen[num] = i # 없다면 seen[해당 값] = 현재 index

        # 문제 구조 상 for문이 다 돌때까지 못찾을 일은 없으니 따로 마지막 return은 없어도 됨.