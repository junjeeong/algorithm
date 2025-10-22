import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열의 길이
        int[] S = new int[N]; // 수열을 담을 배열
        Stack<Integer> stack = new Stack<>(); // 스택 초기화
        StringBuffer sb = new StringBuffer(); // 성공했을떄 문자열 만들기 위함

        for(int i=0; i<N; i++){
            S[i] = sc.nextInt(); // 수열 초기화
        }

        int num = 1;

        for(int i=0; i<N; i++){
            int su = S[i];
            if(su >= num){
                while(su >= num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    return;
                } else {
                    sb.append("-\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
