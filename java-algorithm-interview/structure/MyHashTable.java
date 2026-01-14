public class MyHashTable {

  private static class Node {

    String key;
    Integer value;
    Node next;

    Node(String key, Integer value) {
      this.key = key;
      this.value = value;
      this.next = null;
    }
  }

  private Node[] table;
  private int size;

  public MyHashTable(int capacity) {
    this.table = new Node[capacity];
    this.size = capacity;
  }

  private int hash(String key) {
    // 문자열의 hashCode를 배열 크기로 나눈 나머지를 사용
    return Math.abs(key.hashCode()) % size;
  }

  public void put(String key, Integer value) {
    int idx = hash(key);
    Node newNode = new Node(key, value);

    if (table[idx] == null) {
      // 해당 칸이 비어있으면 바로 삽입
      table[idx] = newNode;
    } else {
      // 해당 칸에 데이터가 있으면(충돌) 리스트를 따라가며 업데이트하거나 끝에 추가
      Node curr = table[idx];
      while (true) {
        if (curr.key.equals(key)) {
          curr.value = value; // 동일한 키가 있으면 값 업데이트
          return;
        }
        if (curr.next == null) {
          break;
        }
        curr = curr.next;
      }
      curr.next = newNode; // 리스트의 마지막에 새 노드 연결
    }
  }

  public Integer get(String key) {
    int idx = hash(key);
    Node curr = table[idx];

    while (curr != null) {
      if (curr.key.equals(key)) {
        return curr.value;
      }
      curr = curr.next; // 리스트를 따라가며 키 찾기
    }
    return null; // 찾는 키가 없으면 null 반환
  }
}