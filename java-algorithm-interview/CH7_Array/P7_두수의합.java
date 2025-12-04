import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P7_두수의합 {

  static void main() {
    Scanner sc = new Scanner(System.in);

    HashMap<Integer, Integer> numIndexMap = new HashMap<>();
    int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int target = sc.nextInt();

    for (int i = 0; i < nums.length; i++) {
      numIndexMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      if (numIndexMap.containsKey(target - nums[i]) && i != numIndexMap.get(target - nums[i])) {
        System.out.println(Arrays.toString(new int[]{i, numIndexMap.get(target - nums[i])}));
        break;
      }
    }
  }
}
