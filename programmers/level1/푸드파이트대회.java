//[손으로 풀기]
//1.일단 0번 인덱스인 물은 어차피 하나밖에 없으니까 무시하고 1번 음식부터 확인한다.
//2.각 음식을 2로 나눈 몫이 바로 한 사람이 먹을 개수가 된다. (나머지는 버려도 됨)
//3.StringBuilder에 1번 음식부터 순서대로 계산한 개수만큼 번호를 붙여준다.
//4.왼쪽 사람이 먹을 음식이 다 완성되면, 그 뒤에 물(0)을 하나 붙인다.
//5.마지막으로 아까 만든 왼쪽 음식을 뒤집어서(reverse) 오른쪽에 붙여준다. 끝!

class Solution {
  public String solution(int[] food) {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < food.length; i++) {
      int count = food[i] / 2;

      for (int j = 0; j < count; j++) {
        sb.append(i);
      }
    }

    String leftSide = sb.toString();

    String rightSide = sb.reverse().toString();

    return leftSide + "0" + rightSide;
  }
}