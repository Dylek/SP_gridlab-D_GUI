package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class RegulatorConfiguration implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public RegulatorConfiguration(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("connect_type", "", ""));
        properties.add(new Property("band_center", "", ""));
        properties.add(new Property("band_width", "", "V"));
        properties.add(new Property("time_delay", "", "V"));
        properties.add(new Property("dwell_time", "", "kVA"));
        properties.add(new Property("raise_taps", "16", ""));
        properties.add(new Property("lower_taps", "16", ""));
        properties.add(new Property("current_transducer_ratio", "", "kVA"));
        properties.add(new Property("power_transducer_ratio", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_A", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_B", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_C", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_A", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_B", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_C", "", "OHM PU"));
        properties.add(new Property("CT_phase", "", "lb"));
        properties.add(new Property("PT_phase", "", "lb"));
        properties.add(new Property("regulation", "", "gal"));
        properties.add(new Property("Control", "", "C"));
        properties.add(new Property("Type", "", "C"));
        properties.add(new Property("tap_pos_A", "", "H"));
        properties.add(new Property("tap_pos_B", "", "H"));
        properties.add(new Property("tap_pos_C", "", ""));
    }
    public RegulatorConfiguration(RegulatorConfiguration reg)
    {
        properties=reg.GetProperties();

    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object regulator_configuration { \n";
        for (Property p: properties){
            if(!p.GetValue().isEmpty())
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
