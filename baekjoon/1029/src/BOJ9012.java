import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

    public static String solve(String ps) {
        Stack<Character> stack = new Stack<>();

        for (char ch : ps.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                // 닫는 괄호인데 스택이 비어 있으면, 짝이 없으므로 바로 NO
                if (stack.isEmpty()) {
                    return "NO";
                }
                // 짝이 있으므로 pop
                stack.pop();
            }
        }

        // 문자열 순회가 끝난 후 최종 검사
        // 스택이 완전히 비어있어야 VPS (YES)
        if (stack.isEmpty()) {
            return "YES";
        } else {
            // 스택에 여는 괄호가 남아 있으면 VPS 아님 (NO)
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력을 모으기 위한 StringBuilder

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String ps = br.readLine();
            sb.append(solve(ps)).append('\n');
        }

        System.out.print(sb);
    }
}