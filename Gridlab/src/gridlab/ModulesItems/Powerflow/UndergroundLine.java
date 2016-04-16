package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class UndergroundLine implements ToGLMParser {
    private Vector<Property> properties;
    public UndergroundLine(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "",""));
        properties.add(new Property("phases", "",""));
        properties.add(new Property("from", "",""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("length", "0", " ft"));
        properties.add(new Property("configuration", "",""));

    }
    public UndergroundLine(UndergroundLine newOne)
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
        s="object triplex_node { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
