package gridlab.View;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

/**
 * Created by Pavlo on 17.04.2016.
 */
public class ModulesPanel extends JPanel {

   private JList mojaList;
    //private DefaultListModel<String> modulesItems;

    public ModulesPanel(JList lista) {
        mojaList=lista;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 200));


        add(mojaList,BorderLayout.CENTER);
    }


}
