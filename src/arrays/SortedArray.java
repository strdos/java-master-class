package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        //System.out.println(Arrays.toString(array));
        printArray(array);
        sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers(int length) {
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + length + " integer numbers:");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Invalid format");
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
