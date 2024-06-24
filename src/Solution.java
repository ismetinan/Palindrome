public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node = null;
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode current1 = head.next;
        while (current1 != null) {
            current.next = new ListNode(current1.val);
            current = current.next;
            current1 = current1.next;
            
        }
        
        while (head != null) {  
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        while (newHead != null && node != null) {
            if (newHead.val != node.val) {
                return false;
            }
            newHead = newHead.next;
            node = node.next;
        }
        return true;
    }
}