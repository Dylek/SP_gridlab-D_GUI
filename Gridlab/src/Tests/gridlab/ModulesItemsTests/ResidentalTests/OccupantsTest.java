package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Occupants;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-27.
 */
public class OccupantsTest extends TestCase {
    private Occupants objectTest=new Occupants();

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

        assertEquals("number_of_occupants", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("occupancy_fraction", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("heatgain_per_person", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("internal_gains", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("kW", objectTest.GetProperties().elementAt(3).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}
    @Test
    public void testToGLM(){

        assertEquals("object occupantload{ \n"+
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
