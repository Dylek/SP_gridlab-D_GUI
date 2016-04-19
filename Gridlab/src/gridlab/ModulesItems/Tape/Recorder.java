package gridlab.ModulesItems.Tape;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Recorder implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 3;

    public Recorder(){
        properties = new Vector<Property>();
        properties.add(new Property("name","",""));
        properties.add(new Property("parent","",""));
        properties.add(new Property("property","",""));
        properties.add(new Property("file","",""));
        properties.add(new Property("interval","TS_NEVER",""));
        properties.add(new Property("limit","0",""));
        properties.add(new Property("trigger","",""));
        properties.add(new Property("flags","DELTAMODE",""));
        properties.add(new Property("flush","",""));
        properties.add(new Property("multifile","",""));
        properties.add(new Property("plotcommands","",""));
        properties.add(new Property("xdata","",""));
        properties.add(new Property("columns","",""));
        properties.add(new Property("output","",""));
        properties.add(new Property("header_units","DEFAULT","")); //ALL, NONE, DEFAULT
        properties.add(new Property("line_units","DEFAULT","")); //ALL, NONE, DEFAULT

    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }

    public String ToGLM(){
        String s="";
        s="object recorder{ \n";
        for (Property p: properties){
            if(p.GetName()!=null)
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
