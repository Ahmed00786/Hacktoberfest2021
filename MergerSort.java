/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class MergerSort {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] merged = new int[a.length + b.length];
        merge(merged, a, b);

        for (int temp : merged) {
            System.out.print(temp + ", ");
        }
    }

    public static void merge(int[] merged, int[] arrA, int[] arrB) {
        int index = 0, a = 0, b = 0;
        while (a < arrA.length && b < arrB.length) {
            if (arrA[a] < arrB[b]) {
                System.out.println("Shifting ArrA[" + a + "] to merged[" + index + "]");
                merged[index] = arrA[a];
                a++;
                index++;
            } else {
                System.out.println(index+". Shifting ArrB[" + b + "] to merged[" + index + "]");
                merged[index] = arrB[b];
                b++;
                index++;
            }
        }

        while (a < arrA.length) {
            System.out.println(index+". Shifting ArrA[" + a + "] to merged[" + index + "]");
            merged[index] = arrA[a];
            a++;
            index++;
        }
        while (b < arrB.length) {
            System.out.println(index+". Shifting ArrB[" + b + "] to merged[" + index + "]");
            merged[index] = arrB[b];
            b++;
            index++;
        }
        System.out.println("After shifting: ");
        System.out.println("index: " + index);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
