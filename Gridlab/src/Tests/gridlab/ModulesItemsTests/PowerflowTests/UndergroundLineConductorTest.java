package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.UnderGroundLineConductor;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class UndergroundLineConductorTest extends TestCase {

    private UnderGroundLineConductor objectTest = new UnderGroundLineConductor();

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

        assertEquals("outer_diameter", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("in", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("conductor_gmr", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("conductor_diameter", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("in", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("conductor_resistance", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("Ohm/mile", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("neutral_gmr", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("neutral_diameter", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals(" in", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("neutral_resistance", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("Ohm/mile", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("neutral_strands", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("insultation_relative_permitivitty", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("shield_gmr", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("feet", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("shield_resistance", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("Ohm/mile", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("rating.summer.continuous", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals(" A", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("rating.summer.emergency", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("rating.winter.continuous", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals(" A", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("rating.winter.emergency", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(15).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object undergroundlineconductor{ \n"+
//                        "} \n",
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
