package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Transformer extends ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public Transformer(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("aging_constant", "", "K"));
        properties.add(new Property("aging_granularity", "", "s"));
        properties.add(new Property("ambient_temperature", "", "C"));
        properties.add(new Property("climate", "", ""));
        properties.add(new Property("configuration", "", ""));
        properties.add(new Property("percent_loss_of_life", "", "%"));
        properties.add(new Property("top_oil_hot_spot_temperature", "", "C"));
        properties.add(new Property("use_thermal_model", "", ""));
        properties.add(new Property("winding_hot_spot_temperature", "", "C"));

    }
    public Transformer(Transformer trans)
    {
        properties=trans.GetProperties();
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object transformer { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }

    public int getModule(){
        return module;
    }
}
