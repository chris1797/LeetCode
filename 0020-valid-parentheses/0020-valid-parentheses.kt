class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val map = mapOf('(' to ')', '{' to '}', '[' to ']')

        for (char in s) {
            if (map.containsKey(char)) { // 여는 괄호인 경우, stack에 해당 value를 추가
                stack.add(map[char]!!)
            } else if (stack.isNotEmpty() && stack.last() == char) {
                stack.removeAt(stack.size - 1)
            } else {
                return false
            }
        }

        return stack.isEmpty()
    }
}