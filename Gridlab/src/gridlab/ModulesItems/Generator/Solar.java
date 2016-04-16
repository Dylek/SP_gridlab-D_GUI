package gridlab.ModulesItems.Generator;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Solar implements ToGLMParser{
    private Vector<Property> properties;

    public Solar(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("parent", "", ""));
        properties.add(new Property("generator_mode", "SUPPLY_DRIVEN", ""));
        properties.add(new Property("generator_status", "ONLINE", " "));
        properties.add(new Property("panel_type", "SINGLE_CRYSTAL_SILICON", ""));
        properties.add(new Property("power_type", "", ""));
        properties.add(new Property("INSTALLATION_TYPE", "", ""));
        properties.add(new Property("SOLAR_TILT_MODEL", "DEFAULT", ""));
        properties.add(new Property("SOLAR_POWER_MODEL", "DEFAULT", ""));
        properties.add(new Property("a_coeff", "-2.81", ""));
        properties.add(new Property("b_coeff", "-0.0455", ""));
        properties.add(new Property("dT_coeff", "0.0", ""));
        properties.add(new Property("T_coeff", "-0.5", "%/degC"));
        properties.add(new Property("NOCT", "118.4", "F"));
        properties.add(new Property("Tmodule", "", "DegF"));
        properties.add(new Property("Tambient", "", "DegF"));
        properties.add(new Property("wind_speed", "", "mph"));
        properties.add(new Property("ambient_temperature", "", "DegF"));
        properties.add(new Property("Insolation", "", "W/sqF"));
        properties.add(new Property("Rinternal", "0.05", "OHM"));
        properties.add(new Property("Rated_Insolation", "92.902", "W/sqF"));
        properties.add(new Property("Pmax_temp_coeff", "", ""));
        properties.add(new Property("Voc_temp_coeff", "", ""));
        properties.add(new Property("V_Max", "79.34", "V"));
        properties.add(new Property("Voc_Max", "91.22", "V"));
        properties.add(new Property("Voc", "91.22", "V"));
        properties.add(new Property("efficiency", "0.1", ""));
        properties.add(new Property("area", "323", "sqf"));
        properties.add(new Property("soiling", "", ""));
        properties.add(new Property("derating", "", ""));
        properties.add(new Property("Rated kVA", "", "KVA"));
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
        properties=solar.properties;
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object solar{ \n";
        for (Property p: properties){
            if(p.GetValue()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }

}
