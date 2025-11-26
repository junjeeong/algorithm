import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P11_자신을제외한배열의곱 {

  // @Notice 나눈셈을 하지 않고 O(n)에 풀이하라.
  static void main() {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int finalI = i;
      result.add(Arrays.stream(nums).filter(num -> num != nums[finalI]).reduce(1, (a, b) -> a * b));
    }

  }

}
