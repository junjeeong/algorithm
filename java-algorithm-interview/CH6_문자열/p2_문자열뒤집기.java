import java.util.Scanner;

public class p2_문자열뒤집기 {
  static void main() {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    char[] stringToarr =  input.toCharArray();

    for(int i = 0; i < input.length(); i++) {
      if(i == stringToarr.length-1-i) break;

      char temp =  stringToarr[i];
      stringToarr[i] = stringToarr[stringToarr.length-1-i];
      stringToarr[stringToarr.length-1-i] = temp;
    }

    System.out.println(stringToarr);
  }
}
