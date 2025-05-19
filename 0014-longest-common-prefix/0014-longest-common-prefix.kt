class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var firstStr: String = strs[0]

        for (i in strs[0].length downTo 1) {
            // strs[0]의 문자와 나머지 요소들에 해당 prefix가 있는지 검사
            val prefix = firstStr.substring(0, i)
            if (strs.all { it.startsWith(prefix) }) {
                return prefix
            }
        }

        return ""
    }
}