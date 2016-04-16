package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class Clotheswasher {
    private Vector<Property> properties;

    public Clotheswasher(){
        properties = new Vector<Property>();
        properties.add(new Property("motor_power","",""));
        properties.add(new Property("power_factor","",""));
        properties.add(new Property("circuit_split","",""));
        properties.add(new Property("heat_fraction","",""));
        properties.add(new Property("enduse_demand","",""));
        properties.add(new Property("enduse_queue","",""));
        properties.add(new Property("stall_voltage","",""));
        properties.add(new Property("start_voltage","",""));
        properties.add(new Property("stall_impedance","",""));
        properties.add(new Property("trip_delay","",""));
        properties.add(new Property("reset_delay","",""));
        properties.add(new Property("state","TRIPPED","")); //TRIPPED, STALLED, RUNNING, STOPPED
    }
}
