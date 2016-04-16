package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;
/**
 * Created by Dylek on 2016-04-16.
 */
public class Switch implements ToGLMParser {
    private Vector<Property>properties;

    public Switch(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("status", "", ""));
        properties.add(new Property("phase_A_state", "", ""));//OPEN,CLOSED
        properties.add(new Property("phase_B_state", "", ""));//OPEN,CLOSED
        properties.add(new Property("phase_C_state", "", ""));//OPEN,CLOSED
        properties.add(new Property("operating_mode", "", ""));//OPEN,CLOSED
    }
    public Switch(Switch sch)
    {
        properties=sch.GetProperties();
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object switch { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}