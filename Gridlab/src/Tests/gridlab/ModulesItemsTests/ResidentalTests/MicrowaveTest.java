package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Microwave;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-27.
 */
public class MicrowaveTest extends TestCase{
    private  Microwave objectTest=new Microwave();

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

        assertEquals("installed_power", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("standby_power", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("circuit_split", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("demand", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("heat_fraction", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("state", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("ON", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("runtime", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("state_time", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(7).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}
    @Test
    public void testToGLM(){

        assertEquals("object microwave{ \n"+"state    ON;\n"+

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
