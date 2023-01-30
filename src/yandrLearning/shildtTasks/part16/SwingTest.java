package yandrLearning.shildtTasks.part16;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    SwingTest() {
        JFrame jfrm = new JFrame("Simple application");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Interface programming using Swing.");
        jfrm.add(jLabel);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTest();
            }
        });
    }
}
