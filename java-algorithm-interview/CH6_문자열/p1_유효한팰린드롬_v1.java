import java.util.Scanner;

public class p1_유효한팰린드롬_v1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String string = sc.nextLine().toUpperCase().replaceAll(" ", "");

    for (int i = 0; i < string.length(); i++) {
      if (i == string.length() - 1 - i) {
        break;
      }

      if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
        continue;
      } else {
        System.out.println(false);
        System.exit(1);
      }
    }

    System.out.println(true);
  }
}
