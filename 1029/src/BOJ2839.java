import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int fiveBags = N/5; // N = 18 -> 3

        for(int minBags = fiveBags; minBags >=0; minBags--){
            int remaining = N - (minBags * 5);

            if(remaining % 3 ==0) {
                int threeBags = remaining / 3; // remaining = 3 -> 1
                System.out.println(minBags + threeBags);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}