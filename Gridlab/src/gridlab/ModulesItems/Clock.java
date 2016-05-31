package gridlab.ModulesItems;

import javax.swing.*;
import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Clock implements ToGLMParser, Serializable {

    private Vector<Property> properties;
    private ImageIcon icon = new ImageIcon("Gridlab\\Icons\\clock-128.png");
    public ImageIcon getIcon() {
        return icon;
    }

    public Clock(){
        properties = new Vector<Property>();
        properties.add(new Property("timezone","PST+8PDT",""));
        properties.add(new Property("timestamp","",""));
        properties.add(new Property("starttime","'2016-04-01 00:00:00'",""));
        properties.add(new Property("stoptime","'2016-04-02 00:00:00'",""));
    }
    public Clock(Clock clock){
        properties = new Vector<Property>();
        properties=clock.properties;
    }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="clock{ \n";
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
        return 999;
    }
}
