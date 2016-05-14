package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Occupants implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 2;
    private ImageIcon icon = new ImageIcon();
    public ImageIcon getIcon() {
        return icon;
    }

    public Occupants(){
        properties = new Vector<Property>();
        properties.add(new Property("number_of_occupants","",""));
        properties.add(new Property("occupancy_fraction","",""));
        properties.add(new Property("heatgain_per_person","","Btu/h"));
        properties.add(new Property("internal_gains","","kW"));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object occupantload{ \n";
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

