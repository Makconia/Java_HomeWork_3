// 1.Реализовать алгоритм сортировки слиянием и выборкой.

import java.util.Arrays;
 
public class Task1 {
    public static void main(String[] args) {
 
        int[] array = new int[] { 9, 1, 8, 7, 6, 5, 1, 4, 3, 2, 1, 0 };
        int[] sortArr = SortSelect(array);
        System.out.println(Arrays.toString(sortArr));
        SortMerge(array, array.length);
        System.out.println(Arrays.equals(array, sortArr)); //сривниваем результат сортировки выбором и слиянием на соответствие
 
    }
 
    // Сортировка выбором:
    public static int[] SortSelect(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int minNumber = arr[i];
                if (minNumber > arr[j]) {
                    int sor;
                    sor = arr[j];
                    arr[j] = arr[i];
                    arr[i] = sor;
                }
            }
 
        }
        return arr;
    }


 
    // Сортировка слиянием:
public static void SortMerge(int[] arr, int size) {
    if (size<=1){
        return;
    }
    int mid = arr.length/2;
    
    int [] arrL = new int[mid];
    int [] arrR = new int[size - mid];
 
    for (int i = 0; i < mid; i++) {
        arrL[i] = arr[i];
    }
    for (int j = mid; j < size; j++) {
        arrR[j-mid] = arr[j];
    }
    SortMerge (arrL, mid );
    SortMerge(arrR, size - mid);
 
    merge(arr, arrL, arrR, mid, size - mid);
 
}
 
public static void merge(int[] a, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
}