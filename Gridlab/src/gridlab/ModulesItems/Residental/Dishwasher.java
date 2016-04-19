package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Dishwasher extends ToGLMParser{
    private Vector<Property> properties;
    private int module = 2;

    public Dishwasher(){
        properties = new Vector<Property>();
        properties.add(new Property("energy_baseline","0.9","kWh"));
        properties.add(new Property("heateddry_option_check","TRUE",""));
        properties.add(new Property("control_power","10","W"));
        properties.add(new Property("motor_power","250","W"));
        properties.add(new Property("coil_rating_wash and rinse cycles","950","W"));
        properties.add(new Property("coil_rating_heated dry","695","W"));
        properties.add(new Property("daily_dishwasher_demand","1",""));
        properties.add(new Property("power_factor_motor","0.95",""));
        properties.add(new Property("power_factor_coil","1",""));
        properties.add(new Property("power_coil_only","0",""));
        properties.add(new Property("queue","0.8",""));


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

    public int getModule(){
        return module;
    }
}
