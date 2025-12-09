public ListNode mergeKLists(LiNode[] lists) {
  PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
    if (o1.val == o2.val) {
      return 0;
    } else if (o1.val > o2.val) {
      return 1;
    } else {
      return -1;
    }
  });
  ListNode root = new ListNode(0);
  ListNode tail = root;

  for (ListNode node : lists) {
    if (node != null) {
      pq.add(node);
    }
  }

  while (!pq.isEmpty()) {
    tail.next = pq.poll();
    tail = tail.next;

    if (tail.next != null) {
      pq.add(tail.next);
    }
  }

  return root.next;
}