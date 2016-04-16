package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Microwave {
    private Vector<Property> properties;

    public Microwave(){
        properties = new Vector<Property>();
        properties.add(new Property("installed_power","",""));
        properties.add(new Property("standby_power","",""));
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("demand","",""));
        properties.add(new Property("heat_fraction","",""));
        properties.add(new Property("state","ON",""));
        properties.add(new Property("runtime","",""));
        properties.add(new Property("state_time","",""));
    }
}
