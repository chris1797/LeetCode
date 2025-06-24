class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) return listOf(1)

        val result = mutableListOf<List<Int>>()

        for (i in 0..rowIndex) {
            val row = MutableList(i + 1) { 1 } // 모든 요소를 1로 초기화
            if (i >= 2) {
                val prev = result[i - 1]
                for (j in 1 until i) {
                    row[j] = prev[j - 1] + prev[j]
                }
            }
            result.add(row)
        }

        println(result)

        return result[rowIndex]
    }
}