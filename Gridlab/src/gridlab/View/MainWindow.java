package gridlab.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Pavlo on 17.04.2016.
 */
public class MainWindow extends JFrame {
    private JFrame mainFrame;
    private JPanel modulesPanel;
    private JPanel objectPanel;
    private JPanel addedObjectsPanel;
    private JPanel propertiesPanel;
    private JButton addButton;
    private JButton removeButton;
    private JButton exportToGlm;
    private JButton runSimulation;
    private JButton addClock;

    private JPanel buttons;

    public MainWindow() {
        mainFrame = new JFrame();

        modulesPanel = new ModulesPanel();
        objectPanel = new ModulesPanel();
        addedObjectsPanel = new ModulesPanel();
        propertiesPanel = new ModulesPanel();
        addButton = new JButton("+");
        removeButton = new JButton("-");
        exportToGlm = new JButton("Export to GLM");
        runSimulation = new JButton("Run Simulation");
        Icon clock = new ImageIcon("resources/clock.png");
        addClock = new JButton("Add clock");
        addClock.setIcon(clock);
        buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons,BoxLayout.PAGE_AXIS));
        buttons.add(exportToGlm);
        buttons.add(runSimulation);
        buttons.add(addClock);

        Container container = mainFrame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(modulesPanel);
        container.add(objectPanel);
        container.add(addButton);
        container.add(removeButton);
        container.add(addedObjectsPanel);
        container.add(propertiesPanel);
        container.add(buttons);


        mainFrame.setSize(new Dimension(1366,768));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setTitle("Gridlab-D GUI");
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
}
