package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Node extends ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public Node(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("nominal_voltage", "7200.0", "V"));
        properties.add(new Property("voltage_A", "7200.0+0d", "V"));
        properties.add(new Property("voltage_B", "7200.0-120.0d", "V"));
        properties.add(new Property("voltage_C", "7200.0+120.0d", "V"));
        properties.add(new Property("voltage_AB", "", "V"));
        properties.add(new Property("voltage_BC", "", "V"));
        properties.add(new Property("voltage_CA", "", "V"));
        properties.add(new Property("current_A", "", "A"));
        properties.add(new Property("current_B", "", "A"));
        properties.add(new Property("current_C", "", "A"));
        properties.add(new Property("power_A", "", ""));
        properties.add(new Property("power_B", "", ""));
        properties.add(new Property("power_C", "", ""));
        properties.add(new Property("shunt_A", "", "mhos"));
        properties.add(new Property("shunt_B", "", "mhos"));
        properties.add(new Property("shunt_C", "", "mhos"));
        properties.add(new Property("bustype", "PQ", "")); //PQ, PV, SWING
        properties.add(new Property("maximum_voltage_error", "", "V"));
        properties.add(new Property("busflags", "", ""));
        properties.add(new Property("reference_bus", "", ""));
        properties.add(new Property("mean_repair_time", "", "s"));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object node { \n";
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
