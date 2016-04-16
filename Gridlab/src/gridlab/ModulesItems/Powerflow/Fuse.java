package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Fuse {
    private Vector<Property> properties;
    public Fuse(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "ABC", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("current_limit", "", "A"));
        properties.add(new Property("mean_replacement_time", "", "s"));
        properties.add(new Property("phase_A_status", "GOOD", "")); //GOOD, BLOWN
        properties.add(new Property("phase_B_status", "GOOD", "")); //GOOD, BLOWN
        properties.add(new Property("phase_C_status", "BLOWN", "")); //GOOD, BLOWN
        properties.add(new Property("repair_dist_type", "NONE", "")); //NONE,EXPONENTIAL
     }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object fuse { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}