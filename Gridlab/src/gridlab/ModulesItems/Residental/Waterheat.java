package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Waterheat implements ToGLMParser {
    private Vector<Property> properties;

    public Waterheat(){
        properties = new Vector<Property>();
        properties.add(new Property("tank_volume","",""));
        properties.add(new Property("tank_UA","",""));
        properties.add(new Property("tank_diameter","",""));
        properties.add(new Property("water_demand","",""));
        properties.add(new Property("heating_element_capacity","",""));
        properties.add(new Property("inlet_water_temperature","",""));
        properties.add(new Property("heat_mode","ELECTRIC","")); //ELECTRIC,GASHEAT
        properties.add(new Property("location","GARAGE","")); //GARAGE,INSIDE
        properties.add(new Property("tank_setpoint","",""));
        properties.add(new Property("thermostat_deadband","",""));
        properties.add(new Property("temperature","",""));
        properties.add(new Property("height","",""));
    }

    public String ToGLM(){
        String s="";
        s="object waterheater{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
