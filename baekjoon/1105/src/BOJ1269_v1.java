import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ1269_v1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arrayA = new int[A];
        int[] arrayB = new int[B];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<A; i++){
            arrayA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<B; i++){
            arrayB[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> aSet = Arrays.stream(arrayA)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> bSet = Arrays.stream(arrayB)
                .boxed()
                .collect(Collectors.toSet());

        int[] aMinusB = Arrays.stream(arrayA).filter(el-> !bSet.contains(el)).toArray();
        int[] bMinusA = Arrays.stream(arrayB).filter(el-> !aSet.contains(el)).toArray();
        int length = IntStream.concat(Arrays.stream(aMinusB), Arrays.stream(bMinusA)).toArray().length;

        System.out.println(length);
    }
}
