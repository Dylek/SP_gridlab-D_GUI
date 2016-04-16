package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Dishwasher implements ToGLMParser{
    private Vector<Property> properties;

    public Dishwasher(){
        properties = new Vector<Property>();
        properties.add(new Property("installed_power","",""));
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
        s="object dishwasher{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
