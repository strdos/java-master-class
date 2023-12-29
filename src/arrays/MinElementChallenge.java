package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    public static void main(String[] args) {

        //System.out.println(readInteger());
        //System.out.println(Arrays.toString(readElements(3)));
        System.out.println(findMin(readElements(3)));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number. The number will represent how many elements the array will have. ");

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return -1;
    }

    private static int[] readElements(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Please enter " + length + " integers.");
        try {
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}


