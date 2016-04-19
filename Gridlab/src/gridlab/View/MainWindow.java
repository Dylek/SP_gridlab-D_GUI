package gridlab.View;

import gridlab.ExecuteShellCommand;
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

import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

/**
 * Created by Pavlo on 17.04.2016.
 */
public class MainWindow extends JFrame {
    private JFrame mainFrame;
    private JPanel modulesPanel;
    private JPanel objectPanel;
    private JPanel addedObjectsPanel;
    private JScrollPane propertiesPanel;
    private JScrollPane consolePanel;
    private JButton addButton;
    private JButton removeButton;
    private JButton exportToGlm;
    private JButton runSimulation;
    private JButton addClock;
    private JTextArea fileNameJTextArea;


    private JButton saveChangers;

    private JPanel buttons;
    private String fileName="Hello1.glm";


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
    //private JLabel[] labelsGlobal;
    private JTextField[] textFieldsGlobal;
    private int currentObject;


    private JTextArea consoleOutput=new JTextArea();

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
        propertiesPanel = new JScrollPane();
        consolePanel = new JScrollPane(consoleOutput);
        //propertiesPanel.setLayout(null);
        propertiesPanel.setPreferredSize(new Dimension(450, 300));
        consolePanel.setPreferredSize(new Dimension(500,300));
        addButton = new JButton("+");
        removeButton = new JButton("-");
        exportToGlm = new JButton("Export to GLM");
        runSimulation = new JButton("Run Simulation");
        Icon clock = new ImageIcon("Gridlab\\resources\\clock.png");
        addClock = new JButton("Add clock");
        addClock.setIcon(clock);
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(2,2,0,30));
        Dimension d = new Dimension(100,50);
        exportToGlm.setPreferredSize(d);
        buttons.add(exportToGlm);
        /*
         *JTextArea aktualizuje zmienną fineName, po tym jak klikniemy ExportToGLM
         */
        fileNameJTextArea=new JTextArea("waterheater_example");
        buttons.add(fileNameJTextArea);
        buttons.add(runSimulation);
        saveChangers= new JButton("Save changes");
        buttons.add(saveChangers);



        Container container = mainFrame.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        container.add(modulesPanel);
        container.add(objectPanel);
        container.add(addButton);
        container.add(removeButton);
        container.add(addClock);
        container.add(addedObjectsPanel);
        container.add(propertiesPanel);
        container.add(buttons);
        container.add(consolePanel);


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

        addedObjectsJList.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 1) {

                    int index = list.locationToIndex(evt.getPoint());
                    currentObject=index;
                    String key = addedObjectsItems.get(index);
                    ToGLMParser value = objectTable.get(key);
                    int propAmount = value.GetProperties().size();
                    JPanel params = new JPanel();
                    params.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    params.setPreferredSize(new Dimension(400, 500));
                    JLabel labels[] = new JLabel[propAmount];
                    JTextField textfields[] = new JTextField[propAmount];
                    for(int i =0; i<propAmount;i++){
                        labels[i] = new JLabel(value.GetProperties().get(i).GetName());
                        textfields[i] = new JTextField(value.GetProperties().get(i).GetValue());
                        gbc.ipadx=200;
                        gbc.gridx = 0;
                        gbc.gridy = i;
                        params.add(labels[i],gbc);
                        gbc.gridx = 1;
                        gbc.gridy = i;
                        params.add(textfields[i],gbc);
                    }
                    params.setPreferredSize(params.getPreferredSize());
                    //labelsGlobal=labels;
                    textFieldsGlobal=textfields;
                  //  JScrollPane scrollPanel = new JScrollPane(params);
                    propertiesPanel.setViewportView(params);
                   // propertiesPanel.add(params);
                    propertiesPanel.revalidate();
                    propertiesPanel.repaint();
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

                    case "Player": objectTable.put((object+" "+objectCount),new Player());System.out.print("utworozno klase");  break;
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


        saveChangers.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 1) {
                    int index = currentObject;
                    String key = addedObjectsItems.get(index);
                    ToGLMParser value = objectTable.get(key);
                    int propAmount = value.GetProperties().size();
                    for(int i =0; i<propAmount;i++){
                       value.GetProperties().get(i).SetValue(textFieldsGlobal[i].getText());
                    }

                }
            }
        });

        runSimulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command;
                command="gridlabd ";
                fileName=fileNameJTextArea.getText();

                if (fileName != null && fileName != "") {

                    ExecuteShellCommand execCom=new ExecuteShellCommand();

                    JPanel conPan=new JPanel();
                    conPan.setPreferredSize(new Dimension(400, 300));

                    consoleOutput.setText(execCom.executeCommand(command+fileName+".glm"));


                    System.out.println("Running in console");
                    //System.out.println(execCom.executeCommand(command+"waterheater_example.glm"));
                    System.out.println("End of console response");
                }

            }
        });


        exportToGlm.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Vector <String> toglmString=new Vector<String>();
                fileName=fileNameJTextArea.getText();
                File file = new File(fileName+".glm");
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
                try {
                    writer.write(checkModules());
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

}
    public String checkModules(){
        String modules = "";
        int checkGuard1 = 0;
        int checkGuard2 = 0;
        int checkGuard3 = 0;
        int checkGuard4 = 0;


        for (ToGLMParser value : objectTable.values()) {
            if(value.getModule()==0 && checkGuard1 ==0){
                modules = modules + "module generators;\n";
                checkGuard1++;
            }
            if(value.getModule()==1 && checkGuard2 ==0){
                modules = modules + "module powerflow;\n";
                checkGuard2++;
            }
            if(value.getModule()==2 && checkGuard3 ==0){
                modules = modules + "module residential;\n";
                checkGuard3++;
            }
            if(value.getModule()==3 && checkGuard4 ==0){
                modules = modules + "module tape;\n";
                checkGuard4++;
            }
        }
        return modules;
    }
}
