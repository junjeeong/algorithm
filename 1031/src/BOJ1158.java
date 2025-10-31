import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;

public class BOJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            arr.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int index = K - 1;

        while (!arr.isEmpty()) {
            index %= arr.size();

            sb.append(arr.get(index));

            arr.remove(index);

            if (!arr.isEmpty()) {
                sb.append(", ");
            }

            index += K - 1;
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}