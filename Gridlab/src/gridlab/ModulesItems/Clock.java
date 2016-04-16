package gridlab.ModulesItems;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Clock implements ToGLMParser {

    private Vector<Property> properties;

    public Clock(){
        properties = new Vector<Property>();
        properties.add(new Property("timezone","",""));
        properties.add(new Property("timesptamp","",""));
        properties.add(new Property("starttime","",""));
        properties.add(new Property("stoptime","",""));
    }
    public Clock(Clock clock){
        properties = new Vector<Property>();
        properties=clock.properties;
    }
    public String ToGLM(){
        String s="";
        s="clock{ \n";
        for (Property p: properties){
            if(p.GetValue()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+"\n";
        }
        s+="} \n";
        return s;
    }
}
