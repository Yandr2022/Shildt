package yandrLearning.shildtTasks.part14;

public class VarCapture {
    public static void main(String[] args) {
        int var =10;
        MyFunc myLambda = ( n)->{
            int v = var+n;
//            var++; error
            return v;
        };
//        var+=1; error
        System.out.println(myLambda.func(8));

    }
}
interface  MyFunc{
    int func(int n);
}