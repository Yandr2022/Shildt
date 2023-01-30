package yandrLearning.shildtTasks.part16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTest implements ActionListener {
JLabel jLabel;

    public ButtonTest() {
        JFrame jfrm = new JFrame("Button example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);
        jfrm.add(jButtonUp);
        jfrm.add(jButtonDown);
        jLabel = new JLabel("Press button");
        jfrm.add(jLabel);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Up"))
            jLabel.setText("Button was Up");
        else
            jLabel.setText("Button was Down");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonTest();
            }
        });
    }
}
