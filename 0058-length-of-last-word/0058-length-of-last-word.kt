class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        var i = s.length - 1

        while(i >= 0 && s[i] == ' ') {
            i--
        }

        while(i >= 0 && s[i] != ' ') {
            len++
            i--
        }

        return len;
    }
}