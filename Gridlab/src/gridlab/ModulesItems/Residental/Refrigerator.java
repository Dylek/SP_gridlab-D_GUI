package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;


/**
 * Created by Pavlo on 16.04.2016.
 */
public class Refrigerator {
    private Vector<Property> properties;

    public Refrigerator() {
        properties = new Vector<Property>();
        properties.add(new Property("size", "", ""));
        properties.add(new Property("rated_capacity", "", ""));
        properties.add(new Property("power_factor", "", ""));
    }
}
