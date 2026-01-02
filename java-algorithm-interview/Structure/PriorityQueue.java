public class PriorityQueue {

  private int[] heap;
  private int size;
  private int capacity;

  public PriorityQueue(int capacity) {
    this.capacity = capacity;
    this.heap = new int[capacity + 1];
    this.size = 0;
  }


  public void insert(int value) {
    if (size >= capacity) {
      throw new IndexOutOfBoundsException("큐가 가득 찼습니다.");
    }

    heap[++size] = value;
    int current = size;

    while (current > 1 && heap[current] > heap[current / 2]) {
      swap(current, current / 2);
      current = current / 2;
    }
  }


  public int delete() {
    if (size == 0) {
      throw new RuntimeException("큐가 비어있습니다.");
    }

    int root = heap[1];
    heap[1] = heap[size--];

    heapify(1);
    return root;
  }

  private void heapify(int index) {
    int largest = index;
    int left = index * 2;
    int right = index * 2 + 1;

    if (left <= size && heap[left] > heap[largest]) {
      largest = left;
    }

    if (right <= size && heap[right] > heap[largest]) {
      largest = right;
    }

    if (largest != index) {
      swap(index, largest);
      heapify(largest);
    }
  }

  private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  public boolean isEmpty() {
    return size == 0;
  }
}