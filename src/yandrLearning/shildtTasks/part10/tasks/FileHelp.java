package yandrLearning.shildtTasks.part10.tasks;

import java.io.*;

public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("D:\\javaHelp.txt");
        System.out.println("Welcome!!!\nExit = 'stop'");
        for (String topic = help.getTopic(); topic.compareToIgnoreCase("stop") != 0; topic = help.getTopic()) {
            System.out.println(help.helpOn(topic) ? "" : "Topic not found");
        }
    }
}

class Help {
    String filePath;

    public Help(String filePath) {
        this.filePath = filePath;
    }

    boolean helpOn(String topic) {
        int ch;
        boolean res = false;
        StringBuilder info = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (ch = reader.read(); ch != -1; ch = reader.read()) {
                if (ch == '#' && topic.compareToIgnoreCase(reader.readLine()) == 0) {
                    res = true;
                    for (String add = reader.readLine(); add != null && add.compareToIgnoreCase("") != 0; add = reader.readLine()) {
                        info.append(add);
                    }
                    System.out.println(info);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        return res;
    }

    String getTopic() {
        StringBuilder builder = new StringBuilder();
        System.out.print("Input topic: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            builder.append(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder + "";
    }
}
