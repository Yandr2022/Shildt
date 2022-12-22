package yandrLearning.shildtTasks.part6.returningObjectsFromMethods;

 class ErrorMsg {
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
        ErrorMsg msg = new ErrorMsg();
        System.out.println(msg.getErrorMsg(2));
        System.out.println(msg.getErrorMsg(10));
    }
}
