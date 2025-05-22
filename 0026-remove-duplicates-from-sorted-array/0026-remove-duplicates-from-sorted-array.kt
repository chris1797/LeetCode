class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

    var uniqueCount = 1 // 고유한 숫자의 개수
    var lastUnique = nums[0] // 마지막으로 추가된 고유한 숫자

    for (i in 1 until nums.size) {
        if (nums[i] != lastUnique) {
            nums[uniqueCount] = nums[i]
            lastUnique = nums[i]
            uniqueCount++
        }
    }

    return uniqueCount
    }
}