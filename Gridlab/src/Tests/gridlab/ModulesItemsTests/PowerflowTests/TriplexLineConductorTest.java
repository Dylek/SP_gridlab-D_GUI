package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.TriplexLineConductor;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class TriplexLineConductorTest extends TestCase {

    private TriplexLineConductor objectTest = new TriplexLineConductor();

    private Vector<Property> ps = new Vector<>();
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

        assertEquals("name", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("geometric_mean_radius", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("resistance", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("0.97", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("Ohm/mile", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("diameter", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("in", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("rating.summer.continuous", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals(" A", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("rating.summer.emergency", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("rating.winter.continuous", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals(" A", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("rating.winter.emergency", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(7).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object triplexlineconductor{ \n"+"resistance    0.97;
//                "+;
//
//                "} \n",
//                objectTest.ToGLM());
//
//
//    }
    @Test
    public void testSetProperty(){
        createPs();
        objectTest.SetProperty(ps);
        assertEquals(ps,objectTest.GetProperties());
    }
}
