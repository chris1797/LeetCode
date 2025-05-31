class Solution {
    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var first = 1
        var second = 2

        for (i in 3..n) {
            val temp = second
            second += first
            first = temp
        }

        return second
    }
}