package yandrLearning.shildtTasks.part6.quickSort;

import java.util.Arrays;

public class QuickSort {
    static void qSort(char[] arr) {
        qS(arr, 0, arr.length - 1);
    }


    private static void qS(char[] arr, int left, int right) {
        int l = left, r = right;
        char bas = arr[(left + right) / 2], temp;
        do {
            while (arr[l] < bas && l < right) l++;
            while (arr[r] > bas && r > left) r--;
            if (l <= r) {
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        } while (l <= r);
        if (left < r) qS(arr, left, r);
        if (right > l) qS(arr, l, right);
    }
}

class QuickSortTest {
    public static void main(String[] args) {
        char[] arr = {'N', 'V', 'g', 'C', 'a', 'Z', 'R'};
        QuickSort.qSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
