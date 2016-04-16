package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Plugs {
    private Vector<Property> properties;

    public Plugs(){
        properties = new Vector<Property>();
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("demand","",""));
        properties.add(new Property("heat_fraction","",""));
    }
}
