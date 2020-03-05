package dev.franco.sorts;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arra = random();

        Sort.selectionSort(arra);

        for (int t = 0 ; t < arra.length ; t++) {
            System.out.println(arra[t]);
        }


    }

    private static int[] random() {
        Random random = new Random();
        int[] data = new int[10];
        for(int i = 0 ; i < 10 ; i++) {
            data[i] = random.nextInt(100);
        }
        return data;
    }
}
