package yandrLearning.shildtTasks.part6.constructorOverloading;

class Summation {
    int sum;

    public Summation(int num) {
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
    }

    public Summation(Summation sum) {
        this.sum = sum.sum;
    }
}
class SummationTest{
    public static void main(String[] args) {
        Summation summation = new Summation(5);
        Summation summation1 = new Summation(summation);

        System.out.println(summation.sum);
        System.out.println(summation1.sum);
    }
}

