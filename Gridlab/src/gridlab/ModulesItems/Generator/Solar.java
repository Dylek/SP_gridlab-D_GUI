package gridlab.ModulesItems.Generator;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Solar implements ToGLMParser, Serializable {
    private Vector<Property> properties;
    private int module =0;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\Gridlab icons\\Generator\\solar.png");

    public Solar(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("parent", "", ""));
        properties.add(new Property("generator_mode", "SUPPLY_DRIVEN", ""));//UNKNOWN, CONSTANT_V,CONSTANT_PQ,CONSTANT_PF,SUPPLY_DRIVEN
        properties.add(new Property("generator_status", "ONLINE", " "));//ONLINE,OFFLINE
        properties.add(new Property("panel_type", "SINGLE_CRYSTAL_SILICON", ""));//SINGLE_CRYSTAL_SILICON (default), MULTI_CRYSTAL_SILICON, AMORPHOUS_SILICON,THIN_FILM_GA_AS (incomplete),CONCENTRATOR (incomplete)
        properties.add(new Property("power_type", "", ""));//AC,DC
        properties.add(new Property("INSTALLATION_TYPE", "", ""));//ROOF_MOUNTED,GROUND_MOUNTED
        properties.add(new Property("SOLAR_TILT_MODEL", "DEFAULT", ""));
        properties.add(new Property("SOLAR_POWER_MODEL", "DEFAULT", ""));
        properties.add(new Property("a_coeff", "-2.81", ""));
        properties.add(new Property("b_coeff", "-0.0455", ""));
        properties.add(new Property("dT_coeff", "0.0", "%/degC"));
        properties.add(new Property("T_coeff", "-0.5", ""));
        properties.add(new Property("NOCT", "118.4", "degF"));
        properties.add(new Property("Tmodule", "", "degF"));
        properties.add(new Property("Tambient", "77", "degF"));
        properties.add(new Property("wind_speed", "", "mph"));
        properties.add(new Property("ambient_temperature", "", "degF"));
        properties.add(new Property("Insolation", "0", "W/sf"));
        properties.add(new Property("Rinternal", "0.05", "Ohm"));
        properties.add(new Property("Rated_Insolation", "92.902", "W/sf"));
        properties.add(new Property("Pmax_temp_coeff", "", ""));
        properties.add(new Property("Voc_temp_coeff", "", ""));
        properties.add(new Property("V_Max", "79.34", "V"));
        properties.add(new Property("Voc_Max", "91.22", "V"));
        properties.add(new Property("Voc", "91.22", "V"));
        properties.add(new Property("efficiency", "0.1", "unit"));
        properties.add(new Property("area", "323", "sf"));
        properties.add(new Property("soiling", "", "pu"));
        properties.add(new Property("derating", "", "pu"));
        properties.add(new Property("Rated kVA", "", "kVA"));
        properties.add(new Property("P_Out", "", "kW"));
        properties.add(new Property("V_Out", "", "V"));
        properties.add(new Property("I_Out", "", "A"));
        properties.add(new Property("VA_Out", "", "VA"));
        properties.add(new Property("weather", "", ""));
        properties.add(new Property("shading_factor", "1", "pu"));
        properties.add(new Property("tilt_angle", "45", "deg"));
        properties.add(new Property("orientation_azimuth", "0", "deg"));
        properties.add(new Property("latitude_angle_fix", "false", ""));
        properties.add(new Property("orientation", "DEFAULT", ""));
        properties.add(new Property("phases", "", ""));
    }

    public Solar(Solar solar)
    {
        properties=solar.GetProperties();
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object solar {\n";
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

    public ImageIcon getIcon() {
        return icon;
    }

}
