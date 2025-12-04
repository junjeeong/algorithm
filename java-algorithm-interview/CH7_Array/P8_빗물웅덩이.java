import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P8_빗물웅덩이 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력 예시: 0 1 0 2 1 0 1 3 2 1 2 1
    int[] landHeights = Arrays.stream(sc.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    Deque<Integer> stack = new ArrayDeque<>();
    int puddle = 0;

    for (int i = 0; i < landHeights.length; i++) {
      while (!stack.isEmpty() && landHeights[i] > landHeights[stack.peek()]) {
        int top = stack.pop();

        if (stack.isEmpty()) {
          break;
        }

        int distance = i - stack.peek() - 1;

        int boundedHeight = Math.min(landHeights[i], landHeights[stack.peek()])
            - landHeights[top];

        if (boundedHeight > 0) {
          puddle += distance * boundedHeight;
        }
      }
      stack.push(i);
    }

    System.out.println(puddle);
  }
}