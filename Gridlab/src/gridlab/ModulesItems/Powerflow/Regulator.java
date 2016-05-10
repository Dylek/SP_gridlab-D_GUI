package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Regulator implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public Regulator(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "ABC", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", "V"));
        properties.add(new Property("configuration", "", ""));
        properties.add(new Property("tap_A", "", ""));
        properties.add(new Property("tap_B", "", ""));
        properties.add(new Property("tap_C", "", ""));
        properties.add(new Property("sense_node", "", ""));
        properties.add(new Property("tap_A_change_count", "", ""));
        properties.add(new Property("tap_B_change_count", "", ""));
        properties.add(new Property("tap_C_change_count", "", ""));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object regulator { \n";
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
