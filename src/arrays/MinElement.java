package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(readIntegers()));
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integer numbers, separated by commas: ");
        String input = scanner.next();
        String[] stringArray = input.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            //intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
/*        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }*/
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
