package jason.company;

import java.util.Scanner;

public class Main {
    // we set this at static so the static methods can access it directlu
    // it is private so other classes can't access it
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	    // user will only enter numbers
        // create static scanner for input
        // print minimum element in array

        readIntegers(5);
    }

    public static int[] readIntegers(int count) {
        int[] arr = new int[count];
        System.out.println("Enter how many digit you want your array.");
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println(finMin(arr));

        return arr;
    }

    public static String finMin(int[] array) {
        int lowestNum = array[0];
//        int lowestNum = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowestNum) {
                lowestNum = array[i];
            }
        }

        return "The lowest number is: " + lowestNum;
    }


}
