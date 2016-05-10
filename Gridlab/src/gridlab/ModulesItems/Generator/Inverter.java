package gridlab.ModulesItems.Generator;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Inverter implements ToGLMParser {

    private Vector<Property> properties;
    private int module =0;
    public Inverter() {
        properties = new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("parent", "", ""));
        properties.add(new Property("inverter_type", "TWO_PULSE", ""));//TWO_PULSE,SIX_PULSE,TWELVE_PULSE,PWM,FOUR_QUADRANT
        properties.add(new Property("generator_status", "ONLINE", ""));//ONLINE, OFFLINE
        properties.add(new Property("generator_mode", "CONSTANT_PF", ""));//UNKNOWN, CONSTANT_V,CONSTANT_PQ,CONSTANT_PF,SUPPLY_DRIVEN
        properties.add(new Property("V_In", "", "V"));
        properties.add(new Property("I_In", "", "A"));
        properties.add(new Property("VA_In", "", "VA"));
        properties.add(new Property("Vdc", "", "V"));
        properties.add(new Property("power_factor", "", "unit"));
        properties.add(new Property("use_multipoint_efficiency", "", ""));
        properties.add(new Property("four_quadrant_control_mode", "", ""));//(NONE, CONSTANT_PQ, CONSTANT_PF, CONSTANT_V, VOLT_VAR)
        properties.add(new Property("inverter_manufacturer", "", ""));//(NONE, FRONIUS, SMA, XANTREX)

        //properties.add(new Property("Rated_kV", "", ""));
       // properties.add(new Property("efficiency", "", ""));

    }
    public Inverter(Inverter inverter){
        properties=inverter.GetProperties();
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }

    public String ToGLM(){
        String s="";
        s="object inverter{ \n";
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

    public static void main(String[] args) {
        Inverter inek=new Inverter();
        if(inek.GetProperties().get(0).GetValue().isEmpty())
        System.out.println("tak"+inek.GetProperties().get(0).GetValue()+"tak");
        else
            System.out.println("nie");

    }
}
