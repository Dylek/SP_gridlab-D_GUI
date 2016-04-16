package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Freezer implements ToGLMParser{
    private Vector<Property> properties;

    public Freezer(){
        properties = new Vector<Property>();
        properties.add(new Property("size","","cf"));
        properties.add(new Property("rated_capacity","","Btu/h"));
        properties.add(new Property("power_factor","",""));
        properties.add(new Property("temperature","","degF"));
        properties.add(new Property("setpoint","","degF"));
        properties.add(new Property("deadband","","degF"));
        properties.add(new Property("UA","","Btu"));
        properties.add(new Property("state","ON","")); //ON/OFF

    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object freezer{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
