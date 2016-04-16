package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;


/**
 * Created by Pavlo on 16.04.2016.
 */
public class Lights {
    private Vector<Property> properties;

    public Lights() {
        properties = new Vector<Property>();
        properties.add(new Property("type", "HID", "")); //HID, SSL, CFL, FLUORESCENT, INCANDESCENT
        properties.add(new Property("placement", "OUTDOOR", "")); //OUTDOOR,INDOOR
        properties.add(new Property("installed_power", "", ""));
        properties.add(new Property("circuit_split", "", ""));
        properties.add(new Property("demand", "", ""));
    }
}
