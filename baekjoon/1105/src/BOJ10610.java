import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nToArray = sc.nextLine().split("");
        int[] numberArray = Arrays.stream(nToArray).mapToInt(Integer::parseInt).toArray();

        if(Arrays.stream(numberArray).filter(i-> i == 0).findFirst().isEmpty()) {
            System.out.println(-1);
        } else if(Arrays.stream(numberArray).sum() % 3 !=0 ) {
            System.out.println(-1);
        } else {
            int[] sortedArray = Arrays.stream(numberArray).boxed().sorted((a,b) -> b-a).mapToInt(Integer::intValue).toArray();
            String result = Arrays.stream(sortedArray).mapToObj(String::valueOf).collect(Collectors.joining());

            System.out.println(result);
        }
    }
}
