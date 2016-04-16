package gridlab.ModulesItems.Generator;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Inverter implements ToGLMParser{

    private Vector<Property> properties;

    public Inverter() {
        properties = new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("parent", "", ""));
        properties.add(new Property("inverter_type", "", ""));
        properties.add(new Property("generator_status", "", ""));
        properties.add(new Property("generator_mode", "", ""));
        properties.add(new Property("V_In", "", ""));
        properties.add(new Property("I_In", "", ""));
        properties.add(new Property("VA_In", "", ""));
        properties.add(new Property("Vdc", "", ""));
        properties.add(new Property("power_factor", "", ""));
        properties.add(new Property("Rated_kV", "", ""));
        properties.add(new Property("efficiency", "", ""));

    }
    public Inverter(Inverter inverter){
        properties=inverter.properties;
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }

    public String ToGLM(){
        String s="";
        s="object inverter{ \n";
        for (Property p: properties){
            if(p.GetValue()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
