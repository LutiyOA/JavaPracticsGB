package Zadachi.zadacha1;

// import javax.xml.crypto.Data;

/**
 * Zadachi
 * 1.	Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000

 */
public class Zadacha1 {

    public static void main(String[] args) {
        System.out.println(calcPowRec(2,512));
        System.out.println(calcPowRec(-2,3));
        System.out.println(calcPowRec(2,-3));
        System.out.println(calcPowRec(0,0));
        System.out.println(calcPowRec(0,-3));
    }

    public static double calcPow(double a, int b) {
        double result=1;

        if (b==0) return 1;
        if (a==0) return 0;
        
        if (b<0) {
            a=1/a;
            b=-b;
        }
        while (b>0) {
            result*=a;
            b--;
        }

        return result;
    }

    public static double calcPowRec(double a, int b) {
        double result=1;

        if (b==0) return 1;
        if (a==0) return 0;
        
        if (b<0) return calcPowRec(1/a,-b);
        
        result=calcPowRec(a, b/2);
        result= (b%2==0) ? result*result : result*result*a;

        return result;
    }
}