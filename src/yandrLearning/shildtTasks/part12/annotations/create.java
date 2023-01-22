package yandrLearning.shildtTasks.part12.annotations;

public class create {
    @MyAnno(str = "Example annotations",val =100)
    public static void myMeth() {

    }
}
@interface MyAnno{
    String str();
    int val();
}