package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Transformer {
    private Vector<Property> properties;
    public Transformer(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("aging_constant", "", "Kelvin"));
        properties.add(new Property("aging_granularity", "", "sec"));
        properties.add(new Property("ambient_temperature", "", "C"));
        properties.add(new Property("climate", "", ""));
        properties.add(new Property("configuration", "", ""));
        properties.add(new Property("percent_loss_of_life", "", ""));
        properties.add(new Property("top_oil_hot_spot_temperature", "", "Celsius"));
        properties.add(new Property("use_thermal_model", "", ""));
        properties.add(new Property("winding_hot_spot_temperature", "", "Celsius"));

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
}
