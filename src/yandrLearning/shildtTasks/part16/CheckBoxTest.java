package yandrLearning.shildtTasks.part16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxTest implements ItemListener {
    JLabel jLabSelected;
    JLabel jLabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    public CheckBoxTest() {
        JFrame jfrm = new JFrame("Using Check Boxes");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(280, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabSelected = new JLabel("");
        jLabChanged = new JLabel("");

        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jLabChanged);
        jfrm.add(jLabSelected);

        jfrm.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        StringBuilder str = new StringBuilder();

        JCheckBox cb = (JCheckBox) e.getItem();

        if (cb.isSelected())
            jLabChanged.setText(cb.getText() + " has been checked");
        else
            jLabChanged.setText(cb.getText() + " has been unchecked");
        if (jcbAlpha.isSelected()) {
            str.append("Alpha");
        }
        if (jcbBeta.isSelected()) {
            str.append(" Beta");
        }
        if (jcbGamma.isSelected()) {
            str.append(" Gamma");
        }
        jLabSelected.setText("Checkboxes selected: " + str);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxTest();
            }
        });
    }
}
