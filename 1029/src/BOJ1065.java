import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        sc.close();

        if (N < 100) {
            System.out.println(N);
            System.exit(0);
        } else {
            count = 99; // 1부터 99까지는 무조건 한수, 99부터 시작
            int limit = (N == 1000) ? 999 : N; // 1000이 들어오면 1000은 한수가 아님, 999까지만 검사
            for(int i = 100; i <= limit; i++){

                int 백의자리 = i / 100;
                int 십의자리 = (i / 10) % 10;
                int 일의자리 = i%10;

                if((백의자리-십의자리) == (십의자리-일의자리)) count++;
            }
        }
        System.out.println(count);
    }
}
