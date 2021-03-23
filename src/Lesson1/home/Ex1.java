package Lesson1.home;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(firstEx(1, 2, 3, 3));
        System.out.println(secondEx(4,30));
        System.out.println(thirdEx(0));
        System.out.println(fourEx("Вася"));
        System.out.println(fiveEx(2020));
    }

    public static float firstEx(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean secondEx(int a, int b) {
        if ((a + b) > 10 && (a + b) > 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String thirdEx(int a) {
        if (a > -1) {
            return "+";
        } else {
            return "-";
        }
    }

    public static String fourEx(String name) {
        return "Привет, "+name+"!";
    }

    public static String fiveEx(int year) {
        if ((year%400)==0 && (year%100)>0 || (year%4)==0){
            return "leap";
        }
        else {
            return "non-leap";
        }
    }
}
