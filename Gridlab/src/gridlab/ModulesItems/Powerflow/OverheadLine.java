package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class OverheadLine implements ToGLMParser {
    private Vector<Property> properties;
    public OverheadLine(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("phases", "", ""));
        properties.add(new Property("from", "", ""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("length", "", ""));
        properties.add(new Property("configuration", "", ""));
  }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object overhead_line { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
