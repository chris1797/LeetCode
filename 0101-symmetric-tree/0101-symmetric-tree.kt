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
    fun isSymmetric(root: TreeNode?): Boolean {

        fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
            if (left == null && right == null) return true
            if (left == null || right == null) return false 
            if (left?.`val` != right?.`val`) return false
            
            return isMirror(left?.left, right?.right) &&
                isMirror(left?.right, right?.left)
        }

        return isMirror(root?.left, root?.right)
    }
}