package dev.franco.sorts;

public class Sort {

    public static void bubbleSort(int[] data) {
        for(int indexLastUnsortedElement = data.length - 1 ; indexLastUnsortedElement > 0 ; indexLastUnsortedElement--) {
            for(int j = 0 ; j < indexLastUnsortedElement ; j++) {
                if(data[j] > data[j+1])
                    swap(data, j, j+1);
            }
        }
    }


    public static void selectionSort(int[] data) {
        for(int i = 0 ; i < data.length ; i++) {
            int minimum = data[i];
            int lastIndex = i;
            for(int j = i + 1 ; j < data.length ; j++) {
                if(data[j] < minimum) {
                    minimum = data[j];
                    lastIndex = j;
                }

            }
            swap(data, i, lastIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
