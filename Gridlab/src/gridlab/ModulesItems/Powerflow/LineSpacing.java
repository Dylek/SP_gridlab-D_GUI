package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class LineSpacing implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Powerflow\\linespacing.png");

    public ImageIcon getIcon() {
        return icon;
    }

    public LineSpacing(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("distance_AB", "", "ft"));
        properties.add(new Property("distance_BC", "", "ft"));
        properties.add(new Property("distance_CA", "", "ft"));
        properties.add(new Property("distance_AN", "", "ft"));
        properties.add(new Property("distance_BN", "", "ft"));
        properties.add(new Property("distance_CN", "", "ft"));
        properties.add(new Property("distance_AE", "", "ft"));
        properties.add(new Property("distance_BE", "", "ft"));
        properties.add(new Property("distance_CE", "", "ft"));
        properties.add(new Property("distance_NE", "", "ft"));
   }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object line_spacing { \n";
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
