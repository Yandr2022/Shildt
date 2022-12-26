package yandrLearning.shildtTasks.part6.tasks;


public class Stack {
    private char[] stck;
    private int tos;

    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    Stack(Stack stack) {
        stck = new char[stack.stck.length];
        tos = stack.tos;
        for (int i = 0; i < tos; i++) {
            stck[i] = stack.stck[i];
        }
    }

    public Stack(char[] stck) {
        this.stck = new char[stck.length];
        tos = 0;
        for (int i = 0; i < stck.length; i++) {
            push(stck[i]);
        }
    }

    void push(char ch) {
        if (tos == stck.length) {
            System.out.println(" stack is full");
            return;
        }
        stck[tos++] = ch;
    }

    char pop() {
        if (tos == 0) {
            System.out.println(" stack is empty");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }

}

class StackTest {
    public static void main(String[] args) {
        int size = 10;
        Stack stack = new Stack(size);
        for (int i = 0; i < size; i++) {
            stack.push((char) ('A' + i));
        }
        Stack stack1 = new Stack(new char[]{'T', 'o', 'm'});
        Stack stack2 = new Stack(stack);
        System.out.print("stack: ");
        for (int i = 0; i < size; i++)
            System.out.print(stack.pop());
        System.out.print("\nstack1: ");
        for (int i = 0; i < 3; i++)
            System.out.print(stack1.pop());
        System.out.print("\nstack2: ");
        for (int i = 0; i < size; i++)
            System.out.print(stack2.pop());
    }
}
