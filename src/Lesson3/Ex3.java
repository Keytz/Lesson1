package Lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.03.2021
 */

public class Ex3 {

    public static char[][] map;
    public static int sizeMap;
    public static int checkLength =4;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0;1)

    public static void createMap(int size) {
        sizeMap = size;
        map = new char[sizeMap][sizeMap];

        for (int y = 0; y < sizeMap; y++) {
            for (int x = 0; x < sizeMap; x++) {
                map[y][x] = empty;
            }
        }
    }

    public static void printMap() {
        System.out.println("------------------");
        for (int y = 0; y < sizeMap; y++) {
            for (int x = 0; x < sizeMap; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.print("Please write your X - coordinates: ");
            x = scanner.nextInt() - 1;
            System.out.print("Please write your Y - coordinates: ");
            y = scanner.nextInt() - 1;
        } while (!validCell(y, x) || (!emptyCell(y, x)));
        map[y][x] = human;
//        if (validCell(y, x) && emptyCell(y,x)) {
//            map[y][x] = human;
//        } else {
//            turnHuman();
//        }
    }

    public static boolean validCell(int y, int x) {
        return x >= 0 && x < sizeMap && y >= 0 && y < sizeMap;
    }

    public static boolean emptyCell(int y, int x) {
        return map[y][x] == empty;
    }

    public static void turnAi() {
        int x;
        int y;

        do {
            x = random.nextInt(sizeMap); //[0;3)
            y = random.nextInt(sizeMap); //[0;3)
        } while (!emptyCell(y, x));
        map[y][x] = ai;
    }

    public static boolean checkDiagonals(char player) {
        boolean forward, backward;
        forward = true;
        backward = true;
        for (int i = 0; i< checkLength; i++) {
            forward &= (map[i][i] == player);
            backward &= (map[sizeMap-1-i][i] == player);
        }

        if (forward || backward) return true;

        return false;
    }

    public static boolean checkLanes(char player) {
        boolean cols, rows;
        for (int col=0; col<sizeMap; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row< checkLength; row++) {
                cols &= (map[col][row] == player);
                rows &= (map[row][col] == player);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    public static boolean checkWin(char player) {

        if(checkDiagonals(player) || checkLanes(player)) return true;
        return false;
    }

    public static boolean isDraw() {
        for (int y = 0; y < sizeMap; y++) {
            for (int x = 0; x < sizeMap; x++) {
                if (map[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createMap(5);
        printMap();

        while (true) {
            turnHuman();
            printMap();
            if (checkWin(human)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW!!!");
                break;
            }

            turnAi();
            printMap();
            if (checkWin(ai)) {
                System.out.println("AI win!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }
}

/**
 * Полностью разобраться с кодом, попробовать переписать с нуля;
 * ^ Усовершенствовать метод проверки победы (через циклы);
 * ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
 * ^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */
