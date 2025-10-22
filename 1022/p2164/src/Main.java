import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();

        for(int i=1; i<=N;i++) {
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.poll();
            int underNumber = queue.poll();
            queue.add(underNumber);
        }

        System.out.printf("%d", queue.poll());
    }
}