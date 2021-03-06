package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Fuse;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-21.
 */
public class FuseTest extends TestCase{

    private Fuse objectTest = new Fuse();

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

        assertEquals("current_limit", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("mean_replacement_time", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("phase_A_status", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("GOOD", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("phase_B_status", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("GOOD", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("phase_C_status", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("BLOWN", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("repair_dist_type", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("NONE", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object fuse{ \n"+"phases    ABC;
//                "+;
//                "phase_A_status    GOOD;
//                "+;
//                "phase_B_status    GOOD;
//                "+;
//                "phase_C_status    BLOWN;
//                "+;
//                "repair_dist_type    NONE;
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
