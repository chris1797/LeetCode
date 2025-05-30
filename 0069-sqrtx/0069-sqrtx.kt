class Solution {
    fun mySqrt(x: Int): Int {
        var left = 0
        var right = x
        var result = 0

        while (left <= right) {
            val mid = (left + right) / 2
            val square = mid.toLong() * mid.toLong()

            if (square == x.toLong()) {
                return mid 
            } else if (square < x) {
                result = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }
}