import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p4_가장흔한단어 {
  static void main() {
    Scanner scanner = new Scanner(System.in);

    HashMap<String, Integer> wordCount = new HashMap<>();
    String paragrpah = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
    String banned =  scanner.nextLine();

// .replaceAll("[^a-zA-Z0-9]", "")

    List<String> words = Arrays.stream(paragrpah.split(" ")).filter(word -> !word.equals(banned)).toList();

    for(String word : words) {
      if(wordCount.containsKey(word)) {
        wordCount.put(word, wordCount.get(word) + 1);
      } else{
        wordCount.put(word, 1);
      }
    }

    // HashMap에서 value가 가장 높은 key를 어떻게 가져오지?
    int maxValue = Collections.max(wordCount.values());

    String maxkey = wordCount.entrySet().stream().filter(entry -> entry.getValue() == maxValue).findFirst().get().getKey();

    System.out.println(maxkey);

  }

}
