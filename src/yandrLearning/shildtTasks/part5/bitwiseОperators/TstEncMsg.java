package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class TstEncMsg {
    public static void main(String[] args) {
        String msg = "Java is Great";
        String encMsg = EnCode.encryptMsg(msg);
        System.out.println(encMsg);
        encMsg = EnCode.encryptMsg(encMsg);
        System.out.println(encMsg);
    }
}
