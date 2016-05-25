package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Lights;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Properties;
import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class LightsTest extends TestCase {
    private Lights lights=new Lights();
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
        lights=new Lights();
        assertEquals("type", lights.GetProperties().firstElement().GetName());
        assertEquals("HID", lights.GetProperties().firstElement().GetValue());
        assertEquals("", lights.GetProperties().firstElement().GetUnit());

        assertEquals("placement", lights.GetProperties().elementAt(1).GetName());
        assertEquals("OUTDOOR", lights.GetProperties().elementAt(1).GetValue());
        assertEquals("", lights.GetProperties().elementAt(1).GetUnit());

        assertEquals("installed_power", lights.GetProperties().elementAt(2).GetName());
        assertEquals("", lights.GetProperties().elementAt(2).GetValue());
        assertEquals("kW", lights.GetProperties().elementAt(2).GetUnit());

        assertEquals("circuit_split", lights.GetProperties().elementAt(3).GetName());
        assertEquals("", lights.GetProperties().elementAt(3).GetValue());
        assertEquals("", lights.GetProperties().elementAt(3).GetUnit());

        assertEquals("power_density", lights.GetProperties().elementAt(4).GetName());
        assertEquals("", lights.GetProperties().elementAt(4).GetValue());
        assertEquals("W/sf", lights.GetProperties().elementAt(4).GetUnit());

        assertEquals("curtailment", lights.GetProperties().elementAt(5).GetName());
        assertEquals("", lights.GetProperties().elementAt(5).GetValue());
        assertEquals("", lights.GetProperties().elementAt(5).GetUnit());

        assertEquals("actual_power", lights.GetProperties().elementAt(6).GetName());
        assertEquals("", lights.GetProperties().elementAt(6).GetValue());
        assertEquals("kVA", lights.GetProperties().elementAt(6).GetUnit());

        assertEquals("demand", lights.GetProperties().lastElement().GetName());
        assertEquals("", lights.GetProperties().lastElement().GetValue());
        assertEquals("", lights.GetProperties().lastElement().GetUnit());
    }

    @Test
    public void testToGLM(){
        assertEquals("object lights{ \ntype    HID; \n"+
        "placement    OUTDOOR;\n} \n",
        lights.ToGLM());

    }
    @Test
    public void testSetProperty(){
        createPs();
        lights.SetProperty(ps);
        assertEquals(ps,lights.GetProperties());
    }

    @Test
    public void testGetModule(){assertEquals(2,lights.getModule());}

}
