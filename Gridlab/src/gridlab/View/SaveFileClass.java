package gridlab.View;

import gridlab.ModulesItems.ToGLMParser;
import gridlab.ParentChild;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dylek on 2016-05-29.
 */
public class SaveFileClass implements Serializable {

     private static final long serialVersionUID = 1L;
     DefaultListModel<String> modulesItems;
     DefaultListModel<String> powerflowItems;
     DefaultListModel<String> residentalItems;
     DefaultListModel<String> tapeItems;
     DefaultListModel<String> generatorItems;

     DefaultListModel<String> objectsItems;
     DefaultListModel<String> addedObjectsItems;
     DefaultListModel<String> propertiesItems;

     HashMap<String,ToGLMParser> objectTable;
     HashMap<String,JLabel> imagesTable;

     ArrayList<ParentChild> listOfConn;
     HashMap<String,String> hashChildParent;
     Map<String,Point> map;

     int objectCount=0;
     int currentObject=0;
     String stringCurrentObject="";
}
