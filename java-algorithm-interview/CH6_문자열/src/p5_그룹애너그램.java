import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p5_그룹애너그램 {

  static void main() {
    Scanner scanner = new Scanner(System.in);
    String[] energrams = scanner.nextLine().split(" ");
    HashMap<String, List<String>> gramsMap = new HashMap<>();

    for(String gram : energrams) {
      char[] charsOfGram = gram.toCharArray();
      Arrays.sort(charsOfGram);
      String sortedWord = String.valueOf(charsOfGram);

      List<String> list = gramsMap.computeIfAbsent(sortedWord, k -> new ArrayList<>());

      list.add(gram);
    }

    for(String word : gramsMap.keySet()) {
      System.out.println(gramsMap.get(word));
    }
  }

}
