package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class EnCode {
    private static final int KEY = 88;
    private static final String KEYS = "klkhhgfnn";

    static String encryptMsg(String msg) {
        StringBuilder encMsg = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            encMsg.append((char) (msg.charAt(i) ^ KEY));
        }
        return encMsg + "";
    }

    static String encryptMsg2(String msg) {
        StringBuilder encMsg = new StringBuilder();
        for (int i = 0, j = 0; i < msg.length(); i++, j++) {
            encMsg.append((char) (msg.charAt(i) ^ KEYS.charAt(j)));
            j = j == 8 ? 0 : j;
        }
        return encMsg + "";
    }
}
