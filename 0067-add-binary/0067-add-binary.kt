class Solution {
    fun addBinary(a: String, b: String): String {
            var aIndex = a.length - 1
            var bIndex = b.length - 1
            var result = StringBuilder()
            var carry = 0

            while (aIndex >= 0 || bIndex >= 0 || carry != 0) {
                var sum = 0
                if (aIndex >= 0) sum += a[aIndex].digitToInt()
                if (bIndex >= 0) sum += b[bIndex].digitToInt()
                sum += carry
                
                carry = sum / 2
                result.append(sum % 2)
                aIndex--
                bIndex--
            }

            return result.reverse().toString()
    }
}