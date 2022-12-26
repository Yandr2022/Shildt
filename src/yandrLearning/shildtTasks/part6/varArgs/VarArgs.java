package yandrLearning.shildtTasks.part6.varArgs;

import java.util.Arrays;

public class VarArgs {
    static  void vaTest(int...args){
        System.out.println("args count " + args.length);
        System.out.println("args = " + Arrays.toString(args)+'\n');
    }
    static  void vaTest(boolean ...args){
        System.out.println("args count " + args.length);
        System.out.println("args = " + Arrays.toString(args)+'\n');
    }
    static  void vaTest(String msg,int count,int...args){
        System.out.println(count+msg);
        System.out.println("args = " + Arrays.toString(args)+'\n');
    }
//    static  void vaTest(String msg,int...args){   Error: call ambiguity
//        System.out.println(msg);
//        System.out.println("args = " + Arrays.toString(args)+'\n');
//    }
}
class VarArgsTest{
    public static void main(String[] args) {
        VarArgs.vaTest(10);
        VarArgs.vaTest(1,5,8);
//        VarArgs.vaTest(); Error: call ambiguity
        VarArgs.vaTest(new int[]{1,2,3,4,5});
        VarArgs.vaTest(true);
        VarArgs.vaTest(true,false,true);
        VarArgs.vaTest(new boolean[]{false,true,true,false,false});
        String msg = " elements in an array";
        VarArgs.vaTest(msg,1,10);
        VarArgs.vaTest(msg,3,1,5,8);
        VarArgs.vaTest(msg,0);
        VarArgs.vaTest(msg,5,new int[]{1,2,3,4,5});

    }
}
