package yandrLearning.shildtTasks.part16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
    JTextField jtf;
    JButton jbt;
    JLabel jlabPrompt,jlabContent;

    public TextFieldTest() {
        JFrame jfrm = new JFrame("Using Text Field");
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(240,120);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");
        jtf.addActionListener(this);

        jbt = new JButton("Reverse");
        jbt.addActionListener(this);

        jlabPrompt = new JLabel("Enter text: ");
        jlabContent = new JLabel("");

        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbt);
        jfrm.add(jlabContent);

        jfrm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")) {
            String orgStr = jtf.getText();
            StringBuilder builder = new StringBuilder();
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                builder.append(orgStr.charAt(i));
            }
            jtf.setText(builder + "");
        } else jlabContent.setText("You was press Enter. Text: " + jtf.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldTest();
            }
        });
    }
}

