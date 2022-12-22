package yandrLearning.shildtTasks.part6.returningObjectsFromMethods;

 class Error {
    String msg;
    int severityRate;

    public Error(String msg, int severityRate) {
        this.msg = msg;
        this.severityRate = severityRate;
    }
}

class ErrorInfo {
    String[] msgs = {"Output error",
            "Input Error",
            "Out of disk space",
            "Index out of range"};
    int[] severityRates = {3, 3, 2, 4};

    Error getErrorInfo(int index) {
        return index >= 0 && index < msgs.length ? new Error(msgs[index], severityRates[index])
                : new Error("Wrong error code", 0);
    }


}

class ErrorTest {
    public static void main(String[] args) {
        ErrorInfo errorInfo = new ErrorInfo();
        Error error = errorInfo.getErrorInfo(2);
        System.out.println(error.msg + " " + error.severityRate);
        error = errorInfo.getErrorInfo(19);
        System.out.println(error.msg + " " + error.severityRate);
    }
}
