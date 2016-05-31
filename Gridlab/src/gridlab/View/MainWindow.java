package gridlab.View;

import gridlab.ExecuteShellCommand;
import gridlab.ModulesItems.Clock;
import gridlab.ModulesItems.Generator.Inverter;
import gridlab.ModulesItems.Generator.Solar;
import gridlab.ModulesItems.Powerflow.*;
import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.*;
import gridlab.ModulesItems.Tape.Player;
import gridlab.ModulesItems.Tape.Recorder;
import gridlab.ModulesItems.ToGLMParser;
import gridlab.ParentChild;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

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
    private JButton addClock;
    private JButton connectButton;
    private JButton startSimulationButton;
    private JMenuBar menuBar;
    private JToolBar   toolBar;
    private JTextArea fileNameJTextArea = new JTextArea("HelloWorld");;

    private JPanel drag_drop;


    private String fileName="Hello1.glm";

    private JFileChooser fileChooser;

    private JList<String> modulesJList;

    private JList<String> objectsJList;
    private JList<String> addedObjectsJList;
    private JList<String> propertiesJList;

    DefaultListModel<String> modulesItems;//nie usuwać pod żadnym pozorem
    DefaultListModel<String> powerflowItems;//nie usuwać pod żadnym pozorem
    DefaultListModel<String> residentalItems;//nie usuwać pod żadnym pozorem
    DefaultListModel<String> tapeItems;//nie usuwać pod żadnym pozorem
    DefaultListModel<String> generatorItems;//nie usuwać pod żadnym pozorem MJ

    DefaultListModel<String> objectsItems;
    DefaultListModel<String> addedObjectsItems;
    DefaultListModel<String> propertiesItems;

    HashMap<String,ToGLMParser> objectTable;
    HashMap<String,JLabel> imagesTable;

    ArrayList<ParentChild>listOfConn;
    HashMap<String,String> hashChildParent;
    Map<String,Point> map;

    //static
    int objectCount=0;
    //private JLabel[] labelsGlobal;
    private JTextField[] textFieldsGlobal;
    private int currentObject=0;
    private String stringCurrentObject="";

    private JTextArea consoleOutput=new JTextArea();

    private JPopupMenu popupTape;
    private JPopupMenu popupResidental;
    private JPopupMenu popupPowerflow;
    private JPopupMenu popupGenerator;
   //private JPopupMenu popup;








    public MainWindow() {

        hashChildParent=new HashMap<String,String>();
        listOfConn=new ArrayList<ParentChild>();
        map=new LinkedHashMap<String,Point>();

        objectTable=new HashMap<String,ToGLMParser>();
        imagesTable=new HashMap<String,JLabel>();
        fileChooser=new JFileChooser();
        FileNameExtensionFilter filterGLM=new FileNameExtensionFilter("GLM files","glm");
        fileChooser.setFileFilter(filterGLM);

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
        connectButton=new JButton("Connect");
        startSimulationButton=new JButton("Start symulacji",new ImageIcon("C:\\Users\\Dylek\\Documents\\GitHub\\SP_gridlab-D_GUI\\Gridlab\\Icons\\start16x16.png"));


        Icon clock = new ImageIcon("Gridlab\\resources\\clock.png");
        addClock = new JButton("Add clock");
        addClock.setIcon(clock);
        drag_drop = new MyJPanel();
        drag_drop.setPreferredSize(new Dimension(500,300));
        loadToolBox();
        Container container = mainFrame.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        container.add(toolBar);
        //container.add(modulesPanel);
        //container.add(objectPanel);
        //container.add(addButton);
        container.add(removeButton);
        container.add(connectButton);
        //container.add(addClock);
        container.add(addedObjectsPanel);
        container.add(propertiesPanel);
        container.add(drag_drop);
        container.add(consolePanel);


        loadListers();


        menuBar=new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        loadMenu();


        mainFrame.setSize(new Dimension(1300,600));
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


        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] nodes = showGUIForConnectionsMaking();
                if (nodes == null || nodes[0]==null || nodes.length == 0 )
                {}
                else if (!nodes[0].equals(nodes[1]))
                {
                    String split[] = nodes[0].split(",");
                    Point p1 = new Point(Integer.valueOf(split[0]),Integer.valueOf(split[1]));
                    split = nodes[1].split(",");
                    Point p2 = new Point(Integer.valueOf(split[0]),Integer.valueOf(split[1]));
                    //
                    JLabel labelParent = (JLabel)drag_drop.getComponentAt(p1);
                    String parentName=labelParent.getName();
                    JLabel labelChild = (JLabel)drag_drop.getComponentAt(p2);
                    String childName=labelChild.getName();
                    ParentChild pair = new ParentChild(labelParent,labelChild);
                    //make parent child connection
                    if(hashChildParent.containsKey(childName) ){
                        consoleOutput.setText("A child object can have only one parent\n Overriding old parent");
                        //hashChildParent.remove(childName);
                        for(int i=0;i<listOfConn.size();i++){
                            if(listOfConn.get(i).getParentJLabel().getName().equals(hashChildParent.get(childName))){
                                listOfConn.remove(listOfConn.get(i));
                            }
                        }
                        hashChildParent.replace(childName,parentName);
                    }

                        hashChildParent.put(childName,parentName);

                        Vector<Property> noweProperty=new Vector<Property>();
                        for (Property p:objectTable.get(childName).GetProperties()) {
                            if(p.GetName().equals("parent")){
                                noweProperty.add(new Property("parent", parentName, ""));
                            }else{
                                noweProperty.add(p);
                            }
                        }
                        objectTable.get(childName).SetProperty(noweProperty);
                        listOfConn.add(pair);
                        drag_drop.repaint();



                }
                else
                {
                    JOptionPane.showMessageDialog(MainWindow.this,"Nodes can't be same","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

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

                    if(textFieldsGlobal!=null)
                    {
                        int index = currentObject;
                        String key = addedObjectsItems.get(index);
                        ToGLMParser value = objectTable.get(key);
                        int propAmount = value.GetProperties().size();
                        for(int i =0; i<propAmount;i++){
                            value.GetProperties().get(i).SetValue(textFieldsGlobal[i].getText());
                        }
                    }


                    int index = list.locationToIndex(evt.getPoint());
                    currentObject=index;
                    String key = addedObjectsItems.get(index);
                    ToGLMParser value = objectTable.get(key);
                    stringCurrentObject=key;
                    int propAmount = value.GetProperties().size();
                    JPanel params = new JPanel();
                    params.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    params.setMinimumSize(new Dimension(300,50));
                    params.setMaximumSize(new Dimension(300, 2500));
                    JLabel labels[] = new JLabel[propAmount];
                    JTextField textfields[] = new JTextField[propAmount];
                    for(int i =0; i<propAmount;i++){
                        labels[i] = new JLabel(value.GetProperties().get(i).GetName());
                        textfields[i] = new JTextField(value.GetProperties().get(i).GetValue());
                        gbc.ipadx=100;
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
                    case "TriplexLine": objectTable.put(object+" "+objectCount,new TriplexLine());break;
                    case "TriplexLineConductor": objectTable.put(object+" "+objectCount,new TriplexLineConductor());break;
                    case "TriplexLineConfiguration": objectTable.put(object+" "+objectCount,new TriplexLineConfiguration());break;
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
                map.remove(obj);

                removeImageFromPanel(obj);
                System.out.print("usunieto "+objectTable.size());

                //czyści panel prosperites jak usuwamy obiekt
                textFieldsGlobal=null;

                propertiesPanel.setViewportView(null);
                propertiesPanel.revalidate();
                propertiesPanel.repaint();
        }
        });
        addClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                objectCount++;
                addedObjectsItems.addElement("Clock " + objectCount);
                objectTable.put("Clock" + " " + objectCount, new Clock());
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

    public void loadMenu(){

        JMenu glmMenu=new JMenu("GLM");
        JMenu helpMenu=new JMenu("Help");
        JMenu fileMenu=new JMenu("File");

        menuBar.add(fileMenu);
        menuBar.add(glmMenu);
        menuBar.add(helpMenu);
        menuBar.add(startSimulationButton);

        //do zakłądi file
        JMenuItem clearItem=new JMenuItem("Clear");
        JMenuItem exitItem=new JMenuItem("Exit");
        JMenuItem saveItem= new JMenuItem("Save");
        JMenuItem loadITem=new JMenuItem("Load");

        fileMenu.add(saveItem);
        fileMenu.add(loadITem);
        fileMenu.addSeparator();
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        //do zakładki GLM
        JMenuItem exportItem=new JMenuItem("Export to GLM");
        JMenuItem runItem=new JMenuItem("Run Simulation");
        glmMenu.add(exportItem);
        glmMenu.add(runItem);
        //do zakładki Help
        JMenuItem aboutItem=new JMenuItem("About");
        JMenuItem wikiItem=new JMenuItem("Gridlab-D wiki");
        helpMenu.add(aboutItem);
        helpMenu.add(wikiItem);

        //menu listeners
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        clearItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objectCount=0;
                currentObject=0;
                objectsItems.clear();
                objectTable.clear();
                imagesTable.clear();
                drag_drop.removeAll();
                drag_drop.revalidate();
                drag_drop.repaint();
                addedObjectsItems.clear();
                propertiesItems.clear();
                textFieldsGlobal=null;
                propertiesPanel.setViewportView(new JPanel());
                propertiesPanel.revalidate();
                propertiesPanel.repaint();
                consoleOutput.setText("");
                listOfConn.clear();
                map.clear();
            }
        });
        //TODO
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // int returnVal=fileChooser.showSaveDialog(mainFrame);
                //fileChooser.setFileFilter(new FileNameExtensionFilter("SaveFile",".ser"));

              //  if(returnVal==JFileChooser.APPROVE_OPTION){
                    File fileSelected= fileChooser.getSelectedFile();
                    System.out.println(fileSelected);
                    SaveFileClass save=new SaveFileClass();
                    save.addedObjectsItems=addedObjectsItems;
                    save.modulesItems=modulesItems;

                    save.powerflowItems=powerflowItems;
                    save.residentalItems=residentalItems;
                    save.tapeItems=tapeItems;
                    save.generatorItems=generatorItems;
                    save.objectsItems=objectsItems;
                    save.stringCurrentObject=stringCurrentObject;
                    save.objectCount=objectCount;
                    save.currentObject=currentObject;
                    save.hashChildParent=hashChildParent;
                    save.imagesTable=imagesTable;
                    save.listOfConn=listOfConn;
                    save.map=map;
                    save.objectTable=objectTable;
                    save.propertiesItems=propertiesItems;

                    String fileName= null;
                    System.out.println("1.");
                  /*  try {
                        fileName = fileSelected.getCanonicalPath()+".ser";
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }*/
                    System.out.println("2.");
                    try
                    {
                        FileOutputStream fileOut =
                                new FileOutputStream("temp.ser");
                        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
                        out.writeObject(save);
                        out.close();
                        fileOut.close();
                        System.out.printf("Serialized data is saved in /tmp/employee.ser");
                    }catch(IOException i)
                    {
                        i.printStackTrace();
                    }
                    System.out.println("3.");
                    fileChooser.setSelectedFile(new File(""));

                }

           // }
        });
        loadITem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // int returnVal=fileChooser.showOpenDialog(mainFrame);
                //fileChooser.setFileFilter(new FileNameExtensionFilter("SaveFile",".ser"));

               // if(returnVal==JFileChooser.APPROVE_OPTION){
                //    File fileSelected= fileChooser.getSelectedFile();


                SaveFileClass save = null;
                Object obj;
                try
                {
                    FileInputStream fileIn = new FileInputStream("temp.ser");
                    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(fileIn));
                    save =(SaveFileClass) (in.readObject());
                    in.close();
                    fileIn.close();
                }catch(IOException i)
                {
                    i.printStackTrace();
                    return;
                }catch(ClassNotFoundException c)
                {
                    System.out.println("Employee class not found");
                    c.printStackTrace();
                    return;
                }
                    addedObjectsItems= save.addedObjectsItems;

                    modulesItems=save.modulesItems;

                    powerflowItems=save.powerflowItems;
                    residentalItems=save.residentalItems;
                    tapeItems= save.tapeItems;
                    generatorItems=  save.generatorItems;
                    objectsItems=save.objectsItems;
                    stringCurrentObject= save.stringCurrentObject;
                    objectCount=save.objectCount;
                    currentObject= save.currentObject;
                    hashChildParent=save.hashChildParent;
                    imagesTable= save.imagesTable;
                    listOfConn= save.listOfConn;
                    map= save.map;
                    propertiesItems = save.propertiesItems;
                    objectTable = save.objectTable;

                    //odswiezenie widoku, nie wiem czemu dziala tylko polaczenie miedzy obiektami
                    addedObjectsPanel.revalidate();
                    addedObjectsPanel.repaint();
                    drag_drop.revalidate();
                    drag_drop.repaint();
                    propertiesPanel.revalidate();
                    propertiesPanel.repaint();
                    //test - deserializacja przebiega pomyslnie, bo wyswietla wartosci
                    System.out.print(addedObjectsItems);
                    System.out.print(objectCount);
                    System.out.print(objectTable);
                }
          //  }
        });


        runItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command;
                command="gridlabd ";
               // fileName=fileNameJTextArea.getText();
                int returnVal=fileChooser.showOpenDialog(mainFrame);

                if(returnVal==JFileChooser.APPROVE_OPTION) {


                    try {
                        fileName=fileChooser.getSelectedFile().getCanonicalPath();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                    if (fileName != null && fileName != "") {

                        ExecuteShellCommand execCom=new ExecuteShellCommand();

                        JPanel conPan=new JPanel();
                        conPan.setPreferredSize(new Dimension(400, 300));
                        String str=execCom.executeCommand(command+fileName);
                        consoleOutput.setText(str);
                        consoleOutput.updateUI();

                        System.out.println("Running in console");
                        //System.out.println(execCom.executeCommand(command+"waterheater_example.glm"));

                        System.out.println("End of console response");
                }

                fileChooser.setSelectedFile(new File(""));
                }

            }
        });
        exportItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal=fileChooser.showSaveDialog(mainFrame);

                if(returnVal==JFileChooser.APPROVE_OPTION){
                        File fileSelected= fileChooser.getSelectedFile();
                        File file=new File(fileSelected+".glm");
                        //Vector <String> toglmString=new Vector<String>();
                        fileName=fileNameJTextArea.getText();

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
                            fileChooser.setSelectedFile(new File(""));

                    }
                }


        });
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String about="Projekt GUI do programu GRIDLAB-D " +
                        "\n Jest to projekt na zaliczenie zajęć: Studio Projektowe 2016 " +
                        "\n Autorzy: " +
                        "\n Aleksandra Pierzchała " +
                        "\n Paweł Ogorzały " +
                        "\n Marcin Jędrzejczyk "+
                        "\n Prowadzący:"+
                        "\n dr inż. Marek Zachera";
                JOptionPane.showMessageDialog(mainFrame,about);
            }
        });
        wikiItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String about="Więcej informacji o programie GRIDLAB-D na oficialnej stronie";



                JOptionPane.showMessageDialog(mainFrame,(about));

            }
        });
        startSimulationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file=new File("temp.glm");
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

                try {
                    fileName=file.getCanonicalPath();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                ExecuteShellCommand execCom=new ExecuteShellCommand();

                JPanel conPan=new JPanel();
                conPan.setPreferredSize(new Dimension(400, 300));
                String str=execCom.executeCommand("gridlabd "+fileName);
                consoleOutput.setText(str);
                consoleOutput.updateUI();
            }
        });
    }

    public void loadToolBox(){
        toolBar=new JToolBar(JToolBar.VERTICAL);
        //toolBar.
        JButton residentalModule=new JButton(new ImageIcon("Gridlab\\Icons\\residental.png"));
        JButton generatorModule=new JButton(new ImageIcon("Gridlab\\Icons\\generator.png"));
        JButton powerflowModule=new JButton(new ImageIcon("Gridlab\\Icons\\powerflow.png"));
        JButton tapeModule=new JButton(new ImageIcon("Gridlab\\Icons\\Tape2-512.png"));
        JButton clockModule=new JButton(new ImageIcon("Gridlab\\Icons\\clock-128.png"));
        toolBar.add(residentalModule);
        toolBar.add(generatorModule);
        toolBar.add(powerflowModule);
        toolBar.add(tapeModule);
        toolBar.add(clockModule);


        {
            popupTape = new JPopupMenu();
            for (int i=0;i< tapeItems.size();i++  ) {
                String str=tapeItems.get(i);
                popupTape.add(new JMenuItem(new AbstractAction(str) {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addObject(str);
                    }
                }));
            }

        }
        {
            popupResidental=new JPopupMenu();
            for (int i=0;i< residentalItems.size();i++  ) {
                String str=residentalItems.get(i);
                popupResidental.add(new JMenuItem(new AbstractAction(str) {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addObject(str);
                    }
                }));
            }
        }
        {
            popupPowerflow=new JPopupMenu();
            for (int i=0;i< powerflowItems.size();i++  ) {
                String str=powerflowItems.get(i);
                popupPowerflow.add(new JMenuItem(new AbstractAction(str) {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addObject(str);
                    }
                }));
            }
        }
        {
            popupGenerator=new JPopupMenu();
            for (int i=0;i< generatorItems.size();i++  ) {
                String str=generatorItems.get(i);
                popupGenerator.add(new JMenuItem(new AbstractAction(str) {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addObject(str);
                    }
                }));
            }
        }


        //ToolBox listeners
        residentalModule.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                popupResidental.show(residentalModule,residentalModule.getWidth()/2,residentalModule.getHeight()/2);
                }
        });
        powerflowModule.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                popupPowerflow.show(powerflowModule,powerflowModule.getWidth()/2,powerflowModule.getHeight()/2);
            }
        });
        generatorModule.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                popupGenerator.show(generatorModule, generatorModule.getWidth()/2, generatorModule.getHeight()/2);
            }
        });
        tapeModule.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                popupTape.show(tapeModule, tapeModule.getWidth()/2, tapeModule.getHeight()/2);
            }
        });
        clockModule.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addObject("Clock");
            }
        });
    }

    private void addObject(String object){
        objectCount++;
        addedObjectsItems.addElement(object+" "+objectCount);
        switch (object){
            case "Clock": objectTable.put("Clock" + " " + objectCount, new Clock());
                addImageToPanel(object);break;
            case "Player": objectTable.put((object+" "+objectCount),new Player());
                addImageToPanel(object);break;
            case "Recorder": objectTable.put(object+" "+objectCount,new Recorder());
                addImageToPanel(object);break;
            case "Inverter": objectTable.put(object+" "+objectCount,new Inverter());
                addImageToPanel(object);break;
            case "Solar": objectTable.put(object+" "+objectCount,new Solar());
                addImageToPanel(object);break;
            case "House": objectTable.put(object+" "+objectCount,new House());
                addImageToPanel(object);break;
            case "Dishwasher": objectTable.put(object+" "+objectCount,new Dishwasher());
                addImageToPanel(object);break;
            case "Clotheswasher": objectTable.put(object+" "+objectCount,new Clotheswasher());
                addImageToPanel(object);break;
            case "Lights": objectTable.put(object+" "+objectCount,new Lights());
                addImageToPanel(object);break;
            case "Microwave": objectTable.put(object+" "+objectCount,new Microwave());
                addImageToPanel(object);break;
            case "Occupants": objectTable.put(object+" "+objectCount,new Occupants());
                addImageToPanel(object);break;
            case "Plugs": objectTable.put(object+" "+objectCount,new Plugs());
                addImageToPanel(object);break;
            case "Refrigerator": objectTable.put(object+" "+objectCount,new Refrigerator());
                addImageToPanel(object);break;
            case "Waterheat": objectTable.put(object+" "+objectCount,new Waterheat());
                addImageToPanel(object);break;
            case "Capacitor": objectTable.put(object+" "+objectCount,new Capacitor());
                addImageToPanel(object);break;
            case "Fuse": objectTable.put(object+" "+objectCount,new Fuse());
                addImageToPanel(object);break;
            case "LineConfiguration": objectTable.put(object+" "+objectCount,new LineConfiguration());
                addImageToPanel(object);break;
            case "LineSpacing": objectTable.put(object+" "+objectCount,new LineSpacing());
                addImageToPanel(object);break;
            case "Load": objectTable.put(object+" "+objectCount,new Load());
                addImageToPanel(object);break;
            case "Meter": objectTable.put(object+" "+objectCount,new Meter());
                addImageToPanel(object);break;
            case "Node": objectTable.put(object+" "+objectCount,new Node());
                addImageToPanel(object);break;
            case "OverheadLine": objectTable.put(object+" "+objectCount,new OverheadLine());
                addImageToPanel(object);break;
            case "OverheadLineConductor": objectTable.put(object+" "+objectCount,new OverheadLineConductor());
                addImageToPanel(object);break;
            case "Regulator": objectTable.put(object+" "+objectCount,new Regulator());
                addImageToPanel(object);break;
            case "RegulatorConfiguration": objectTable.put(object+" "+objectCount,new RegulatorConfiguration());
                addImageToPanel(object);break;
            case "Switch": objectTable.put(object+" "+objectCount,new Switch());
                addImageToPanel(object);break;
            case "Transformer": objectTable.put(object+" "+objectCount,new Transformer());
                addImageToPanel(object);break;
            case "TransformerConfiguration": objectTable.put(object+" "+objectCount,new TransformerConfiguration());
                addImageToPanel(object);break;
            case "TriplexLine": objectTable.put(object+" "+objectCount,new TriplexLine());
                addImageToPanel(object);break;
            case "TriplexLineConductor": objectTable.put(object+" "+objectCount,new TriplexLineConductor());
                addImageToPanel(object);break;
            case "TriplexLineConfiguration": objectTable.put(object+" "+objectCount,new TriplexLineConfiguration());
                addImageToPanel(object);break;
            case "TriplexMeter": objectTable.put(object+" "+objectCount,new TriplexMeter());
                addImageToPanel(object);break;
            case "TriplexNode": objectTable.put(object+" "+objectCount,new TriplexNode());
                addImageToPanel(object);break;
            case "UndergroundLine": objectTable.put(object+" "+objectCount,new UndergroundLine());
                addImageToPanel(object);break;
            case "UnderGroundLineConductor": objectTable.put(object+" "+objectCount,new UnderGroundLineConductor());
                addImageToPanel(object);break;
            default: System.out.println("not know type: "+object);
        }

        Vector<Property> noweProperty=new Vector<Property>();
        System.out.println("created"+object+" "+objectCount);
        for (Property p:objectTable.get(object+" "+objectCount).GetProperties()) {
            //System.out.println(p.toString());
            if(p.GetName().equals("name")){

                Property k=new Property("name", object+" "+objectCount, "");
               // System.out.println("ustawiam imie:"+k.GetValue());
                noweProperty.add(k);
            }else{
                noweProperty.add(p);
            }
        }
        objectTable.get(object+" "+objectCount).SetProperty(noweProperty);
    }

    public void addImageToPanel(String obj){
        String object = obj;
        JLabel objectLabel=new JLabel(objectTable.get(object+" "+objectCount).getIcon());
        objectLabel.setName(object+" "+objectCount);
        MyMouseAdapter myMouseAdapter=new MyMouseAdapter();
        objectLabel.addMouseListener(myMouseAdapter);
        objectLabel.addMouseMotionListener(myMouseAdapter);
        objectLabel.setText(object+" "+objectCount);
        imagesTable.put(object+" "+objectCount,objectLabel);
        drag_drop.add(imagesTable.get(object+" "+objectCount));
        
        drag_drop.revalidate();
         drag_drop.repaint();
        map.put(object+" "+objectCount,objectLabel.getLocation());

        objectLabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Component comp = (Component) evt.getSource();
                JLabel jb=(JLabel)comp;

                if (evt.getClickCount() == 1) {
                    if(textFieldsGlobal!=null)
                    {

                       ToGLMParser value = objectTable.get(stringCurrentObject);
                        int propAmount = value.GetProperties().size();
                        for(int i =0; i<propAmount;i++){
                            value.GetProperties().get(i).SetValue(textFieldsGlobal[i].getText());
                        }
                    }
                    stringCurrentObject= jb.getName();
                    ToGLMParser value = objectTable.get(stringCurrentObject);
                    int propAmount = value.GetProperties().size();
                    JPanel params = new JPanel();
                    params.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    params.setMinimumSize(new Dimension(300,50));
                    params.setMaximumSize(new Dimension(300, 2500));
                    JLabel labels[] = new JLabel[propAmount];
                    JTextField textfields[] = new JTextField[propAmount];
                    for(int i =0; i<propAmount;i++){
                        labels[i] = new JLabel(value.GetProperties().get(i).GetName());
                        textfields[i] = new JTextField(value.GetProperties().get(i).GetValue());
                        gbc.ipadx=100;
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
    }
    public void removeImageFromPanel(String obj){
        drag_drop.remove(imagesTable.get(obj));
        System.out.println("*************"+obj+"  liczba conn "+listOfConn.size());

        for(int i=0;i<listOfConn.size();i++){
            if(listOfConn.get(i).getParentJLabel().getName().equals(obj) || listOfConn.get(i).getChildJLabel().getName().equals(obj)){
                listOfConn.remove(listOfConn.get(i));
            }
        }
        //System.out.println("liczba conn"+listOfConn.size()+"  " + listOfConn.get(0).getParentJLabel().getName());
        //listOfConn.remove(listOfConn.get(0));
       System.out.println("liczba conn "+listOfConn.size());
       /* for (ParentChild temp:listOfConn){
            if(temp.Conntain(imagesTable.get(obj))){
                listOfConn.remove(temp);
            }
        }*/
        imagesTable.remove(obj);

        drag_drop.revalidate();
        drag_drop.repaint();
    }




    private String[] showGUIForConnectionsMaking(){
        textFieldsGlobal=null;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(map.size()+1,2));
        JLabel coto=new JLabel("parent group -child group");
        panel.add(coto);panel.add(new JLabel(""));
        ButtonGroup group1 = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        final String nodes[] = new String[2];
        Set<String> keySet = map.keySet();
        for (String name : keySet)
        {
            JRadioButton rButton = new JRadioButton(name);
            rButton.setActionCommand(map.get(name).x+","+map.get(name).y);
            rButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    nodes[0] = ((JRadioButton)evt.getSource()).getActionCommand();
                }
            });
            group1.add(rButton);
            panel.add(rButton);
            JRadioButton rButton1 = new JRadioButton(name);
            rButton1.setActionCommand(map.get(name).x+","+map.get(name).y);
            rButton1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt)
                {
                    nodes[1] = ((JRadioButton)evt.getSource()).getActionCommand();
                }
            });
            group2.add(rButton1);
            panel.add(rButton1);
        }

        JOptionPane.showMessageDialog(MainWindow.this,panel,"Choose parents for childs",JOptionPane.INFORMATION_MESSAGE);

        return nodes;

    }
    class MyMouseAdapter extends MouseAdapter {
        private Point initialLoc;
        private Point initialLocOnScreen;

        @Override
        public void mousePressed(MouseEvent e) {
            Component comp = (Component) e.getSource();
            initialLoc = comp.getLocation();
            initialLocOnScreen = e.getLocationOnScreen();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Component comp = (Component) e.getSource();
            Point locOnScreen = e.getLocationOnScreen();

            int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
            int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
            comp.setLocation(x, y);
            map.put(((JLabel)comp).getText(),new Point(x,y));
            drag_drop.repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Component comp = (Component) e.getSource();
            Point locOnScreen = e.getLocationOnScreen();

            int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
            int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
            comp.setLocation(x, y);
            map.put(((JLabel)comp).getText(),new Point(x,y));
            drag_drop.repaint();
        }
    }
    ///do rysowania liniii
    private class MyJPanel extends JPanel//Creater your own JPanel and override paintComponentMethod.
    {
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for (ParentChild pair : listOfConn )
            {
                JLabel label1 = pair.getParentJLabel();
                JLabel label2 = pair.getChildJLabel();
                Point point1 = label1.getLocation();
                Point point2 = label2.getLocation();
                int i = pair.howToDrawLine();
                if ( i == 1)
                {
                    g.drawLine(point1.x  , point1.y + label1.getHeight() / 2 , point2.x + label2.getWidth() , point2.y  +  label2.getHeight() / 2);
                }
                else if (i == 2)
                {
                    g.drawLine(point2.x , point2.y + label2.getHeight() / 2 , point1.x + label1.getWidth() , point1.y  +  label1.getHeight() / 2);
                }
                else if (i == 3)
                {
                    g.drawLine(point1.x + label1.getWidth() / 2 , point1.y , point2.x + label2.getWidth() / 2, point2.y + label2.getHeight());
                }
                else if (i == 4)
                {
                    g.drawLine(point2.x + label2.getWidth() / 2 , point2.y , point1.x + label1.getWidth() / 2, point1.y + label1.getHeight());
                }
            }
        }
    }
}
