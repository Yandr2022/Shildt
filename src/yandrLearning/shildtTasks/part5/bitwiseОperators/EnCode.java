package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class EnCode {
    private static final int KEY = 88;

    static String encryptMsg(String msg) {
        StringBuilder encMsg = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            encMsg.append((char) (msg.charAt(i) ^ KEY));
        }
        return encMsg + "";
    }
}
