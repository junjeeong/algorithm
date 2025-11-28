public class Solution {

  public ListNode reverseList(ListNode head) {

    ListNode prev = null;

    while (head != null) {

      ListNode current = head;

      head = head.next;

      current.next = prev;

      prev = current;
    }

    return prev;
  }
}