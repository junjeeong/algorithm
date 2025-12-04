void main() {
  Scanner scanner = new Scanner(System.in);
  List<Integer> pair = new ArrayList<>();

  int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

  Arrays.sort(nums); // ex. [1,4,2,5,8,6,] -> [1,2,4,5,6,8]

  if (nums.length % 2 != 0) {
    return;
  }

  for (int i = 0; i < nums.length; i += 2) {
    pair.add(Math.min(nums[i], nums[i + 1]));
  }

  System.out.println(pair.get(pair.size() - 1) + pair.get(pair.size() - 2));
}