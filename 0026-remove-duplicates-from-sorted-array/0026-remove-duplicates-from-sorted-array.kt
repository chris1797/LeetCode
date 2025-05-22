class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var uniqueCount = 1 // 고유한 숫자의 개수
        var lastUnique = nums[0] // 마지막으로 추가된 고유한 숫자

        for (i in 1 until nums.size) {
            if (nums[i] != lastUnique) { // 중복이 아닐 경우
                lastUnique = nums[i] // 최근 확인한 숫자 업데이트
                nums[uniqueCount] = nums[i] // 고유한 숫자를 배열에 추가
                uniqueCount++ // 고유한 숫자 개수 증가
            }
        }

        return uniqueCount

    }
}