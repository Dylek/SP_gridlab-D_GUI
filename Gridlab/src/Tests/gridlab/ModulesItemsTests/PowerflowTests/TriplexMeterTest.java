package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.TriplexMeter;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class TriplexMeterTest extends TestCase {

    private TriplexMeter objectTest = new TriplexMeter();

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

        assertEquals("nominal_voltage", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("120", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals(" V", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("bill_day", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("measured_real_energy", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("Wh", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("measured_reactive_energy", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("VAh", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("measured_power", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("measured_demand", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("measured_real_power", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("measured_reactive_power", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("indiv_measured_power_1", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("indiv_measured_power_2", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("indiv_measured_power_N", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("VA", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("measured_voltage_1", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("measured_voltage_2", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("measured_voltage_N", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("V", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("measured_current_1", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("measured_current_2", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("measured_current_N", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("price", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals(" $/kwh", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("monthly_fee", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals(" $", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("monthly_bill", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals(" $", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("previous_monthly_bill", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("$", objectTest.GetProperties().elementAt(22).GetUnit());

        assertEquals("monthly_energy", objectTest.GetProperties().elementAt(23).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetValue());
        assertEquals(" kwh", objectTest.GetProperties().elementAt(23).GetUnit());

        assertEquals("previous_monthly_energy", objectTest.GetProperties().elementAt(24).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetValue());
        assertEquals(" kwh", objectTest.GetProperties().elementAt(24).GetUnit());

        assertEquals("bill_mode", objectTest.GetProperties().elementAt(25).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(25).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(25).GetUnit());

        assertEquals("power_market", objectTest.GetProperties().elementAt(26).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(26).GetValue());
        assertEquals(" ", objectTest.GetProperties().elementAt(26).GetUnit());

        assertEquals("first_tier_price", objectTest.GetProperties().elementAt(27).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(27).GetValue());
        assertEquals(" $/kWh", objectTest.GetProperties().elementAt(27).GetUnit());

        assertEquals("second_tier_price", objectTest.GetProperties().elementAt(28).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(28).GetValue());
        assertEquals(" $/kWh", objectTest.GetProperties().elementAt(28).GetUnit());

        assertEquals("third_tier_price", objectTest.GetProperties().elementAt(29).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(29).GetValue());
        assertEquals(" $/kWh", objectTest.GetProperties().elementAt(29).GetUnit());

        assertEquals("first_tier_energy", objectTest.GetProperties().elementAt(30).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(30).GetValue());
        assertEquals(" kwh", objectTest.GetProperties().elementAt(30).GetUnit());

        assertEquals("second_tier_energy", objectTest.GetProperties().elementAt(31).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(31).GetValue());
        assertEquals(" kwh", objectTest.GetProperties().elementAt(31).GetUnit());

        assertEquals("third_tier_energy", objectTest.GetProperties().elementAt(32).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(32).GetValue());
        assertEquals(" kwh", objectTest.GetProperties().elementAt(32).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object triplexmeter{ \n"+"phases    AS;
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
