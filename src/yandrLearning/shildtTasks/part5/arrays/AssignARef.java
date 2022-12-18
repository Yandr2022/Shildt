package yandrLearning.shildtTasks.part5.arrays;

import java.util.Arrays;

public class AssignARef {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = - i;
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2)+'\n');
        nums2 = nums1;
        System.out.println("nums2 after assignment: "+Arrays.toString(nums2)+ '\n');
        nums2[2] =33;
        System.out.println("nums1 after changing through nums2: "+Arrays.toString(nums1)+ '\n');

    }
}
