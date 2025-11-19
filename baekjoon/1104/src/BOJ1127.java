import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ1127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lopeArray = new ArrayList<>();
        List<Integer> resultArr = new ArrayList<>();

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            lopeArray.add(sc.nextInt());
        }

        lopeArray.sort((a,b) -> b-a); // 내림차순 정렬

        int order = 1;
        for(int i=0; i<N; i++){
            resultArr.add(lopeArray.get(i) * order);
            order++;
        }
        int maxResult = Collections.max(resultArr);

        System.out.println(maxResult);
    }
}
