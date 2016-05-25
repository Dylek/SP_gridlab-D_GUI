package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Dishwasher;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class DishwasherTest extends TestCase{
    private Dishwasher objectTest=new Dishwasher();
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
        objectTest=new Dishwasher();
        assertEquals("energy_baseline", objectTest.GetProperties().firstElement().GetName());
        assertEquals("0.9", objectTest.GetProperties().firstElement().GetValue());
        assertEquals("kWh", objectTest.GetProperties().firstElement().GetUnit());

        assertEquals("control_power", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("10", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("motor_power", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("250", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("daily_dishwasher_demand", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("1", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("queue", objectTest.GetProperties().lastElement().GetName());
        assertEquals("0.8", objectTest.GetProperties().lastElement().GetValue());
        assertEquals("", objectTest.GetProperties().lastElement().GetUnit());
    }

    @Test
    public void testToGLM(){
        assertEquals("object dishwasher{ \n"+
                        "energy_baseline    0.9;\n"+
                        "control_power    10;\n"+
                        "motor_power    250;\n"+
                        "daily_dishwasher_demand    1;\n"+
                        "queue    0.8;\n"+
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
