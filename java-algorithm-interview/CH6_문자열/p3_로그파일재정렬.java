import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3_로그파일재정렬 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();

    List<String> letterList = new ArrayList<>();
    List<String> digitList = new ArrayList<>();

    for (int i = 1; i <= N; i++) {
      String string = sc.nextLine();
      if (Character.isDigit(string.split(" ")[1].charAt(0))) {
        digitList.add(string);
      } else {
        letterList.add(string);
      }
    }

    letterList.sort((s1, s2) -> {
      String[] s1x = s1.split(" ", 2);
      String[] s2x = s2.split(" ", 2);

      int compared = s1x[1].compareTo(s2x[1]);
      if (compared == 0) {
        return s1x[0].compareTo(s2x[0]);
      } else {
        return compared;
      }
    });

    letterList.addAll(digitList);

    System.out.println(letterList);
  }
}
