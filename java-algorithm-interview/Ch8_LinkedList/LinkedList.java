class Node {

  int data;
  Node next;
}

class LinkedList {

  Node head = null;
  Node tail = null;
  int size = 0;

  public void addAtHead(Node node) {
    if (this.head == null) {
      this.head = node;
    } else {
      node.next = this.head;
      this.head = node;
    }
    this.size++;
  }

  public void addAtTail(Node node) {
    if (this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node; // linkedList에 있는 tail이라는 node의 next에 새로운 node를 연결한 것 -> 실제 list를 조작한 것
      this.tail = node; // linkedList가 관리하고 있는 list에 대한 데이터 중 tail을 업데이트 한 것 (util 필드)
    }
    this.size++; //마찬가지로, linkedList가 관리하고 있는 list에 전체 길이(util 필드) size를 업데이트 한 것 (list가 CRUD 되었기 때문에)
  }

  public void addAtIndex(int index, Node node) {

    if (this.size < index) {
      this.tail.next = node;
      this.tail = node;
      this.size++;
      return;
    }

    if (index == 0) {
      node.next = this.head;
      this.head = node;
      this.size++;
      return;
    }

    Node prevNode = this.head;
    Node currentNode = this.head;

    while (index > 0) {
      prevNode = currentNode;
      currentNode = currentNode.next;
      index--;
    }

    node.next = currentNode;
    prevNode.next = node;
    this.size++;
  }

  public void deleteAtHead() {
    this.head = this.head.next;
  }

  public void deleteAtTail() {

    if (this.head == null) {
      return;
    }

    if (this.head.next == null) {
      this.head = null;
      this.tail = null;
      this.size--;
      return;
    }

    Node prevNode = this.head;
    Node currentNode = this.head;

    while (currentNode.next != null) {
      prevNode = currentNode;
      currentNode = currentNode.next;
    }

    prevNode.next = null;

    this.tail = prevNode;
    this.size--;
  }

  public int get(int index) {
    if (index >= size) {
      return -1;
    }

    Node currentNode = this.head;
    while (index-- > 0) {
      currentNode = currentNode.next;
    }
    return currentNode.data;
  }

  public int indexOf(int data) {
    int index = 0;
    Node currentNode = this.head;

    while (currentNode != null) {
      if (currentNode.data == data) {
        return index;
      }
      currentNode = currentNode.next;
      index++;
    }

    return -1;
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void clear() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void printAll() {
    Node currentNode = this.head;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }
}