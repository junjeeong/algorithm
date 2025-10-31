import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 명령 이름

            switch (command) {
                case "push_front":
                    // push_front X: 정수 X를 덱의 앞에 넣는다.
                    int X_front = Integer.parseInt(st.nextToken());
                    deque.addFirst(X_front);
                    break;

                case "push_back":
                    // push_back X: 정수 X를 덱의 뒤에 넣는다.
                    int X_back = Integer.parseInt(st.nextToken());
                    deque.addLast(X_back);
                    break;

                case "pop_front":
                    // pop_front: 가장 앞의 수를 빼고 출력. 없으면 -1.
                    if (deque.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;

                case "pop_back":
                    // pop_back: 가장 뒤의 수를 빼고 출력. 없으면 -1.
                    if (deque.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;

                case "size":
                    // size: 덱에 들어있는 정수의 개수 출력.
                    sb.append(deque.size()).append('\n');
                    break;

                case "empty":
                    // empty: 덱이 비어있으면 1, 아니면 0 출력.
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    // front: 덱의 가장 앞에 있는 정수를 출력. 없으면 -1.
                    if (deque.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.peekFirst()).append('\n');
                    }
                    break;

                case "back":
                    // back: 덱의 가장 뒤에 있는 정수를 출력. 없으면 -1.
                    if (deque.isEmpty()) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}