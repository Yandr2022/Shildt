package yandrLearning.shildtTasks.part5.arrays;

import java.util.Arrays;

public class ArrayManager {
    static void printExtremums(int[] nums) {
        int min, max;
        min = max = nums[0];
        for (int val : nums) {
            min = min > val ? val : min;
            max = max < val ? val : max;
        }
//        for (int i = 1; i < nums.length; i++) {
//            if (min > nums[i]) min = nums[i];
//            if (max < nums[i]) max = nums[i];
//        }
        System.out.println(Arrays.toString(nums)+ "\n max = "+max+"; min = "+min);
    }
    static void bubbleSorter(int[]array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp;
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    static void fillTwoDimArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i * arr[i].length) + j + 1;
            }
        }
    }
static boolean findNumber(int number, int[]array){
        boolean result = false;
    for (int e:array) {
       if (e == number) {result=true;
       break;}
    }
    return result;
}
}
