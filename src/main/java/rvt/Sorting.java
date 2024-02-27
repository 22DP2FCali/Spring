package rvt;
import java.util.Arrays;

public class Sorting {
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

public static int[] sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
        swap(array, i, indexOfSmallestFrom);
    }
    return array;
}

public static void main(String[] args) {
    int[] numbers = {3, 2, 5, 4, 8};
    System.out.println("Smallest: " + smallest(numbers));
    System.out.println("Index of the smallest number: " + indexOfSmallest(numbers));
    System.out.println(Sorting.indexOfSmallestFrom(numbers, 0));
    System.out.println(Sorting.indexOfSmallestFrom(numbers, 1));
    System.out.println(Sorting.indexOfSmallestFrom(numbers, 2));

    System.out.println(Arrays.toString(numbers));

    Sorting.swap(numbers, 1, 0);
    System.out.println(Arrays.toString(numbers));

    Sorting.swap(numbers, 0, 3);
    System.out.println(Arrays.toString(numbers));
}
}

