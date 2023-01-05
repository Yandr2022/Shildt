package yandrLearning.shildtTasks.part8.interfaces;

public interface Series {
    int getNext();

    void reset();

    void setStart(int startPoint);

    default int[] getNextArray(int size) {
       return getArray(size);
    }
    default int[] skipAndGetNextArray(int skip,int size){
        getArray(skip);
        return getArray(size);
    }
    private int[] getArray(int size){
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = getNext();
        }
        return temp;
    }
}
