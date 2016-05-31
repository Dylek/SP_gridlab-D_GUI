package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Node;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class NodeTest extends TestCase {

    private Node objectTest = new Node();

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

        assertEquals("name", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("phases", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("ABC", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("nominal_voltage", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("7200.0", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("voltage_A", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("7200.0+0d", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("voltage_B", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("7200.0-120.0d", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("voltage_C", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("7200.0+120.0d", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("voltage_AB", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("voltage_BC", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("voltage_CA", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("current_A", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("current_B", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("current_C", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("power_A", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("power_B", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("power_C", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("shunt_A", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("shunt_B", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("shunt_C", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("bustype", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("PQ", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("maximum_voltage_error", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("busflags", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("reference_bus", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("mean_repair_time", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(22).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object node{ \n"+"phases    ABC;
//                "+;
//                "nominal_voltage    7200.0;
//                "+;
//                "voltage_A    7200.0+0d;
//                "+;
//                "voltage_B    7200.0-120.0d;
//                "+;
//                "voltage_C    7200.0+120.0d;
//                "+;
//                "bustype    PQ;
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
