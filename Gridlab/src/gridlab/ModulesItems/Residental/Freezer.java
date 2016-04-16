package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Freezer implements ToGLMParser{
    private Vector<Property> properties;

    public Freezer(){
        properties = new Vector<Property>();
        properties.add(new Property("size","",""));
        properties.add(new Property("rated_capacity","",""));
        properties.add(new Property("power_factor","",""));
    }
    public String ToGLM(){
        String s="";
        s="object freezer{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
