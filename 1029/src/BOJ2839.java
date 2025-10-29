import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 5kg 봉투를 최대 개수(N/5)부터 시작하여 0개까지 줄여나간다.
        int maxFiveKg = N / 5; // N = 11 -> 2
        int minBags = -1; // 최소 봉투 개수 (-1로 초기화)

        for (int fiveKg = maxFiveKg; fiveKg >= 0; fiveKg--) {
            int remaining = N - (fiveKg * 5); // 5kg 봉투를 사용하고 남은 무게 // 11 - 10 = 1

            // 남은 무게가 3kg으로 나누어 떨어지는지 확인
            if (remaining % 3 == 0) {
                int threeKg = remaining / 3;
                minBags = fiveKg + threeKg;
                break; // 최소 개수를 찾았으므로 즉시 반복문 종료
            }
        }

        System.out.println(minBags);
    }
}