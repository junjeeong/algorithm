import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class BOJ1763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        HashSet<String> hashSet = new HashSet<>();
        List<String> twiceArr = new ArrayList<>();

        for(int i=0;i<N;i++){
            hashSet.add(br.readLine());
        }

        for(int i=0;i<M;i++){
            String targetString = br.readLine();
            if(hashSet.contains(targetString)) twiceArr.add(targetString);
        }

        Collections.sort(twiceArr);
        
        System.out.println(twiceArr.size());
        for(String el : twiceArr) {
            System.out.println(el);
        }
    }
}