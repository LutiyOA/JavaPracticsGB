/* 
7.	На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
*/

package Zadachi.zadacha7;

public class zadacha7 {
    static int maxRow = 8;
    static int maxCol = 8;
    
    static int kolReshenii=0;

    static int[][] chessBoard = new int[maxRow][maxCol];

    public static void main(String[] args) {

        makePutFerz(0);
        System.out.printf("Найдено %2d решений", kolReshenii);
    }

    static void printBoard() {
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++)
                System.out.printf("%d ", chessBoard[i][j]);
            System.out.println();
        }
        System.out.println("-------------------------------------------");
    }

    static boolean makePutFerz(int row) {
        if (row == maxRow) {
            printBoard();
            kolReshenii++;
            // if (kolReshenii%1000==0) System.out.print("+");
            // return false;
            return true;
        }

        for (int col = 0; col < maxCol; col++) {

            if (checkOk(row, col)) {
                chessBoard[row][col] = 1;
                if (makePutFerz(row + 1))
                    return true;
                else {
                    chessBoard[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean checkOk(int n, int k) {
        // проверяем не стоит ли в этом же столбце сверху какой-нибудь ферзь
        for (int i = n - 1; i >= 0; i--)
            if (chessBoard[i][k] == 1)
                return false;

        // проверяем не стоит ли по диагонале сверху слева какой-нибудь ферзь
        for (int i = n - 1, j = k - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 1)
                return false;
        }

        // проверяем не стоит ли по диагонале сверху справа какой-нибудь ферзь
        for (int i = n - 1, j = k + 1; i >= 0 && j < maxCol; i--, j++) {
            if (chessBoard[i][j] == 1)
                return false;
        }

        // возвращаем, что в эту клетку можно поставить ферзя
        return true;
    }
}
