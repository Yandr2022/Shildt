package yandrLearning.shildtTasks.part16.tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SwingFileComparison implements ActionListener {
    JTextField jtfFirst;
    JTextField jtfSecond;
    JButton jbt;
    JLabel jLabFirst, jLabSecond, jLabResult;
    JCheckBox jCheckBox;

    public SwingFileComparison() {
        JFrame jfrm = new JFrame("File comparison");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 190);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        jtfFirst.setActionCommand("FileA");
        jtfSecond.setActionCommand("FileB");

        jbt = new JButton("Compare");
        jbt.addActionListener(this);

        jLabFirst = new JLabel("First File");
        jLabSecond = new JLabel("Second File");
        jLabResult= new JLabel("");

        jCheckBox = new JCheckBox("Show number first different symbol");

        jfrm.add(jLabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jLabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jCheckBox);
        jfrm.add(jbt);
        jfrm.add(jLabResult);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
int count =0;
        boolean result = true;
        if (jtfFirst.getText().equals("")) {
            jLabResult.setText("Missing first file name");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jLabResult.setText("Missing second file name");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            for (int i = f1.read(), j = f2.read(); (i != -1 || j != -1) && result; i = f1.read(), j = f2.read()) {
                result = i == j;
                count++;
            }
            if (!result) {
                jLabResult.setText(jCheckBox.isSelected()?"The files differ starting from the position "+count
                        :"The files are different ");
            } else
                jLabResult.setText("The files are same");
        } catch (IOException exc) {
            jLabResult.setText("File name Error");
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFileComparison();
            }
        });
    }
}
