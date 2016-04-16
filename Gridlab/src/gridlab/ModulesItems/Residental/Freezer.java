package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Freezer {
    private Vector<Property> properties;

    public Freezer(){
        properties = new Vector<Property>();
        properties.add(new Property("size","",""));
        properties.add(new Property("rated_capacity","",""));
        properties.add(new Property("power_factor","",""));
    }
}
