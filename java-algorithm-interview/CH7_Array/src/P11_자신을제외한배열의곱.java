import java.util.Arrays;
import java.util.Scanner;

public class P11_자신을제외한배열의곱 {

  static void main() {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] result = new int[nums.length];

    int p = 1;

    for (int i = 0; i < nums.length; i++) {
      result[i] = p;
      p *= nums[i];
    }

    p = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= p;
      p *= nums[i];
    }

    for (int el : result) {
      System.out.printf(el + " ");
    }

  }

}
