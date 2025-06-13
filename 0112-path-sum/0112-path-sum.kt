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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        fun getSum(root: TreeNode?, target: Int): Boolean {
            if (root == null) {
                return false
            }

            val newSum = target + root.`val`

            if (root.left == null && root.right == null) return newSum == targetSum

            return getSum(root.left, newSum) || getSum(root.right, newSum)
        
        }

        return getSum(root, 0)
    }
}