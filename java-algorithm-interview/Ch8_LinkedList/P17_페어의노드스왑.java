public class P17_페어의노드스왑 {

  public ListNode swapPairs(ListNode head) {
    ListNode node = head;

    while (node != null && node.next != null) {
      int tmp;

      tmp = node.val;

      node.val = node.next.val;

      node.next.val = tmp;

      node = node.next.next;
    }

    return head;
  }
}