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
        properties.add(new Property("timestamp","",""));
        properties.add(new Property("starttime","",""));
        properties.add(new Property("stoptime","",""));
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
            if(p.GetValue()!=null)
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
