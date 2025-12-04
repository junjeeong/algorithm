import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P9_세수의합 {

  static void main() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(array);

    List<Integer> sum = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sum.add(array[i] + array[j]);
      }
    }
    Collections.sort(sum);

    for (int k = N - 1; k >= 0; k--) {
      for (int z = 0; z < N; z++) {
        int a = array[k] - array[z];

        if (Collections.binarySearch(sum, a) >= 0) {
          System.out.println(array[k]);
          return;
        }
      }
    }
  }
}
