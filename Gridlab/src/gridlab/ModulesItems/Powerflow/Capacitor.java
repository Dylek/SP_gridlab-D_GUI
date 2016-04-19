package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Capacitor implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public Capacitor(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("pt_phase", "", ""));
        properties.add(new Property("phases_connected", "", ""));
        properties.add(new Property("switchA", "OPEN", ""));
        properties.add(new Property("switchB", "OPEN", ""));
        properties.add(new Property("switchC", "CLOSED", ""));
        properties.add(new Property("control", "", "")); //MANUAL, VAR, VOLT, VARVOLT
        properties.add(new Property("nominal_voltage", "", "V"));
        properties.add(new Property("voltage_set_high", "", "V"));
        properties.add(new Property("voltage_set_low", "", "V"));
        properties.add(new Property("VAr_set_high", "", "VAr"));
        properties.add(new Property("VAr_set_low", "", "VAr"));
        properties.add(new Property("capacitor_A", "", "VAr"));
        properties.add(new Property("capacitor_B", "", "VAr"));
        properties.add(new Property("capacitor_C", "", "VAr"));
        properties.add(new Property("cap_nominal_voltage", "", "V"));
        properties.add(new Property("time_delay", "", "s"));
        properties.add(new Property("dwell_time", "", "s"));
        properties.add(new Property("lockout_time", "", "s"));
        properties.add(new Property("remote_sense", "", ""));
        properties.add(new Property("remote_sense_B", "", ""));
        properties.add(new Property("control_level", "INDIVIDUAL ", "")); //BANK,INDIVIDUAL

    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object capacitor { \n";
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
