/*
 * 5.	Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

package Zadachi.zadacha5;

import java.util.Arrays;
import java.util.ArrayList;

public class zadacha5 {
    static char[] textGlobal;
    static char[] textGlobalReal;
    static ArrayList<Integer> signIndexes = new ArrayList<>();
    static int count=0;

    public static void main(String[] args) {
        String text = "2? + ?? = 69";
        char[] textChar = text.replace(" ", "").toCharArray();

        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=')
                textChar[i] = '-';

            if (textChar[i] == '?')
                signIndexes.add(i);
        }

        textGlobal = textChar;
        int[] comb = new int[signIndexes.size()];

        generateCombination(comb, 0, 10);
        if (count==0) {
            System.out.println("Solve is't exists");
        }
    }

    public static void checkIt(int[] comb) {
        char[] copyTextGlobal = textGlobal.clone();

        for (int i = 0; i < signIndexes.size(); i++) {
            copyTextGlobal[signIndexes.get(i)] = Integer.toString(comb[i]).toCharArray()[0];
        }

        String[] numbers = String.valueOf(copyTextGlobal).split("-");
        // System.out.println(Arrays.toString(numbers));

        int[] numbersArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            numbersArray[i] = Integer.parseInt(numbers[i]);

        if (numbersArray[0] + numbersArray[1] == numbersArray[2]) {
            System.out.printf("%d + %d = %d\n", numbersArray[0], numbersArray[1], numbersArray[2]);
            count++;
        }

    }

    public static void generateCombination(int[] comb, int index, int k) {
        if (index == comb.length) {
            checkIt(comb);
            return;

        }

        for (int i = 0; i < k; i++) {
            comb[index] = i;
            generateCombination(comb, index + 1, k);
        }

    }

}
