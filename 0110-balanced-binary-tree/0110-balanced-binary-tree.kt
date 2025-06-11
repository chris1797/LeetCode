/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        fun getDepth(root: TreeNode?): Int {
            if (root == null) return 0

            val left = getDepth(root.left)
            val right = getDepth(root.right)

            println("root :: " + root.`val`)
            println("left :: " + left)
            println("right :: " + right)

            if (left == -1 || right == -1 || abs(left - right) > 1) {
                println("불균형 감지: root=${root?.`val`}, left=$left, right=$right")
                return -1
            }

            return maxOf(left, right) + 1
        }

        return getDepth(root) != -1
    }
}