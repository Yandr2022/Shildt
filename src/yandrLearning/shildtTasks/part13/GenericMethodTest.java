package yandrLearning.shildtTasks.part13;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[]arr1 = {1,2,3,4,5,};
        Integer[]arr2 = {1,2,3,4,5,};
        Integer[]arr3 = {1,2,7,4,5};
        Integer[]arr4 = {1,2,7,4,5,6};

        System.out.println(arraysEquals(arr1,arr1));
        System.out.println(arraysEquals(arr1,arr2));
        System.out.println(arraysEquals(arr1,arr3));
        System.out.println(arraysEquals(arr3,arr4));
//        Double[] darr = {1.0,1.4,1.6};
//        System.out.println(arraysEquals(arr1,darr));
    }

    static <T extends Comparable<T>, V extends T> boolean arraysEquals(T[] arr1, V[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
