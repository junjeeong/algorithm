import java.util.Arrays;
import java.util.Scanner;

public class P7_두수의합v2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nums = Arrays.stream(sc.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
    int target = sc.nextInt();

    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];

      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      } else {
        System.out.println(nums[left] + " " + nums[right]);
        return;
      }
    }

    System.out.println("없음");
  }
}