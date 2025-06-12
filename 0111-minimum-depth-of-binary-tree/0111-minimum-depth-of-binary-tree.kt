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
    fun minDepth(root: TreeNode?): Int {

        fun getDepth(root: TreeNode?): Int {
            if (root == null) return 0

            var left = getDepth(root.left)            
            var right = getDepth(root.right)

            println("left :: " + left)
            println("right :: " + right)

            if (left == 0) return right + 1
            if (right == 0) return left + 1
            
            return min(left, right) + 1
            
        }

        return getDepth(root)
        
    }
}