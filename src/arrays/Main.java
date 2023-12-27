package arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

/*        int[] array = generateRandomIntArray(10);
        System.out.println(Arrays.toString(array));

        int[] clonedArray = Arrays.copyOf(array, 10);
        Arrays.sort(clonedArray);
        System.out.println(Arrays.toString(clonedArray));

        for (int i = 0; i < array.length; i++) {
            array[i] = clonedArray[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] unsortedArray = generateRandomIntArray(12);
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArrayDescOrder = sortIntArrayDesc(unsortedArray);
        System.out.println(Arrays.toString(sortedArrayDescOrder));*/

    }

    public static int[] generateRandomIntArray(int length) {

        Random random = new Random();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] sortIntArrayDesc (int[] array) {
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
