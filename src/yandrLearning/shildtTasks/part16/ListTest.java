package yandrLearning.shildtTasks.part16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListTest implements ListSelectionListener {

    JList<String>jList;
    JLabel jLabel;
    JScrollPane jScrollPane;
    String[]names = {"Mary","Robert","Susan","Alex","Natalie","Jonathan","Kate"
            ,"Valery","Jim","David","Barbara","Linda","Richard","Jessica"};

    public ListTest() {
        JFrame jfrm = new JFrame("Using List");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jList = new JList<>(names);
//        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jScrollPane = new JScrollPane(jList);

        jScrollPane.setPreferredSize(new Dimension(120,90));

        jLabel = new JLabel("Chose name");

        jList.addListSelectionListener(this);

        jfrm.add(jScrollPane);
        jfrm.add(jLabel);

        jfrm.setVisible(true);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
//        int index = jList.getSelectedIndex();
//        if (index!= -1)
//            jLabel.setText("Current chose: "+names[index]);
        int[] indices = jList.getSelectedIndices();
        if (indices.length>0){
            StringBuilder namesCh =new StringBuilder();
            for (int index:indices) {
                namesCh.append(names[index]).append(" ");
            }
            jLabel.setText("Current chose: "+namesCh);
        }
        else
            jLabel.setText("Chose name");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListTest();
            }
        });
    }
}
