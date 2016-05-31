package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Capacitor;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-20.
 */
public class CapacitorTest extends TestCase{

    private Capacitor objectTest = new Capacitor();

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

        assertEquals("pt_phase", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("phases_connected", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("switchA", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("OPEN", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("switchB", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("OPEN", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("switchC", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("CLOSED", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("control", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("nominal_voltage", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("7200", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("voltage_set_high", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("voltage_set_low", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("VAr_set_high", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("VAr", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("VAr_set_low", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("VAr", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("capacitor_A", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("0.5", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("MVAr", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("capacitor_B", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("0.5", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("MVAr", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("capacitor_C", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("0.5", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("MVAr", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("cap_nominal_voltage", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("time_delay", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("dwell_time", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("lockout_time", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("remote_sense", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("remote_sense_B", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("control_level", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("INDIVIDUAL", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object capacitor{ \n"+"phases    ABC;
//                "+;
//                "switchA    OPEN;
//                "+;
//                "switchB    OPEN;
//                "+;
//                "switchC    CLOSED;
//                "+;
//                "nominal_voltage    7200;
//                "+;
//                "capacitor_A    0.5;
//                "+;
//                "capacitor_B    0.5;
//                "+;
//                "capacitor_C    0.5;
//                "+;
//                "control_level    INDIVIDUAL;
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
