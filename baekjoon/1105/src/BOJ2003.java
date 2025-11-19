import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        //데이터 처리 완료

        int s_index = 0;
        int e_index = 0;
        int sum = A[0];
        int count = 0;

        while(e_index < N) {
            if(sum < M) { // 현재 부분합이 목표보다 작은 경우
                e_index++;
                if(e_index < N) {
                    sum += A[e_index];
                } else {
                    break;
                }
            } else if(sum > M) { // 현재 부분 합이 목표보다 큰 경우
                sum -= A[s_index];
                s_index++;
            } else { // 일치하는 경우
                count++;
                sum -= A[s_index];
                s_index++;
                e_index++;
                if(e_index < N) {
                    sum += A[e_index];
                } else {
                    break;
                }
            }
        }
        System.out.println(count);

    }
}