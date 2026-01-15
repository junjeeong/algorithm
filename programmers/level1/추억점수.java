import java.util.*;

class Solution {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    Map<String, Integer> pointTable = new HashMap<>();

    for (int i = 0; i < name.length; i++) {
      pointTable.put(name[i], yearning[i]);
    }

    int[] answer = new int[photo.length];

    for (int i = 0; i < photo.length; i++) {
      int total = 0;
      for (String person : photo[i]) {
        total += pointTable.getOrDefault(person, 0);
      }
      answer[i] = total;
    }

    return answer;
  }
}