package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class UnderGroundLineConductor implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public UnderGroundLineConductor(){
        properties = new Vector<Property>();
        properties.add(new Property("name", "",""));
        properties.add(new Property("outer_diameter", "", "in"));
        properties.add(new Property("conductor_gmr", "", "ft"));
        properties.add(new Property("conductor_diameter", "", "in"));
        properties.add(new Property("conductor_resistance", "", "Ohm/mile"));
        properties.add(new Property("neutral_gmr", "", "ft"));
        properties.add(new Property("neutral_diameter", "", " in"));
        properties.add(new Property("neutral_resistance", "", "Ohm/mile"));
        properties.add(new Property("neutral_strands", "", ""));
        properties.add(new Property("insultation_relative_permitivitty", "", ""));
        properties.add(new Property("shield_gmr", "", "feet"));
        properties.add(new Property("shield_resistance", "", "Ohm/mile"));
        properties.add(new Property("rating.summer.continuous", "", " A"));
        properties.add(new Property("rating.summer.emergency", "", "A"));
        properties.add(new Property("rating.winter.continuous", "", " A"));
        properties.add(new Property("rating.winter.emergency", "", "A"));

    }
    public UnderGroundLineConductor(UnderGroundLineConductor prop){
        properties=prop.GetProperties();
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object underground_line_conductor { \n";
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
