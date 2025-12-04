void main() {
  Scanner sc = new Scanner(System.in);
  int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

  int min = nums[0];
  int max = 0;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] < min) {
      min = nums[i];
      max = 0;
    } else if (nums[i] > max) {
      max = nums[i];
    }
  }

  System.out.println(max - min);
}