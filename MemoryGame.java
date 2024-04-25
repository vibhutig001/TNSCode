package MemoryGame1;

import java.util.HashMap;
import java.util.Scanner;

public class MemoryGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Invalid input for N.");
            return;
        }

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        int Q = sc.nextInt();
        if (Q <= 0) {
            System.out.println("Invalid input for Q.");
            return;
        }

        for (int i = 0; i < Q; i++) {
            int queryValue = sc.nextInt();
            if (countMap.containsKey(queryValue)) {
                System.out.println(countMap.get(queryValue));
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        sc.close();
    }
}

