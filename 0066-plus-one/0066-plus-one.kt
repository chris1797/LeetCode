class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var isCarry = false
        val newArray: IntArray

        for (i in digits.size - 1 downTo 0) {
            digits[i]++

            if (digits[i] < 10) return digits
            digits[i] = 0
        }

        var result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}