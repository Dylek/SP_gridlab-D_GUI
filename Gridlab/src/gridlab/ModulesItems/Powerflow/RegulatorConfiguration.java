package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class RegulatorConfiguration {
    private Vector<Property> properties;
    public RegulatorConfiguration(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("connect_type", "", ""));
        properties.add(new Property("band_center", "", ""));
        properties.add(new Property("band_width", "", "V"));
        properties.add(new Property("time_delay", "", "V"));
        properties.add(new Property("dwell_time", "", "KVA"));
        properties.add(new Property("raise_taps", "", "KVA"));
        properties.add(new Property("lower_taps", "", "KVA"));
        properties.add(new Property("current_transducer_ratio", "", "KVA"));
        properties.add(new Property("power_transducer_ratio", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_A", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_B", "", "OHM PU"));
        properties.add(new Property("compensator_r_setting_C", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_A", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_B", "", "OHM PU"));
        properties.add(new Property("compensator_x_setting_C", "", "OHM PU"));
        properties.add(new Property("CT_phase", "", "pounds"));
        properties.add(new Property("PT_phase", "", "pounds"));
        properties.add(new Property("regulation", "", "gallons"));
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
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
