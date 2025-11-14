package org.example;

import java.util.Scanner;

public class BOJ3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S[] = new int[N];

        for(int i=0; i<N; i++){
            S[i] = sc.nextInt();
        }

        int firstRing = S[0];

        for(int i = 1; i < N; i++){
            int currentRing = S[i];

            int g = gcd(firstRing, currentRing);

            int a = firstRing / g;
            int b = currentRing / g;

            System.out.println(a + "/" + b);
        }

        sc.close();
    }

    static int gcd(int a, int b){
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}