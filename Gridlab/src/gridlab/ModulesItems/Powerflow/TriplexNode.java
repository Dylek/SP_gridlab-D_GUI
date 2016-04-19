package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexNode extends ToGLMParser {

    private Vector<Property> properties;
    private int module = 1;
    public TriplexNode(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("bustype", "", ""));
        properties.add(new Property("busflags", "", ""));
        properties.add(new Property("reference_bus", "", ""));
        properties.add(new Property("voltage_1", "", " V"));
        properties.add(new Property("voltage_2", "", " V"));
        properties.add(new Property("voltage_N", "0", " V"));
        properties.add(new Property("voltage_1N", "", " V"));
        properties.add(new Property("voltage_2N", "", " V"));
        properties.add(new Property("maximum_voltage_error", "", " V"));
        properties.add(new Property("mean_repair_time", "", "s"));
        properties.add(new Property("current_1","","A"));
        properties.add(new Property("current_2","","A"));
        properties.add(new Property("current_N","","A"));
        properties.add(new Property("current_12","","A"));
        properties.add(new Property("power_1","","VA"));
        properties.add(new Property("power_2","","VA"));
        properties.add(new Property("power_12","","VA"));
        properties.add(new Property("shunt_1","","mhos"));
        properties.add(new Property("shunt_2","","mhos"));
        properties.add(new Property("shunt_12","","mhos"));
        properties.add(new Property("impedace_1","","Ohms"));
        properties.add(new Property("impedace_2","","Ohms"));
        properties.add(new Property("impedace_12","","Ohms"));


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

    public int getModule(){
        return module;
    }
}
