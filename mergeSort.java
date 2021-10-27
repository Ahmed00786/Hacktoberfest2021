/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class mergeSort {

    public static void main(String[] args) {

        int[] arr = {9, 1, 3, 8, 4, 2, 6, 5};
        sort(arr, 0, arr.length - 1);
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }
    }

    public static void sort(int[] arr, int lb, int ub) {
        if (lb < ub) {

            int mid = (lb + ub) / 2;
            sort(arr, lb, mid);
//            for (int i = lb; i <= mid; i++) {
//                System.out.print(arr[i] + " \t");
//            }
            System.out.println("");
            sort(arr, mid + 1, ub);
//            for (int i = mid+1; i <= ub; i++) {
//                System.out.print(arr[i] + " \t");
//            }
            System.out.println("");
            merge(arr, lb, mid, ub);
        }
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int s1 = mid - lb + 1;
        int s2 = ub - mid;
        int[] arrA = new int[s1];
        int[] arrB = new int[s2];

        for (int i = 0; i < s1; i++) {
            arrA[i] = arr[lb + i];
        }
        System.out.println("Lower Half");
        for (int item : arrA) {
            System.out.print(item + "\t");
        }
        for (int j = 0; j < s2; j++) {
            arrB[j] = arr[mid + 1 + j];
        }
        System.out.println("");
        System.out.println("Upper Half");
        for (int item : arrB) {
            System.out.print(item + "\t");
        }
        System.out.println("");
        int index = lb, a = 0, b = 0;
        while (a < arrA.length && b < arrB.length) {
            if (arrA[a] < arrB[b]) {
                arr[index] = arrA[a];
                a++;
                index++;
            } else {
                arr[index] = arrB[b];
                b++;
                index++;
            }
        }

        while (a < arrA.length) {
            arr[index] = arrA[a];
            a++;
            index++;
        }
        while (b < arrB.length) {
            arr[index] = arrB[b];
            b++;
            index++;
        }
    }
}
