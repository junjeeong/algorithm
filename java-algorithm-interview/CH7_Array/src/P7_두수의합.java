import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P7_두수의합 {

  static void main() {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt)
        .toArray();
    int targetNum = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for(int i = 0; i< nums.length; i++) {
      if(map.containsKey(targetNum - nums[i]) && i != map.get(targetNum - nums[i])) {
        int[] result = new int[i, map.get(targetNum - nums[i])]);
      }
    }
  }
}
