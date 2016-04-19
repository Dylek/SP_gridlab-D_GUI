package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Waterheat implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 2;

    public Waterheat(){
        properties = new Vector<Property>();
        properties.add(new Property("tank_volume","","gal"));
        properties.add(new Property("tank_UA","","Btu"));
        properties.add(new Property("tank_diameter","","ft"));
        properties.add(new Property("water_demand","","gpm"));
        properties.add(new Property("heating_element_capacity","","kW"));
        properties.add(new Property("inlet_water_temperature","","degF"));
        properties.add(new Property("heat_mode","ELECTRIC","")); //ELECTRIC,GASHEAT
        properties.add(new Property("location","GARAGE","")); //GARAGE,INSIDE
        properties.add(new Property("tank_setpoint","","degF"));
        properties.add(new Property("thermostat_deadband","","degF"));
        properties.add(new Property("temperature","","degF"));
        properties.add(new Property("height","","ft"));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        for (Property p: properties){
            if(p.GetValue()!=null)
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
