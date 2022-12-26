package yandrLearning.shildtTasks.part6.tasks;

public class Test {
    private int a ;

   Test(int a) {
        this.a = a;
    }
    int getA(){
       return a;
    }
    void  swap(Test test){
       int temp = a;
       a = test.a;
       test.a = temp;
    }
}
class TestDemo{
    public static void main(String[] args) {
        Test test = new Test(5);
        Test test1 = new Test(15);
        System.out.println("test.a = " + test.getA());
        System.out.println("test1.a = " + test1.getA());
        test.swap(test1);
        System.out.println("test.a = " + test.getA());
        System.out.println("test1.a = " + test1.getA());
    }
}
