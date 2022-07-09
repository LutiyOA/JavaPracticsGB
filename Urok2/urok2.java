/* 
1) Напишите метод, который принимает на вход строку (String) и 
    определяет является ли строка палиндромом (возвращает boolean значение)

2) Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат - a4b3cd2
*/
package Urok2;
// import java.io.*;

public class urok2 {
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(isPalindrom(s));

        System.out.println(compress("aaaabbbcdd"));
    }

    public static boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;

    }

    public static String compress(String s) {
        // int i = 1;
        String result = "";
        if (s.length()==0) 
            return "";
        int k=1;
        char c=s.charAt(0);

        for (int i=1; i<s.length(); i++ ) {
            if (s.charAt(i)!=c) {
                result+=c;
                if (k!=1) 
                    result+=k;
                k=0;
                c=s.charAt(i);
            }
            k++;
        }
        result+=c;
        if (k!=1) 
            result+=k;

        return result;
    }
}
