package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class LineConfiguration extends ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;

    public LineConfiguration(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("conductor_A", "", ""));
        properties.add(new Property("conductor_B", "", ""));
        properties.add(new Property("conductor_C", "", ""));
        properties.add(new Property("conductor_N", "", ""));
        properties.add(new Property("spacing", "", ""));
        properties.add(new Property("z11", "", ""));
        properties.add(new Property("z12", "", ""));
        properties.add(new Property("z13", "", ""));
        properties.add(new Property("z21", "", ""));
        properties.add(new Property("z22", "", ""));
        properties.add(new Property("z23", "", ""));
        properties.add(new Property("z31", "", ""));
        properties.add(new Property("z32", "", ""));
        properties.add(new Property("z33", "", ""));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object line_configuration { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }

    public int getModule(){
        return module;
    }
}
