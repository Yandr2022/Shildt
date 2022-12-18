package yandrLearning.shildtTasks.part2;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;
        b = 10;
        i = b + b;//приведение типов не требуется, тк тип уже повышен до int
        b = (byte) (b * b);//приведение типов требуется
        System.out.println("i = " + i + " b = " + b);
        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);
        System.out.println("ch1 = " + ch1);
    }
}
