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
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        
        fun buildTree(start: Int, end: Int): TreeNode? {
            if (start > end) return null

            val mid = (start + end) / 2
            val node = TreeNode(nums[mid])

            node.left = buildTree(start, mid - 1)
            node.right = buildTree(mid + 1, end)

            return node
        }

        return buildTree(0, nums.size - 1)
    }
}