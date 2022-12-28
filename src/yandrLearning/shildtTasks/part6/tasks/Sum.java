package yandrLearning.shildtTasks.part6.tasks;

public class Sum {
    static int sum(int...nums){
        int sum =0 ;
        for (int num: nums) {
            sum+=num;
        }
        return sum;
    }
}
class SumTest{
    public static void main(String[] args) {
        System.out.println(Sum.sum(2,4,6,-20));
    }
}