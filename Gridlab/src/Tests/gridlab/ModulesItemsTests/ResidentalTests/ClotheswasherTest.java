package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Clotheswasher;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class ClotheswasherTest extends TestCase {
    private Clotheswasher objectTest=new Clotheswasher();
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
        objectTest=new Clotheswasher();
        assertEquals("motor_power", objectTest.GetProperties().firstElement().GetName());
        assertEquals("", objectTest.GetProperties().firstElement().GetValue());
        assertEquals("W", objectTest.GetProperties().firstElement().GetUnit());

        assertEquals("power_factor", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("circuit_split", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("heat_fraction", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("enduse_demand", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("enduse_queue", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("stall_voltage", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("start_voltage", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("stall_impedance", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("Ohm", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("trip_delay", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("reset_delay", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("state", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("STOPPED", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetUnit());
    }

    @Test
    public void testToGLM(){
        assertEquals("object clotheswasher{ \n"+
                        "state    STOPPED;\n"+
                        "} \n",
                objectTest.ToGLM());

    }
    @Test
    public void testSetProperty(){
        createPs();
        objectTest.SetProperty(ps);
        assertEquals(ps,objectTest.GetProperties());
    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}
}