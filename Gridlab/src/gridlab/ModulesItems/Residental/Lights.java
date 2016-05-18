package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.util.Vector;


/**
 * Created by Pavlo on 16.04.2016.
 */
public class Lights implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 2;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Residental\\incandescent-light-bulb.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Lights() {
        properties = new Vector<Property>();
        properties.add(new Property("type", "HID", "")); //HID, SSL, CFL, FLUORESCENT, INCANDESCENT
        properties.add(new Property("placement", "OUTDOOR", "")); //OUTDOOR,INDOOR
        properties.add(new Property("installed_power", "", "kW"));
        properties.add(new Property("circuit_split", "", ""));
        properties.add(new Property("power_density", "", "W/sf"));
        properties.add(new Property("curtailment", "", ""));
        properties.add(new Property("actual_power", "", "kVA"));
        properties.add(new Property("demand", "", ""));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object lights{ \n";
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
