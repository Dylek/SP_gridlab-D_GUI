package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Dishwasher implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 2;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Residental\\dishwasher.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Dishwasher(){
        properties = new Vector<Property>();
        properties.add(new Property("energy_baseline","0.9","kWh"));
        properties.add(new Property("control_power","10","W"));
        properties.add(new Property("motor_power","250","W"));
        properties.add(new Property("daily_dishwasher_demand","1",""));
        properties.add(new Property("queue","0.8",""));


    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object dishwasher{ \n";
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
