package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import com.sun.org.apache.regexp.internal.RE;
import gridlab.ModulesItems.Powerflow.RegulatorConfiguration;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class RegulatorConfigurationTest extends TestCase {

    private RegulatorConfiguration objectTest = new RegulatorConfiguration();

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

        assertEquals("connect_type", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("band_center", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("band_width", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("time_delay", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("dwell_time", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("raise_taps", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("16", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("lower_taps", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("16", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("current_transducer_ratio", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("power_transducer_ratio", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("compensator_r_setting_A", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("compensator_r_setting_B", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("compensator_r_setting_C", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("compensator_x_setting_A", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("compensator_x_setting_B", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(14).GetUnit());


        assertEquals("compensator_x_setting_C", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("CT_phase", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("lb", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("PT_phase", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("lb", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("regulation", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("gal", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("Control", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("C", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("Type", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("C", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("tap_pos_A", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("H", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("tap_pos_B", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("H", objectTest.GetProperties().elementAt(22).GetUnit());

        assertEquals("tap_pos_C", objectTest.GetProperties().elementAt(23).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetUnit());

    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object regulator{ \n"+"phases    ABC;
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
