package book.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int data[] = {50, 30, 20, 10, 40};

        //Bubble sort
       /* for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j);
                }
            }
        }
        System.out.println(Arrays.toString(data));

        //Array reverse
        for (int i = 0; i < data.length / 2; i++) {
            swap(data, i, data.length - 1 - i);
        }
        System.out.println(Arrays.toString(data));


        //Insertion sorting
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(data));        */

        for (int i = 1; i < data.length; i++) {
            int newElement = data[i];
            int location = i - 1;
            while (location >= 0 && data[location] > newElement) {
                data[location + 1] = data[location];
                location--;
            }
            data[location + 1] = newElement;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int index) {
        int tmp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = tmp;
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
