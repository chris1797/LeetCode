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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy = ListNode(0) // 더미 노드
        var tail = dummy

        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                // l1의 값이 더 작으면 l1을 tail에 연결하고, l1을 다음 노드로 이동
                tail.next = l1
                l1 = l1.next
            } else {
                tail.next = l2
                l2 = l2.next
            }

            tail = tail.next!! // 다음 노드로 이동
        }

        tail.next = l1 ?: l2

        return dummy.next
    }
}