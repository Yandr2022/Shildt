package yandrLearning.shildtTasks.part13;

public class GenericConstructorTest {
    public static void main(String[] args) {
        byte b = 12;
        Summation sum1 = new Summation(4.0);
        Summation sum2 = new Summation(b);
        System.out.println(sum1.getSum()+" "+sum2.getSum());

    }
}
class Summation{
    int sum;

    <T extends Number> Summation(T num){
        sum = 0;

        for (int i = 0; i <= num.intValue(); i++) {
            sum+=i;
        }

    }

    public int getSum() {
        return sum;
    }
}
