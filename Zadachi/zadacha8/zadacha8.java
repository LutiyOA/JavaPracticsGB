package Zadachi.zadacha8;
/* 
8.	* Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.
Пример для доски 5х5 решение может выглядеть так.
25	14	3	8	19
4	9	18	13	2
15	24	1	20	7
10	5	22	17	12
23	16	11	6	21
*/

public class zadacha8 {
    static final int hodHorse[][] = new int[][] {
            { -2, -1 },
            { -2, 1 },
            { 2, -1 },
            { 2, 1 },
            { 1, -2 },
            { 1, 2 },
            { -1, -2 },
            { -1, 2 }
    };

    static int razmerBoard = 5;
    static int[][] board = new int[razmerBoard][razmerBoard];

    public static void main(String[] args) {
        moveHorse(1, 0, 0);
    }

    static void printBoard() {
        for (int i = 0; i < razmerBoard; i++) {
            for (int j = 0; j < razmerBoard; j++)
                System.out.printf("%2d ", board[i][j]);
            System.out.println();
        }
        System.out.println("-------------------------------------------");
    }

    public static boolean moveHorse(int numHod, int row, int col) {
        // достигли результата - печатаем его
        if (numHod > razmerBoard * razmerBoard) {
            printBoard();
            return true;
        }

        // вышли за пределы доски - неудача
        if (row < 0 || col < 0 || row >= razmerBoard || col >= razmerBoard) {
            return false;
        }

        if (board[row][col] == 0) {
            board[row][col] = numHod;
            
            for (int i = 0; i < hodHorse.length; i++) {
                if (moveHorse(numHod + 1, row + hodHorse[i][0], col + hodHorse[i][1]))
                    return true;
            }
            board[row][col] = 0;
            return false;
        } 
        
        return false;
    }
}
