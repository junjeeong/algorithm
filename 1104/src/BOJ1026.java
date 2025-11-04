import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrayA = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arrayB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> resultList = new ArrayList<>();

        if(arrayA.length > 0) Arrays.sort(arrayA); // NlogN
        if(arrayB.length > 0) Arrays.sort(arrayB); // NlogN

        for(int i=0;i<N;i++){
            resultList.add(arrayA[i] * arrayB[N-i-1]);
        }

        int totalSum = resultList.stream()
                .mapToInt(Integer::intValue) // 또는 .mapToInt(i -> i)
                .sum();

        System.out.println(totalSum);
    }
}
