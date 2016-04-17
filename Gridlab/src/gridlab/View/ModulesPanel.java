package gridlab.View;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

/**
 * Created by Pavlo on 17.04.2016.
 */
public class ModulesPanel extends JPanel {
    public ModulesPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 200));

        Vector<String> modules = new Vector();
        JList list = new JList<String>(modules);
        modules.addElement("Generator");
        modules.addElement("Powerflow");
        modules.addElement("Residential");
        modules.addElement("Tape");
        add(list,BorderLayout.CENTER);
    }

}
