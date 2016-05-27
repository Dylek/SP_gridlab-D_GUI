package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Plugs;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-27.
 */
public class PlugsTest extends TestCase{

    private Plugs objectTest=new Plugs();

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

        assertEquals("circuit_split", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("demand", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("heat_fraction", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}
    @Test
    public void testToGLM(){

        assertEquals("object plugload{ \n"+
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
