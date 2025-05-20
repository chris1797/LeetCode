class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val map = mapOf('(' to ')', '{' to '}', '[' to ']')

        for (char in s) {
            if (map.containsKey(char)) {
                stack.add(map[char]!!)
            } else if (stack.isNotEmpty() && stack.last() == char) {
                stack.removeLast()
            } else {
                return false
            }
        }

        return stack.isEmpty()

    }
}