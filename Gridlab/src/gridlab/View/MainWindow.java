package gridlab.View;

import gridlab.ModulesItems.Clock;
import gridlab.ModulesItems.Generator.Inverter;
import gridlab.ModulesItems.Generator.Solar;
import gridlab.ModulesItems.Powerflow.*;
import gridlab.ModulesItems.Residental.*;
import gridlab.ModulesItems.Tape.Player;
import gridlab.ModulesItems.Tape.Recorder;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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


    private JList<String> modulesJList;
    private JList<String> objectsJList;
    private JList<String> addedObjectsJList;
    private JList<String> propertiesJList;

    DefaultListModel<String> modulesItems;
    DefaultListModel<String> powerflowItems;
    DefaultListModel<String> residentalItems;
    DefaultListModel<String> tapeItems;
    DefaultListModel<String> generatorItems;

    DefaultListModel<String> objectsItems;
    DefaultListModel<String> addedObjectsItems;
    DefaultListModel<String> propertiesItems;

    HashMap<String,ToGLMParser> objectTable;
    static int objectCount=0;

    public MainWindow() {
       objectTable=new HashMap<String,ToGLMParser>();

        loadLists();
        modulesJList=new JList <String>(modulesItems);
        objectsJList=new JList <String>(objectsItems);
        addedObjectsJList=new JList <String>(addedObjectsItems);
        propertiesJList=new JList<String>(propertiesItems);
        objectsItems.addElement(" ");
        objectsJList.setSelectedIndex(0);

        mainFrame = new JFrame();
        modulesPanel = new ModulesPanel(modulesJList);
        objectPanel = new ModulesPanel(objectsJList);
        addedObjectsPanel = new ModulesPanel(addedObjectsJList);
        propertiesPanel = new ModulesPanel(propertiesJList);

        addButton = new JButton("+");
        removeButton = new JButton("-");
        exportToGlm = new JButton("Export to GLM");
        runSimulation = new JButton("Run Simulation");
        Icon clock = new ImageIcon("Gridlab\\resources\\clock.png");
        addClock = new JButton("Add clock");
        addClock.setIcon(clock);
        buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.PAGE_AXIS));
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

        loadListers();



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
        addButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                objectCount++;
                String object=new String();
                object=objectsItems.get(objectsJList.getSelectedIndex());
                addedObjectsItems.addElement(object+" "+objectCount);
                //String s=objectsItems.get(objectsJList.getSelectedIndex());

                switch (object){

                    case "Player": objectTable.put((object+objectCount),new Player());System.out.print("utworozno klase");  break;
                    case "Recorder": objectTable.put(object+" "+objectCount,new Recorder());  break;

                    case "Inverter": objectTable.put(object+" "+objectCount,new Inverter());break;
                    case "Solar": objectTable.put(object+" "+objectCount,new Solar());break;

                    case "House": objectTable.put(object+" "+objectCount,new House());break;
                    case "Freezer": objectTable.put(object+" "+objectCount,new Freezer());break;
                    case "Dishwasher": objectTable.put(object+" "+objectCount,new Dishwasher());break;
                    case "Clotheswasher": objectTable.put(object+" "+objectCount,new Clotheswasher());break;
                    case "Lights": objectTable.put(object+" "+objectCount,new Lights());break;
                    case "Microwave": objectTable.put(object+" "+objectCount,new Microwave());break;
                    case "Occupants": objectTable.put(object+" "+objectCount,new Occupants());break;
                    case "Plugs": objectTable.put(object+" "+objectCount,new Plugs());break;
                    case "Refrigerator": objectTable.put(object+" "+objectCount,new Refrigerator());break;
                    case "Waterheat": objectTable.put(object+" "+objectCount,new Waterheat());break;

                    case "Capacitor": objectTable.put(object+" "+objectCount,new Capacitor());break;
                    case "Fuse": objectTable.put(object+" "+objectCount,new Fuse());break;
                    case "LineConfiguration": objectTable.put(object+" "+objectCount,new LineConfiguration());break;
                    case "LineSpacing": objectTable.put(object+" "+objectCount,new LineSpacing());break;
                    case "Load": objectTable.put(object+" "+objectCount,new Load());break;
                    case "Meter": objectTable.put(object+" "+objectCount,new Meter());break;
                    case "Node": objectTable.put(object+" "+objectCount,new Node());break;
                    case "OverheadLine": objectTable.put(object+" "+objectCount,new OverheadLine() );break;
                    case "OverheadLineConductor": objectTable.put(object+" "+objectCount,new OverheadLineConductor());break;
                    case "Regulator": objectTable.put(object+" "+objectCount,new Regulator());break;
                    case "RegulatorConfiguration": objectTable.put(object+" "+objectCount,new RegulatorConfiguration());break;
                    case "Switch": objectTable.put(object+" "+objectCount,new Switch());break;
                    case "Transformer": objectTable.put(object+" "+objectCount,new Transformer());break;
                    case "TransformerConfiguration": objectTable.put(object+" "+objectCount,new TransformerConfiguration());break;
                    case "TriplexLine": objectTable.put(object+" "+objectCount,new TriplexLineConductor());break;
                    case "TriplexLineConductor": objectTable.put(object+" "+objectCount,new TriplexLineConductor());break;
                    case "TiplexLineConfiguration": objectTable.put(object+" "+objectCount,new TriplexLineConfiguration());break;
                    case "TriplexMeter": objectTable.put(object+" "+objectCount,new TriplexMeter());break;
                    case "TriplexNode": objectTable.put(object+" "+objectCount,new TriplexNode());break;
                    case "UndergroundLine": objectTable.put(object+" "+objectCount,new UndergroundLine());break;
                    case "UnderGroundLineConductor": objectTable.put(object+" "+objectCount,new UnderGroundLineConductor());break;

                }
                System.out.print("Dodano"+objectTable.size());
            }
        });
        removeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String obj=addedObjectsItems.get(addedObjectsJList.getSelectedIndex());
                addedObjectsItems.remove(addedObjectsJList.getSelectedIndex());
                objectTable.remove(obj);
                System.out.print("usunieto "+objectTable.size());
        }
        });
        addClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                objectCount++;
                addedObjectsItems.addElement("Clock " + objectCount);
                objectTable.put("Clock" + " " + objectCount, new Clock());
            }
        });
/*
        addedObjectsJList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 1) {

                    objectsItems.clear();

                    // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());

                    for(int i=0;i<addedObjectsItems.size();i++){

                    }
                }
            }
        });
*/
        exportToGlm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Vector <String> toglmString=new Vector<String>();
                File file = new File("Hello1.glm");
                // creates the file
                try {
                    file.createNewFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                FileWriter writer = null;
                try {
                    writer = new FileWriter(file);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                // creates a FileWriter Object
                for(int i=0;i<addedObjectsItems.size();i++){
                   ToGLMParser glm= (ToGLMParser) objectTable.get(addedObjectsItems.get(i));
                   // System.out.println(glm.ToGLM());


                    // Writes the content to the file
                    try {
                        writer.write(glm.ToGLM());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    try {
                        writer.flush();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }
                try {
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }

        });
}}
