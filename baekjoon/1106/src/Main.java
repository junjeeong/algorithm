import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count_switch = Integer.parseInt(br.readLine());
        int[] arr_switch = new int[count_switch];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<count_switch; i++){
            arr_switch[i] = Integer.parseInt(st.nextToken());
        }

        int count_students = Integer.parseInt(br.readLine());


        for(int i=0; i<count_students; i++){
            st = new StringTokenizer(br.readLine(), " ");

            String gender = Integer.parseInt(st.nextToken()) ==  1 ? "male" : "female";
            int number = Integer.parseInt(st.nextToken());

            if(gender.equals("male")) {
                maleSwitch(arr_switch, number);
            }
            if(gender.equals("female")) {
                femaleSwitch(arr_switch, number);
            }
        }

        for (int i = 0; i < arr_switch.length; i++) {
            System.out.print(arr_switch[i] + ( (i + 1) % 20 == 0 ? "\n" : " "));
        }
        System.out.println();
    }

    public static void maleSwitch(int[] list, int n){
        if (list.length == 0 || n <= 0) return;

        // N의 배수번째 스위치 (1-based)를 찾아 토글
        // i는 1, 2, 3... 번째를 의미. N의 배수만 찾아 list[i-1]에 접근
        for(int i=n; i<=list.length; i += n){
            int index = i - 1; // 1-based i -> 0-based index
            list[index] = 1 - list[index]; // 1이면 0으로, 0이면 1로 토글
        }
    }

    public static void femaleSwitch(int[] list, int n) {
        if (list.length == 0 || n <= 0) return;

        int M = n - 1; // N번째 스위치 (1-based) -> M번째 인덱스 (0-based)

        // 1. 대칭 범위 (s_index, e_index) 찾기. 초기값은 M
        int s_index = M;
        int e_index = M;

        while (true) {
            int prev_idx = s_index - 1;
            int next_idx = e_index + 1;

            // 경계 체크: 배열 범위를 벗어나면 break
            if (prev_idx < 0 || next_idx >= list.length) {
                break;
            }

            // 대칭 확인
            if (list[prev_idx] == list[next_idx]) {
                s_index = prev_idx; // 대칭 범위 확장
                e_index = next_idx;
            } else {
                break; // 대칭이 아님
            }
        }

        // 2. 대칭 범위 (s_index부터 e_index까지)의 스위치 값 반전
        for (int i = s_index; i <= e_index; i++) {
            list[i] = 1 - list[i]; // 1이면 0으로, 0이면 1로 토글
        }
    }
}