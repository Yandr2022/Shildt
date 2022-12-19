package yandrLearning.shildtTasks.part6.accessModifiers;

public class FailSoftArray {
    private int[] arr;
    private int errVal;
    int length;

    public FailSoftArray(int size, int errVal) {
        arr = new int[size];
        this.errVal = errVal;
        length = arr.length;
    }
    public int getErrVal(){
        return errVal;
    }

    public int getValue(int index) {
        return indexValidate(index) ? arr[index] : errVal;
    }

    public boolean putValue(int index, int value) {
        boolean result = indexValidate(index);
        if (result) arr[index] = value;
        return result;
    }

    private boolean indexValidate(int index) {
        return index >= 0 && index < length;
    }
}
