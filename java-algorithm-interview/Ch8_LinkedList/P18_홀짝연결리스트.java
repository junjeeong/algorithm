public class P18_홀짝연결리스트 {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode odd = head;

    ListNode even = head.next;

    ListNode evenHead = even;

    // 반복하면서 홀짝 노드 처리
    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      even.next = even.next.next;

      // 홀짝 한 칸씩 이동
      odd = odd.next;
      even = even.next;
    }

    // 홀수 노드 마지막을 짝수 첫번째와 연결
    odd.next = evenHead;
    
    // 첫번째 노드 리턴
    return head;
  }

}
