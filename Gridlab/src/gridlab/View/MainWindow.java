package gridlab.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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



    private JList <String> modulesJList;
    private JList <String> objectsJList;
    private JList <String> addedObjectsJList;
    private JList <String>  propertiesJList;

    DefaultListModel<String> modulesItems;
    DefaultListModel<String> powerflowItems;
    DefaultListModel<String> residentalItems;
    DefaultListModel<String> tapeItems;
    DefaultListModel<String> generatorItems;

    DefaultListModel<String> objectsItems;
    DefaultListModel<String> addedObjectsItems;
    DefaultListModel<String> propertiesItems;

    public MainWindow() {

        loadLists();
        modulesJList=new JList <String>(modulesItems);
        objectsJList=new JList <String>(objectsItems);
        addedObjectsJList=new JList <String>(addedObjectsItems);
        propertiesJList=new JList<String>(propertiesItems);
        loadListers();


        mainFrame = new JFrame();
        modulesPanel = new ModulesPanel(modulesJList);
        objectPanel = new ModulesPanel(objectsJList);
        addedObjectsPanel = new ModulesPanel(addedObjectsJList);
        propertiesPanel = new ModulesPanel(propertiesJList);
        modulesItems.addElement("lol");

        addButton = new JButton("+");
        removeButton = new JButton("-");
        exportToGlm = new JButton("Export to GLM");
        runSimulation = new JButton("Run Simulation");
        Icon clock = new ImageIcon("Gridlab\\resources\\clock.png");
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
    private void loadLists(){
        objectsItems=new DefaultListModel<String>();
        addedObjectsItems=new DefaultListModel<String>();
        propertiesItems=new DefaultListModel<String>();

        modulesItems=new DefaultListModel<String>();
        modulesItems.addElement("Generator");
        modulesItems.addElement("Powerflow");
        modulesItems.addElement("Residental");
        modulesItems.addElement("Tape");
        tapeItems=new DefaultListModel<String>();
        tapeItems.addElement("Player");
        tapeItems.addElement("Recorder");

        residentalItems=new DefaultListModel<String>();
        residentalItems.addElement("Freezer");
        residentalItems.addElement("House");
        residentalItems.addElement("Lights");
        residentalItems.addElement("Microwave");
        residentalItems.addElement("Occupants");
        residentalItems.addElement("Plugs");
        residentalItems.addElement("Refrigerator");
        residentalItems.addElement("Waterheat");
        residentalItems.addElement("Clotheswasher");
        residentalItems.addElement("Dishwasher");

        powerflowItems=new DefaultListModel<String>();
        powerflowItems.addElement("Capacitor");
        powerflowItems.addElement("Fuse");
        powerflowItems.addElement("LineConfiguration");
        powerflowItems.addElement("LineSpacing");
        powerflowItems.addElement("Load");
        powerflowItems.addElement("Meter");
        powerflowItems.addElement("Node");
        powerflowItems.addElement("OverheadLine");
        powerflowItems.addElement("OverheadLineConductor");
        powerflowItems.addElement("Regulator");
        powerflowItems.addElement("RegulatorConfiguration");
        powerflowItems.addElement("Switch");
        powerflowItems.addElement("Transformer");
        powerflowItems.addElement("TransformerConfiguration");
        powerflowItems.addElement("TriplexLine");
        powerflowItems.addElement("TriplexLineConductor");
        powerflowItems.addElement("TriplexLineConfiguration");
        powerflowItems.addElement("TriplexMeter");
        powerflowItems.addElement("TriplexNode");
        powerflowItems.addElement("UndergroundLine");
        powerflowItems.addElement("UnderGroundLineConductor");

        generatorItems=new DefaultListModel<String>();
        generatorItems.addElement("Inverter");
        generatorItems.addElement("Solar");
    }
    private void loadListers(){

        modulesJList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 1) {

                    //modulesItems.addElement("LOLOLSODKJASDHALSKDLASDLASHDlHASD");
                    //objectsItems.addElement("LOLOLSODKJASDHALSKDLASDLASHDlHASD");
                    objectsItems.clear();


                   // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());
                    switch (index){
                        case 0:
                            for(int i=0;i<generatorItems.getSize();i++) {
                                objectsItems.addElement(generatorItems.get(i));
                            }
                            objectsJList.setSelectedIndex(0);
                            break;

                        case 1:
                            for(int i=0;i<powerflowItems.getSize();i++) {
                                objectsItems.addElement(powerflowItems.get(i));
                            }
                            objectsJList.setSelectedIndex(0);
                            break;

                        case 2:for(int i=0;i<residentalItems.getSize();i++) {
                            objectsItems.addElement(residentalItems.get(i));
                        }
                            objectsJList.setSelectedIndex(0);
                           break;

                        case 3:
                            for(int i=0;i<tapeItems.getSize();i++) {
                                objectsItems.addElement(tapeItems.get(i));
                            }
                            objectsJList.setSelectedIndex(0);
                            break;

                    }
                }
            }
        });


    }

}
