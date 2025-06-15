class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 1) return listOf(listOf(1))

        val result = mutableListOf<List<Int>>()

        for (i in 0 until numRows) {
            val row = MutableList(i + 1) { 1 } // 모든 요소를 1로 초기화
            if (i >= 2) {
                val prev = result[i - 1]
                for (j in 1 until i) {
                    row[j] = prev[j - 1] + prev[j]
                }
            }
            result.add(row)
        }

        return result
    }
}