package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Meter implements ToGLMParser {
    private Vector<Property> properties;
    public Meter(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("nominal_voltage", "", ""));
        properties.add(new Property("bill_day", "", ""));
        properties.add(new Property("price", "", "$/kWh"));
        properties.add(new Property("monthly_fee", "", "$"));
        properties.add(new Property("monthly_bill", "", "$"));
        properties.add(new Property("previous_monthly_bill", "", "$"));
        properties.add(new Property("monthly_energy", "", "kWh"));
        properties.add(new Property("previous_monthly_energy", "", "kWh"));
        properties.add(new Property("bill_mode", "NONE", "")); //NONE, UNIFORM, TIERED, HOURLY
        properties.add(new Property("power_market", "", ""));
        properties.add(new Property("first_tier_price", "", "$/kWh"));
        properties.add(new Property("second_tier_price", "", "$/kWh"));
        properties.add(new Property("third_tier_price", "", "$/kWh"));
        properties.add(new Property("first_tier_energy", "", "kWh"));
        properties.add(new Property("second_tier_energy", "", "kWh"));
        properties.add(new Property("third_tier_energy ", "", "kWh"));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object meter { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
