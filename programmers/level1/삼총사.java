class Solution {
  int answer = 0;

  public int solution(int[] number) {
    findThree(number, 0, 0, 0);
    return answer;
  }

  private void findThree(int[] number, int start, int pickedCount, int currentSum) {
    if (pickedCount == 3) {
      if (currentSum == 0) {
        answer++;
      }
      return;
    }

    for (int i = start; i < number.length; i++) {
      findThree(number, i + 1, pickedCount + 1, currentSum + number[i]);
    }
  }
}