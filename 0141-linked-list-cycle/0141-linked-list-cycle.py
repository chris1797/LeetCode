# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # Floyd 알고리즘 적용 (토끼와 거북이)
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head

        while fast and fast.next: # fast와 fast.next 체크
            slow = slow.next
            fast = fast.next.next
            if slow is fast:
                return True

        return False