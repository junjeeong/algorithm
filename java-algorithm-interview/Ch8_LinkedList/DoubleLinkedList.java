class Node {

  int data;
  Node next;
  Node prev;

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class DoubleLinkedList {

  Node head;
  Node tail;
  int size;

  // 1. 삽입 관련 메서드
  // 리스트의 맨 앞에 데이터를 추가합니다.
  public void addFirst(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
      tail = node;
      size++;
      return;
    }
    node.next = head;
    head.prev = node;
    head = node;
    size++;

  }

  // 리스트의 맨 뒤에 데이터를 추가합니다.
  public void addLast(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
      tail = node;
      size++;
      return;
    }

    tail.next = node; //추가할때 양방향 연결만 신경써주면 됨 -> 사실 단일 연결리스트하고 크게 차이가 없음.
    node.prev = tail;
    tail = node;
    size++;

  }

  // 지정된 인덱스 위치에 데이터를 추가합니다.
  public void add(int index, int data) {

    if (index < 0 || index > size) {
      return -1;
    }

    if (index == 0) {
      addFirst(data);
      return;
    }
    if (index == size) {
      addLast(data);
      return;
    }

    Node newNode = new Node(data);
    Node prevNode = head;

    for (int i = 0; i < index - 1; i++) {
      prevNode = prevNode.next;
    }

    Node nextNode = prevNode.next;

    newNode.next = nextNode;
    newNode.prev = prevNode;
    prevNode.next = newNode;
    nextNode.prev = newNode;

    size++;

  }

  // 2. 삭제 관련 메서드

  // 리스트의 첫 번째 노드를 삭제하고 데이터를 반환합니다.
  public int removeFirst() {
    if (head == null) { // list가 없으면 삭제할 것이 없으니 정상 작동 no
      return -1;
    }

    int data = head.data; // 삭제할 노드의 데이터를 반환해야 하니, 삭제 이전에 데이터 저장

    head = head.next; // 기존에 head가 사라지니 head는 기존에 head의 next

    if (head == null) { // head.next가 null이면 노드가 하나였다는 뜻 -> tail도 null 처리해줘야 함.
      this.tail = null;
    } else { // head.next가 null이 아니면 node가 둘 이상이라는 것. -> tail은 따로 있음. -> head.prev만 null 처리해주면 됨.
      head.prev = null;
    }

    size--; // 항상 삽입 삭제 시에는 size 관리
    return data; // 데이터를 반환한다고 했으니 저장해 두 data 반환하는 모습.
  }

  // 리스트의 마지막 노드를 삭제하고 데이터를 반환합니다.
  public int removeLast() {

    if (head == null) {
      return -1;
    }

    if (size == 1) {
      return removeFirst();
    }

    int data = tail.data;
    this.tail = tail.prev;
    this.tail.next = null;
    size--;

    return data;
  }

  // 지정된 인덱스 위치의 노드를 삭제하고 데이터를 반환합니다.
  public int remove(int index) {

    if(index < 0 || index >= size) {
      return -1
    }


    return 0;
  }

  // 3. 조회 및 수정 관련 메서드

  // 지정된 인덱스의 데이터를 반환합니다.
  public int get(int index) {
    return 0;
  }

  // 지정된 인덱스의 데이터를 새 데이터로 변경합니다.
  public void set(int index, int data) {
  }

  // 특정 데이터가 몇 번째 인덱스에 있는지 찾습니다. (찾지 못하면 -1)
  public int indexOf(int data) {
    return -1;
  }

  // 4. 상태 확인 관련 메서드

  // 리스트에 저장된 데이터의 개수를 반환합니다.
  public int size() {
    return size;
  }

  // 리스트가 비어있는지 확인합니다.
  public boolean isEmpty() {
    return size == 0;
  }

  // 리스트의 모든 데이터를 비웁니다.
  public void clear() {
  }

  // 전체 데이터를 문자열 형태로 반환합니다. (예: "1 <-> 2 <-> 3")
  public String toString() {
    return "";
  }
}