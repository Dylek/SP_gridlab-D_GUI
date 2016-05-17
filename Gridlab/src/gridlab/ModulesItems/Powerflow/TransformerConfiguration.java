package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TransformerConfiguration implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Powerflow\\transformerconfiguration.png");

    public ImageIcon getIcon() {
        return icon;
    }

    public TransformerConfiguration(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("connect_type", "DELTA_DELTA", ""));//UNKNOWN,WYE_WYE,DELTA_DELTA,DELTA_GWYE,SINGLE_PHASE,SINGLE_PHASE_CENTER_TAPPED
        properties.add(new Property("install_type", "", ""));//UNKNOWN,POLETOP,PADMOUNT,VAULT
        properties.add(new Property("primary_voltage", "4800", "V"));
        properties.add(new Property("secondary_voltage", "480", "V"));
        properties.add(new Property("power_rating", "500", "kVA"));
        properties.add(new Property("powerA_rating", "", "kVA"));
        properties.add(new Property("powerB_rating", "", "kVA"));
        properties.add(new Property("powerC_rating", "", "kVA"));
        properties.add(new Property("resistance", "10", "OHM PU"));
        properties.add(new Property("reactance", "10", "OHM PU"));
        properties.add(new Property("impedance", "", "OHM PU"));
        properties.add(new Property("shunt_impedance", "", "OHM PU"));
        properties.add(new Property("impedance1", "", "OHM PU"));
        properties.add(new Property("impedance2", "", "OHM PU"));
        properties.add(new Property("full_load_loss", "", "OHM PU"));
        properties.add(new Property("core_coil_weight", "", "pounds"));
        properties.add(new Property("tank_fittings_weight", "", "pounds"));
        properties.add(new Property("oil_volume", "", "gallons"));
        properties.add(new Property("rated_winding_hot_spot_rise", "", "C"));
        properties.add(new Property("rated_top_oil_rise", "", "C"));
        properties.add(new Property("rated_winding_time_constant", "", "H"));
        properties.add(new Property("installed_insulation_life", "", "H"));
        properties.add(new Property("coolant_type", "", ""));
        properties.add(new Property("cooling_type", "", ""));
    }
    public TransformerConfiguration(TransformerConfiguration newOne)
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
        s="object transformer_configuration { \n";
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
