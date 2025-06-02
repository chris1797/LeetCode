/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while(current != null && current.next != null) {
            if (current.`val` == current.next!!.`val`) {
                // 현재 값과 next 값이 같으면, next에 next.next 삽입
                current.next = current.next.next
            } else {
                // 다르면 다음 노드 삽입
                current = current.next
            }


        }

        return head
    }
}