package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Meter;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class MeterTest extends TestCase {
    private Meter objectTest = new Meter();

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
        assertEquals("4800", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("bill_day", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("price", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("$/kWh", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("monthly_fee", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("$", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("monthly_bill", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("$", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("previous_monthly_bill", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("$", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("monthly_energy", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("kWh", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("previous_monthly_energy", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("kWh", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("bill_mode", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("NONE", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("power_market", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("first_tier_price", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("$/kWh", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("second_tier_price", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("$/kWh", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("third_tier_price", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("$/kWh", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("first_tier_energy", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("kWh", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("second_tier_energy", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("kWh", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("third_tier_energy ", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("kWh", objectTest.GetProperties().elementAt(17).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,objectTest.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object meter{ \n"+"phases    ABC;
//                "+;
//                "nominal_voltage    4800;
//                "+;
//                "bill_mode    NONE;
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
