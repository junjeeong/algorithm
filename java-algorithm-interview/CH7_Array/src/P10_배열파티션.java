import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10_배열파티션 {

  static void main() {
    Scanner scanner = new Scanner(System.in);
    List<Integer> pair = new ArrayList<>();
    int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int sum = 0;

    Arrays.sort(arr);

    for (int i : arr) {
      pair.add(i);

      if (pair.size() == 2) {
        sum += Collections.min(pair);
        pair.clear();
      }
    }

    System.out.println(sum);
  }
}