import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1269_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A[] = new int[N];
        int B[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<M;i++){
            B[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(A);
        Arrays.sort(B);
        int A_index = 0;
        int B_index = 0;
        int count = 0;

        while(A_index < N && B_index < M) {
            if(A[A_index] < B[B_index]){
                count++;
                A_index++;
            }else if(B[B_index] < A[A_index]){
                count++;
                B_index++;
            }else {
                A_index++;
                B_index++;
            }

        }
        // 둘 중 남은 인덱스가 있다면 count에 증가시키기
        count += N - A_index; // A가 끝까지 안갔다면 남은 원소의 개수 -> 끝까지 갔다면 ex.3-3 = 0
        count += M - B_index; // B가 끝까지 안갔다면 남은 원소의 개수 -> ex예시코드 5-3 = 2
        System.out.println(count);
    }
}
