package yandrLearning.shildtTasks.part8.interfaces;

import java.util.Arrays;

public interface IFConst {
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "range error";
}

class IFConstTest implements IFConst {
    public static void main(String[] args) {
        int[] nums = new int[MAX];
        for (int i = 0; i < 12; i++) {
            if (i >= MAX) System.out.println(ERRORMSG);
            else
                nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
    }
}