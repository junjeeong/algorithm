package org.example;

import java.util.Scanner;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int M = sc.nextInt();

        int setMin = Integer.MAX_VALUE;
        int Min = Integer.MAX_VALUE;

        for(int i=0; i<M; i++){
            if (!sc.hasNextInt()) return;
            int setNow = sc.nextInt();
            if (!sc.hasNextInt()) return;
            int now = sc.nextInt();

            if(setNow < setMin){
                setMin = setNow;
            }
            if(now < Min){
                Min = now;
            }
        }

        long totalCost = 0;

        long cost1 = (long)N * Min;

        long setsNeeded = (N + 5) / 6;
        long cost2 = setsNeeded * setMin;

        long cost3 = (long)(N / 6) * setMin + Math.min((long)(N % 6) * Min, (long)setMin);

        totalCost = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(totalCost);
    }
}