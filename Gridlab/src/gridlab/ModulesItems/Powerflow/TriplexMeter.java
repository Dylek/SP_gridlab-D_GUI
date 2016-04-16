package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexMeter {

    private Vector<Property> properties;
    public TriplexMeter(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("nominal_voltage", "", " V"));
        properties.add(new Property("bustype", "", ""));
        properties.add(new Property("maximum_voltage_error", "", " Volts"));
        properties.add(new Property("busflags", "", ""));
        properties.add(new Property("voltage_A", "", " VA"));
        properties.add(new Property("voltage_B", "", " VA"));
        properties.add(new Property("voltage_C", "", " VA"));
        properties.add(new Property("bill_day", "", ""));
        properties.add(new Property("price", "", " $/kwh"));
        properties.add(new Property("monthly_fee", "", " $"));
        properties.add(new Property("monthly_energy", "", " kwh"));
        properties.add(new Property("previous_monthly_energy", "", " kwh"));
        properties.add(new Property("bill_mode", "", ""));
        properties.add(new Property("power_market", "", " "));
        properties.add(new Property("first_tier_price", "", " $"));
        properties.add(new Property("second_tier_price", "", " $"));
        properties.add(new Property("third_tier_price", "", " $"));
        properties.add(new Property("first_tier_energy", "", " kwh"));
        properties.add(new Property("second_tier_energy", "", " kwh"));
        properties.add(new Property("third_tier_energy", "", " kwh"));

    }
    public TriplexMeter(TriplexMeter newOne)
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
        s="object triplex_meter { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
