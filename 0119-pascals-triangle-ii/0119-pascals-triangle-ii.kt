class Solution {
    // chatGPT 참고 후 개선
    fun getRow(rowIndex: Int): List<Int> {
        var result = mutableListOf(1)

        for (i in 1..rowIndex) {
            val row = MutableList(i + 1) { 1 }
                for (j in 1 until i) {
                    row[j] = result[j - 1] + result[j] // 첫 반복문은 1 until 1이라 실행되지 않음 -> [1, 1]
                }
            result = row
        }

        return result
    }
}