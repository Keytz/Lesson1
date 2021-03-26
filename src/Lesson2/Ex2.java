package Lesson2;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
      int[] sourceArray={1,1,1,0,0,1,0,1,0,0,0};
      int[] secondArray=new int[8];
      int[] thirdArray={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

      funkFirst(sourceArray);
      System.out.println(Arrays.toString(sourceArray));

      functSecond(secondArray);
      System.out.println(Arrays.toString(secondArray));

      funkThird(thirdArray);
      System.out.println(Arrays.toString(thirdArray));

      System.out.println(functMin(thirdArray));
      System.out.println(functMax(thirdArray));
    }
    //Задание №1
    public static void funkFirst(int[] arr) {
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i] == 1) {
                arr[i]=0;
            }else if (arr[i]==0) {
                arr[i]=1;
            }
        }
    }

    //Задание 2
public static void functSecond(int[] arr){
        arr[0]=1;
        for(int i=1; i<=arr.length-1; i++) {
            arr[i]=arr[i-1]+3;
        }
}


//Задание 3
public static void funkThird(int [] arr) {
        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }
}

// Задание 4
    public static int functMin(int [] arr) {
        int min=arr[0];
        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i]<min){
                min=arr[i];

            }

        }
        return min;
    }
    public static int functMax(int [] arr) {
        int max=arr[0];
        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }
}

