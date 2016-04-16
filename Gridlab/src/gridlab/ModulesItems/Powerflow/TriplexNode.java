package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexNode {

    private Vector<Property> properties;
    public TriplexNode(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("voltage_1", "", " complex"));
        properties.add(new Property("voltage_2", "", " complex"));
        properties.add(new Property("voltage_N", "0", " complex"));
        properties.add(new Property("bustype", "", ""));
        properties.add(new Property("maximum_voltage_error", "", " Volts"));
        properties.add(new Property("busflags", "", ""));
        properties.add(new Property("mean_repair_time", "", " Seconds"));

    }
    public TriplexNode(TriplexNode newOne)
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
        s="object triplex_node { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
