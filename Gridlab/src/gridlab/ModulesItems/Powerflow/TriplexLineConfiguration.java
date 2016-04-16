package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexLineConfiguration {
    private Vector<Property> properties;
    public TriplexLineConfiguration(){
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
    public TriplexLineConfiguration(TriplexLineConfigurationr newOne)
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
        s="object triplex_line_configuration { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
