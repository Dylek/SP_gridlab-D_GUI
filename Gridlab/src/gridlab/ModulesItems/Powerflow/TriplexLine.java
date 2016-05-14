package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class TriplexLine implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 1;
    private ImageIcon icon = new ImageIcon();
    public ImageIcon getIcon() {
        return icon;
    }

    public TriplexLine(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "",""));
        properties.add(new Property("phases", "ABC",""));
        properties.add(new Property("from", "",""));
        properties.add(new Property("to", "", ""));
        properties.add(new Property("length", "0", " ft"));
        properties.add(new Property("configuration", "",""));
    }
    public TriplexLine(TriplexLine newOne)
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
        s="object triplex_line { \n";
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
