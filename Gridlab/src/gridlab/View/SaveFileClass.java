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

     ArrayList<ParentChild> listOfConn;
     HashMap<String,String> hashChildParent;
     Map<String,Point> map;
     //static
     int objectCount=0;
     int currentObject=0;
     String stringCurrentObject="";
}
