package gridlab.ModulesItems.Tape;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Player implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 3;

    public Player(){
        properties = new Vector<Property>();
        properties.add(new Property("name","",""));
        properties.add(new Property("parent","",""));
        properties.add(new Property("property","",""));
        properties.add(new Property("file","",""));
        properties.add(new Property("loop","0",""));
        properties.add(new Property("flags","DELTAMODE",""));
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }

    public String ToGLM(){
        String s="";
        s="object player{ \n";
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
}
