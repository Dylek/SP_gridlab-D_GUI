package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Clotheswasher implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 2;

    public Clotheswasher(){
        properties = new Vector<Property>();
        properties.add(new Property("motor_power","","W"));
        properties.add(new Property("power_factor","",""));
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("heat_fraction","",""));
        properties.add(new Property("enduse_demand","",""));
        properties.add(new Property("enduse_queue","",""));
        properties.add(new Property("stall_voltage","","V"));
        properties.add(new Property("start_voltage","","V"));
        properties.add(new Property("stall_impedance","","Ohm"));
        properties.add(new Property("trip_delay","","s"));
        properties.add(new Property("reset_delay","","s"));
        properties.add(new Property("state","STOPPED","")); //TRIPPED, STALLED, RUNNING, STOPPED
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object clotheswasher{ \n";
        for (Property p: properties){
            if(p.GetValue()!="")
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
