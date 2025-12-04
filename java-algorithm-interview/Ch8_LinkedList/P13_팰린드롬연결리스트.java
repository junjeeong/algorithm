void main() {
  // 팰린드롬이냐 -> 앞뒤로 확인할 수 있는 자료구조 = Deque
  Scanner sc = new Scanner(System.in);
  int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
  Deque<Integer> deque = new LinkedList<>();

  for (int num : nums) {
    deque.push(num);
  }

  // deque가 모두 비거나, 1개 이하 일떄까지 비교
  while (!deque.isEmpty() && deque.size() > 1) {
    if (deque.pollFirst() != deque.pollLast()) { //빼고 비교하고를 반복
      System.out.println(false);
      return;
    }
  }

  // 요소가 하나 남았거나 하나밖에 안 남은 경우 = 끝까지 앞뒤가 일치했다. = 팰린드롬 연결리스트다.
  System.out.println(true);

}