package yandrLearning.shildtTasks.part6.InnerClasses;

import java.util.Arrays;

public class OuterClass {
    int[] arr;

    public OuterClass(int[] arr) {
        this.arr = arr;
    }

    void analyze() {
        InnerClass aClass = new InnerClass();
        System.out.println(Arrays.toString(arr) + "\nmin = " + aClass.min() + "\nmax = " + aClass.max()
                + "\navg = " + aClass.avg());
    }

    class InnerClass {
        int min() {
            int min = 0;
            for (int el : arr) {
                min = min > el ? el : min;
            }
            return min;
        }

        int max() {
            int max = 0;
            for (int el : arr) {
                max = max > el ? max : el;
            }
            return max;
        }

        double avg() {
            int sum = 0;
            for (int el : arr) {
                sum += el;
            }
            return (double) sum / arr.length;
        }

    }
}

class NestedClassTest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 0, 4, 12, -6, 3};
        OuterClass outerClass = new OuterClass(arr);
        outerClass.analyze();
    }
}

