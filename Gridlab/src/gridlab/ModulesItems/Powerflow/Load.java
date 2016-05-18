package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Load implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Powerflow\\flash.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Load(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "ABC", ""));
        properties.add(new Property("nominal_voltage", "4800", ""));
        properties.add(new Property("load_class", "", "")); //U,R,C,I,A
        properties.add(new Property("constant_power_A", "", "VA"));
        properties.add(new Property("constant_power_B", "", "VA"));
        properties.add(new Property("constant_power_C", "", "VA"));
        properties.add(new Property("constant_current_A", "", "A"));
        properties.add(new Property("constant_current_B", "", "A"));
        properties.add(new Property("constant_current_C", "", "A"));
        properties.add(new Property("constant_impedance_A", "", "OHM"));
        properties.add(new Property("constant_impedance_B", "", "OHM"));
        properties.add(new Property("constant_impedance_C", "", "OHM"));
      }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object load { \n";
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
