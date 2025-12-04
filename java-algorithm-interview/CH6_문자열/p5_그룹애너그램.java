import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p5_그룹애너그램 {

  static void main() {
    // 입력값은 공백을 구분으로 문자열의 나열이 들어온다 -> ex. "eat tea tan ate ant cat"
    // 각 문자를 모두 정렬했을 때 최종 문자열이 똑같다면 -> 애너그램
    // 문자열을 받아 -> 문자로 나눠 -> 문자를 정렬해 -> 원래 문자를 저장해 key는 -> 애너그램으로 분류 -> 똑같은 애너그램으로 나오는 원래의 문자열 그룹핑
    // 그룹핑 완료 -> key의 개수만큼 순회하며 value를 print HashMap<String, List<anargram>>

    Scanner scanner = new Scanner(System.in);
    String[] anagrams = scanner.nextLine().split(" ");
    HashMap<String, List<String>> anagramMap = new HashMap<>();

    for (String anagram : anagrams) {
      char[] chars = anagram.toCharArray();
      Arrays.sort(chars);
      String sortedString = String.valueOf(chars);

      List<String> groupingAnagrams = anagramMap.computeIfAbsent(sortedString,
          k -> new ArrayList<>());

      groupingAnagrams.add(anagram);
    }

    // map의 key만큼 list를 print
    anagramMap.forEach((k, v) -> {
      System.out.println(v);
    });


  }

}
