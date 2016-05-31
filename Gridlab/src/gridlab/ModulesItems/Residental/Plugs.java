package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Plugs implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 2;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Residental\\plug.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Plugs(){
        properties = new Vector<Property>();
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("demand","",""));
        properties.add(new Property("heat_fraction","",""));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object plugload{ \n";
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
