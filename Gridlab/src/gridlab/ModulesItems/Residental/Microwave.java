package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Microwave implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 2;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Residental\\microwave-oven.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Microwave(){
        properties = new Vector<Property>();
        properties.add(new Property("installed_power","","W"));
        properties.add(new Property("standby_power","","W"));
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("demand","",""));
        properties.add(new Property("heat_fraction","",""));
        properties.add(new Property("state","ON","")); //ON/OFF
        properties.add(new Property("runtime","","s"));
        properties.add(new Property("state_time","","s"));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object microwave{ \n";
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
