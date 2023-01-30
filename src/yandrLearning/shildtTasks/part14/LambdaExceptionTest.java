package yandrLearning.shildtTasks.part14;

import java.io.IOException;
import java.io.Reader;

public class LambdaExceptionTest {
    public static void main(String[] args) {
        MyIOAction action = (reader )->{
          int ch = reader.read();
            return true;
        };

    }
}
interface MyIOAction{
    boolean ioAction(Reader reader) throws IOException;

}