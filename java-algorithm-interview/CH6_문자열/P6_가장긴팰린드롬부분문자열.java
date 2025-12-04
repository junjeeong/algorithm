import java.util.Scanner;

public class P6_가장긴팰린드롬부분문자열 {

  private static int startIndex;
  private static int endIndex;

  static void main() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    if (s.length() == 1) {
      System.out.println(s);
    }

    for (int i = 0; i < s.length(); i++) {
      checkPelindrom(s, i, i + 1);
      checkPelindrom(s, i, i + 2);
    }

    System.out.println(s.substring(startIndex, endIndex));

  }

  private static void checkPelindrom(String s, int j, int k) {
    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
      j--;
      k++;
    }

    if (endIndex < k - j - 1) {
      startIndex = j + 1;
      endIndex = k - j - 1;
    }
  }


}
