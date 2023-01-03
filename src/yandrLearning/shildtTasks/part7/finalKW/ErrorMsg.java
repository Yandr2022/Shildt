package yandrLearning.shildtTasks.part7.finalKW;

 class ErrorMsg {
     final int OUTERR =0;
     final int INERR = 1;
     final int DISKERR = 2;
     final int INDEXERR = 3;
    String[] msgs = {"Output error",
            "Input Error",
            "Out of disk space",
            "Index out of range"};

    String getErrorMsg(int index) {
        return index >= 0 && index < msgs.length ? msgs[index] : "Wrong error code";
    }
}
class ErrorMsgTest {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
