package yandrLearning.shildtTasks.part13;

public class GenArraysTest {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        GenArr<Integer>iOb = new GenArr<>(50,arr);
//        GenArr<Integer>iOb2[] = new GenArr<>[10]; java: cannot create array with '<>'
        GenArr<?>iOb2[] = new GenArr<?>[10];

    }
}
class GenArr<T extends Number>{
    T ob;
    T []vals;

    public GenArr(T ob, T[] vals) {
        this.ob = ob;
//        this.vals = new T[vals.length]; cannot create array type T
        this.vals = vals;
    }
}
