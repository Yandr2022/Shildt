package yandrLearning.shildtTasks.part13.tasks;

public class GenericStackDemo {
    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        GenStack<Integer> stack = new GenStack<>(arr);
        try {
            for (int i = 0; i < arr.length; i++) {
                stack.push(i);
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        String names[] = {"One", "Two", "Three"};
        String storeStr[] = new String[3];
        GenStack<String> stackStr = new GenStack<>(storeStr, names);

        GenStack<String> stackStrCopy = new GenStack<>(storeStr, stackStr);

        int n;
        String s;
        try {
            System.out.println("stackInt:");
            for (int i = 0; i < arr.length; i++) {
                n = stack.pop();
                System.out.print(n + " ");
            }
            System.out.println("\nstackStr:");
            for (int i = 0; i < storeStr.length; i++) {
                s = stackStr.pop();
                System.out.print(s + " ");
            }
            System.out.println("\nstackStrCopy:");
            for (int i = 0; i < storeStr.length; i++) {
                s = stackStrCopy.pop();
                System.out.print(s + " ");
            }

        } catch (StackEmptyException e) {
            System.out.println(e);

        }
    }
}

interface IFGenStack<T> {
    void push(T obj) throws StackFullException;

    T pop() throws StackEmptyException;
}

class StackFullException extends Exception {
    int size;

    StackFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nStack is Full. Max size = " + size;
    }
}

class StackEmptyException extends Exception {


    @Override
    public String toString() {
        return "\nStack is empty";
    }
}

class GenStack<T> implements IFGenStack<T> {
    private T[] stck;
    private int tos;

    GenStack(T[] stackArr) {
        stck = stackArr;
        tos = 0;
    }

    GenStack(T[] stackArr, GenStack<T> stack) {
        stck = stackArr;
        tos = stack.tos;
        try {
            if (stack.stck.length > stck.length) {
                throw new StackFullException(stck.length);
            }
        } catch (StackFullException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < tos; i++) {
            stck[i] = stack.stck[i];
        }
    }

    public GenStack(T[] stackArr, T[] a) {
        stck = stackArr;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException e) {
                System.out.println(e);
            }
        }
    }

    public void push(T elem) throws StackFullException {
        if (tos == stck.length) {
            throw new StackFullException(stck.length);
        }
        stck[tos++] = elem;
    }

    public T pop() throws StackEmptyException {
        if (tos == 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }

}