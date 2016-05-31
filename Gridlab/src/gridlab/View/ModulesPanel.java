package gridlab.View;

import java.awt.*;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.*;

/**
 * Created by Pavlo on 17.04.2016.
 */
public class ModulesPanel extends JPanel{

    private JList mojaList;
    //private DefaultListModel<String> modulesItems;
    private JScrollPane listScrollPane = new JScrollPane();

    public ModulesPanel(JList lista) {
        mojaList=lista;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 300));
        listScrollPane.setViewportView(mojaList);


        add(listScrollPane,BorderLayout.CENTER);
    }


}
