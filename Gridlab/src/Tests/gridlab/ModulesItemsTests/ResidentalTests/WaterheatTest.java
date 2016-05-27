package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Waterheat;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-27.
 */
public class WaterheatTest extends TestCase {
    private Waterheat objectTest=new Waterheat();

    private Vector<Property> ps= new Vector<>();
    private Property p1;
    private Property p2;
    private Property p3;

    public void createPs(){
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
    }

    @Test
    public void testConstructor(){

        assertEquals("tank_volume", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("gal", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("tank_UA", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("Btu", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("tank_diameter", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("water_demand", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("gpm", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("heating_element_capacity", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("kW", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("inlet_water_temperature", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("heat_mode", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("ELECTRIC", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("location", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("GARAGE", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("tank_setpoint", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("thermostat_deadband", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("temperature", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("height", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(11).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}
    @Test
    public void testToGLM(){

        assertEquals("object waterheater{\n"+"heat_mode    ELECTRIC;\n"+
        "location    GARAGE;\n"+

        "} \n",
                objectTest.ToGLM());


    }
    @Test
    public void testSetProperty(){
        createPs();
        objectTest.SetProperty(ps);
        assertEquals(ps,objectTest.GetProperties());
    }
}
