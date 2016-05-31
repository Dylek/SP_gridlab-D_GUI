package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Transformer;
import gridlab.ModulesItems.Powerflow.TransformerConfiguration;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class TransformerConfigurationTest extends TestCase {

    private TransformerConfiguration objectTest = new TransformerConfiguration();

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
        assertEquals("DELTA_DELTA", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("install_type", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("primary_voltage", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("4800", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("secondary_voltage", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("480", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("power_rating", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("500", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("powerA_rating", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("powerB_rating", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("powerC_rating", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("kVA", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("resistance", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("10", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("reactance", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("10", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("impedance", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("shunt_impedance", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("impedance1", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("impedance2", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("full_load_loss", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("OHM PU", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("core_coil_weight", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("pounds", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("tank_fittings_weight", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("pounds", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("oil_volume", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("gallons", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("rated_winding_hot_spot_rise", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("C", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("rated_top_oil_rise", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("C", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("rated_winding_time_constant", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("H", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("installed_insulation_life", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("H", objectTest.GetProperties().elementAt(22).GetUnit());

        assertEquals("coolant_type", objectTest.GetProperties().elementAt(23).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetUnit());

        assertEquals("cooling_type", objectTest.GetProperties().elementAt(24).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object transformerconfiguration{ \n"+"connect_type    DELTA_DELTA;
//                "+;
//                "primary_voltage    4800;
//                "+;
//                "secondary_voltage    480;
//                "+;
//                "power_rating    500;
//                "+;
//                "resistance    10;
//                "+;
//                "reactance    10;
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
