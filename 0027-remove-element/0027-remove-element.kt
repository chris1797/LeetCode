class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0

        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                nums[count] = nums[i]
                count++
            }
        }

        return count
    }
}