void main() {
  LinkedList<Integer> list_1 = new LinkedList<>(Arrays.asList(1, 2, 5));
  LinkedList<Integer> list_2 = new LinkedList<>(Arrays.asList(1, 3, 4));

  // 결과를 저장할 새 리스트
  LinkedList<Integer> merged = new LinkedList<>();

  int i = 0, j = 0;

  // 두 리스트를 오름차순으로 병합
  while (i < list_1.size() && j < list_2.size()) {
    if (list_1.get(i) <= list_2.get(j)) {
      merged.add(list_1.get(i));
      i++;
    } else {
      merged.add(list_2.get(j));
      j++;
    }
  }

  // 남은 요소 추가
  while (i < list_1.size()) {
    merged.add(list_1.get(i));
    i++;
  }

  while (j < list_2.size()) {
    merged.add(list_2.get(j));
    j++;
  }

  System.out.println(merged);
}
