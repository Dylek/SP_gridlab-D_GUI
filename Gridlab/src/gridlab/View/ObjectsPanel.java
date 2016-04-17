package gridlab.View;

import javax.swing.*;
import java.awt.*;


import javax.swing.*;

/**
 * Created by Dylek on 2016-04-17.
 */
public class ObjectsPanel extends JPanel{
    DefaultListModel<String> objectItems;

    DefaultListModel<String> powerflowItems;
    DefaultListModel<String> residentalItems;
    DefaultListModel<String> tapeItems;
    DefaultListModel<String> generatorItems;

    private JList mojaList;
    private DefaultListModel<String> modulesItems;

    public ObjectsPanel() {
            modulesItems=new DefaultListModel<String>();
            modulesItems.addElement("Generator");
            modulesItems.addElement("Powerflow");
            modulesItems.addElement("Residental");
            modulesItems.addElement("Tape");

            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(300, 200));

            mojaList = new JList<String>(modulesItems);


            add(mojaList,BorderLayout.CENTER);
        }



}
