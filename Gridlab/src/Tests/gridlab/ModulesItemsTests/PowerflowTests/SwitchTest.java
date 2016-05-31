package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Switch;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class SwitchTest extends TestCase {

    private Switch objectTest = new Switch();

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

        assertEquals("phases", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("ABC", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("from", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("to", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("status", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("phase_A_state", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("phase_B_state", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("phase_C_state", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("operating_mode", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object switch{ \n"+"phases    ABC;
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
