package Tests.gridlab.ModulesItemsTests.GeneratorTests;

import gridlab.ModulesItems.Generator.Inverter;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-18.
 */
public class InverterTest extends TestCase {

    Inverter i = new Inverter();
    private Vector<Property> ps;
    private Property p1;
    private Property p2;
    private Property p3;

    public void createPs(){
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
    }

    @Test
    public void testConstructor() {
        assertEquals("name", i.GetProperties().firstElement().GetName());
        assertEquals("", i.GetProperties().firstElement().GetValue());
        assertEquals("", i.GetProperties().firstElement().GetUnit());

        assertEquals("phase", i.GetProperties().elementAt(1).GetName());
        assertEquals("", i.GetProperties().elementAt(1).GetValue());
        assertEquals("", i.GetProperties().elementAt(1).GetValue());

        assertEquals("parent", i.GetProperties().elementAt(2).GetName());
        assertEquals("", i.GetProperties().elementAt(2).GetValue());
        assertEquals("", i.GetProperties().elementAt(2).GetUnit());

        assertEquals("inverter_type", i.GetProperties().elementAt(3).GetName());
        assertEquals("TWO_PULSE", i.GetProperties().elementAt(3).GetValue());
        assertEquals("", i.GetProperties().elementAt(3).GetUnit());

        assertEquals("generator_status", i.GetProperties().elementAt(4).GetName());
        assertEquals("ONLINE", i.GetProperties().elementAt(4).GetValue());
        assertEquals("", i.GetProperties().elementAt(4).GetUnit());

        assertEquals("generator_mode", i.GetProperties().elementAt(5).GetName());
        assertEquals("CONSTANT_PF", i.GetProperties().elementAt(5).GetValue());
        assertEquals("", i.GetProperties().elementAt(5).GetUnit());

        assertEquals("V_In", i.GetProperties().elementAt(6).GetName());
        assertEquals("", i.GetProperties().elementAt(6).GetValue());
        assertEquals("V", i.GetProperties().elementAt(6).GetUnit());

        assertEquals("I_In", i.GetProperties().elementAt(7).GetName());
        assertEquals("", i.GetProperties().elementAt(7).GetValue());
        assertEquals("A", i.GetProperties().elementAt(7).GetUnit());

        assertEquals("VA_In", i.GetProperties().elementAt(8).GetName());
        assertEquals("", i.GetProperties().elementAt(8).GetValue());
        assertEquals("VA", i.GetProperties().elementAt(8).GetUnit());

        assertEquals("Vdc", i.GetProperties().elementAt(9).GetName());
        assertEquals("", i.GetProperties().elementAt(9).GetValue());
        assertEquals("V", i.GetProperties().elementAt(9).GetUnit());

        assertEquals("power_factor", i.GetProperties().elementAt(10).GetName());
        assertEquals("", i.GetProperties().elementAt(10).GetValue());
        assertEquals("unit", i.GetProperties().elementAt(10).GetUnit());

        assertEquals("use_multipoint_efficiency", i.GetProperties().elementAt(11).GetName());
        assertEquals("", i.GetProperties().elementAt(11).GetValue());
        assertEquals("", i.GetProperties().elementAt(11).GetUnit());

        assertEquals("four_quadrant_control_mode", i.GetProperties().elementAt(12).GetName());
        assertEquals("", i.GetProperties().elementAt(12).GetValue());
        assertEquals("", i.GetProperties().elementAt(12).GetUnit());

        assertEquals("inverter_manufacturer", i.GetProperties().elementAt(13).GetName());
        assertEquals("", i.GetProperties().elementAt(13).GetValue());
        assertEquals("", i.GetProperties().elementAt(13).GetUnit());
    }

    @Test
    public void testSetProperty(){
        createPs();
        i.SetProperty(ps);

        assertEquals(ps, i.GetProperties());
    }

    @Test
    public void testGetModule(){
        assertEquals(0, i.getModule());
    }

}
