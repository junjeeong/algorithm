import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int t = 0; t < N; t++) {
            Stack<Character> st = new Stack<>();
            String line = br.readLine();

            if (line == null || line.isEmpty()) {
                continue;
            }

            char[] text = line.toCharArray();

            st.push(text[0]);

            for (int i = 1; i < text.length; i++) {
                char now = text[i];

                if (!st.empty() && st.peek().equals(now)) {
                    st.pop();
                } else {
                    st.push(now);
                }
            }
            if (st.empty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}