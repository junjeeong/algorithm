class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class CircularLinkedList {

  private Node head = null;
  private Node tail = null;
  private int size = 0;

  public int size() {
    return size;
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      newNode.next = head;
    } else {
      newNode.next = head;
      head = newNode;
      tail.next = head;
    }
    size++;
  }

  public void addLast(int data) {
    if (head == null) {
      addFirst(data);
    } else {
      Node newNode = new Node(data);
      tail.next = newNode;
      tail = newNode;
      tail.next = head;
      size++;
    }
  }

  public boolean contains(int data) {
    if (head == null) {
      return false;
    }
    Node current = head;
    for (int i = 0; i < size; i++) {
      if (current.data == data) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public void delete(int data) {
    if (head == null) {
      return;
    }

    Node current = head;
    Node prev = tail;
    int count = 0;

    while (count < size) {
      if (current.data == data) {
        if (size == 1) {
          head = null;
          tail = null;
        } else {
          if (current == head) {
            head = head.next;
            tail.next = head;
          } else if (current == tail) {
            tail = prev;
            tail.next = head;
          } else {
            prev.next = current.next;
          }
        }
        size--;
        return;
      }
      prev = current;
      current = current.next;
      count++;
    }
  }

  public void display() {
    if (head == null) {
      System.out.println("리스트가 비었습니다.");
      return;
    }
    Node current = head;
    for (int i = 0; i < size; i++) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}