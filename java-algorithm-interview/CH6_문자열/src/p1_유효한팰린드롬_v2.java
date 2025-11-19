import java.util.Scanner;

public class p1_유효한팰린드롬_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    String filteredS = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    String reverseS = new StringBuilder(filteredS).reverse().toString();
    System.out.println(filteredS.equals(reverseS));
  }
}
