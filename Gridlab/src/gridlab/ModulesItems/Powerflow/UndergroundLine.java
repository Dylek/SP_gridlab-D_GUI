package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class UndergroundLine implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Powerflow\\undergroundline.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public UndergroundLine(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "",""));
        properties.add(new Property("phases", "ABC",""));
        properties.add(new Property("from", "",""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("length", "0", " ft"));
        properties.add(new Property("configuration", "",""));

    }
    public UndergroundLine(UndergroundLine newOne)
    {
        properties=newOne.GetProperties();
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object underground_line { \n";
        for (Property p: properties){
            if(!p.GetValue().isEmpty())
            {
                s+=p.GetName()+"    "+p.GetValue();
                // if(false)s+=" "+p.GetUnit();
                s+=";\n";
            }
        }
        s+="} \n";
        return s;
    }

    public int getModule(){
        return module;
    }
}
