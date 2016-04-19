package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Occupants extends ToGLMParser{
    private Vector<Property> properties;
    private int module = 2;

    public Occupants(){
        properties = new Vector<Property>();
        properties.add(new Property("number_of_occupants","",""));
        properties.add(new Property("occupancy_fraction","",""));
        properties.add(new Property("heatgain_per_person","","Btu/h"));
        properties.add(new Property("internal_gains","","kW"));
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object occupantload{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }

    public int getModule(){
        return module;
    }
}

