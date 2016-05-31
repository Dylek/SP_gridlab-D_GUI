package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexLineConfiguration implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Powerflow\\triplexlineconfiguration.png");

    public ImageIcon getIcon() {
        return icon;
    }

    public TriplexLineConfiguration(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("conductor_A", "", ""));
        properties.add(new Property("conductor_B", "", ""));
       // properties.add(new Property("conductor_C", "", ""));
        properties.add(new Property("conductor_N", "", ""));
        properties.add(new Property("insulation_thickness", "", "in"));
        properties.add(new Property("spacing", "", ""));

        properties.add(new Property("z11", "", ""));
        properties.add(new Property("z12", "", ""));
        properties.add(new Property("z13", "", ""));
        properties.add(new Property("z21", "", ""));
        properties.add(new Property("z22", "", ""));
        properties.add(new Property("z23", "", ""));
        properties.add(new Property("z31", "", ""));
        properties.add(new Property("z32", "", ""));
        properties.add(new Property("z33", "", ""));
    }
    public TriplexLineConfiguration(TriplexLineConfiguration newOne)
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
        s="object triplex_line_configuration { \n";
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
