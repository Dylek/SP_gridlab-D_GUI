package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.TriplexNode;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class TriplexNodeTest extends TestCase {

    private TriplexNode objectTest = new TriplexNode();

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
        assertEquals("AS", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("bustype", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("busflags", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("reference_bus", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("voltage_1", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("voltage_2", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("voltage_N", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("0", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("voltage_1N", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("voltage_2N", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("maximum_voltage_error", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("mean_repair_time", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("current_1", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("current_2", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("current_N", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("current_12", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("power_1", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("power_2", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("power_12", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("shunt_1", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("shunt_2", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("shunt_12", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("mhos", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("impedace_1", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("Ohms", objectTest.GetProperties().elementAt(22).GetUnit());

        assertEquals("impedace_2", objectTest.GetProperties().elementAt(23).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetValue());
        assertEquals("Ohms", objectTest.GetProperties().elementAt(23).GetUnit());

        assertEquals("impedace_12", objectTest.GetProperties().elementAt(24).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetValue());
        assertEquals("Ohms", objectTest.GetProperties().elementAt(24).GetUnit());

        assertEquals("nominal_voltage", objectTest.GetProperties().elementAt(25).GetName());
        assertEquals("120", objectTest.GetProperties().elementAt(25).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(25).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object triplexnode{ \n"+"phases    AS;
//                "+;
//                "voltage_N    0;
//                "+;
//                "nominal_voltage    120;
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
