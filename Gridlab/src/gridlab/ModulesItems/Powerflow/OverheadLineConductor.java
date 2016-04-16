package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class OverheadLineConductor {
    private Vector<Property> properties;
    public OverheadLineConductor(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("geometric_mean_radius", "", "ft"));
        properties.add(new Property("resistance", "", "Ohm/mile"));
        properties.add(new Property("diameter", "", "in"));
        properties.add(new Property("rating.summer.continuous", "", "A"));
        properties.add(new Property("rating.summer.emergency", "", "A"));
        properties.add(new Property("rating.winter.continuous", "", "A"));
        properties.add(new Property("rating.winter.emergency", "", "A"));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object overhead_line_conductor { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
