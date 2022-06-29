package Urok1;

import java.io.*;
import java.util.Arrays;

/*
2. Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"
*/
// package Urok1;

public class urok1_zadanie2 {
    static String result = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input N: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Input K: ");
        int k = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        perestanovkiRec(array, n, k, 0);
        System.out.println(result);

    }

    public static void perestanovkiRec(int[] array, int n, int k, int index) {
        if (index == n) {
            result += Arrays.toString(array) + " ";
            return;
        }

        for (int i = 0; i < k; i++) {
            array[index] = i;
            perestanovkiRec(array, n, k, index + 1);
        }

    }
}
