package Tests.gridlab.ModulesItemsTests.GeneratorTests;

import gridlab.ModulesItems.Generator.Solar;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-18.
 */
public class SolarTest extends TestCase {
    
    Solar s = new Solar();

    private Vector<Property> ps = new Vector<Property>();
    private Property p1 = new Property();
    private Property p2 = new Property();
    private Property p3 = new Property();

    public void createPs(){
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
    }
    
    @Test
    public void testConstructor() {
        assertEquals("name", s.GetProperties().elementAt(0).GetName());
        assertEquals("parent", s.GetProperties().elementAt(1).GetName());
        assertEquals("generator_mode", s.GetProperties().elementAt(2).GetName());
        assertEquals("SUPPLY_DRIVEN", s.GetProperties().elementAt(2).GetValue());
        assertEquals("generator_status", s.GetProperties().elementAt(3).GetName());
        assertEquals("panel_type", s.GetProperties().elementAt(4).GetName());
        assertEquals("power_type", s.GetProperties().elementAt(5).GetName());
        assertEquals("INSTALLATION_TYPE", s.GetProperties().elementAt(6).GetName());
        assertEquals("SOLAR_TILT_MODEL", s.GetProperties().elementAt(7).GetName());
        assertEquals("SOLAR_POWER_MODEL", s.GetProperties().elementAt(8).GetName());
        assertEquals("a_coeff", s.GetProperties().elementAt(9).GetName());
        assertEquals("b_coeff", s.GetProperties().elementAt(10).GetName());
        assertEquals("dT_coeff", s.GetProperties().elementAt(11).GetName());
        assertEquals("T_coeff", s.GetProperties().elementAt(12).GetName());
        assertEquals("NOCT", s.GetProperties().elementAt(13).GetName());
        assertEquals("Tmodule", s.GetProperties().elementAt(14).GetName());
        assertEquals("Tambient", s.GetProperties().elementAt(15).GetName());
        assertEquals("wind_speed", s.GetProperties().elementAt(16).GetName());
        assertEquals("ambient_temperature", s.GetProperties().elementAt(17).GetName());
        assertEquals("Insolation", s.GetProperties().elementAt(18).GetName());
        assertEquals("Rinternal", s.GetProperties().elementAt(19).GetName());
        assertEquals("Rated_Insolation", s.GetProperties().elementAt(20).GetName());
        assertEquals("Pmax_temp_coeff", s.GetProperties().elementAt(21).GetName());
        assertEquals("Voc_temp_coeff", s.GetProperties().elementAt(22).GetName());
        assertEquals("V_Max", s.GetProperties().elementAt(23).GetName());
        assertEquals("Voc_Max", s.GetProperties().elementAt(24).GetName());
        assertEquals("Voc", s.GetProperties().elementAt(25).GetName());
        assertEquals("efficiency", s.GetProperties().elementAt(26).GetName());
        assertEquals("area", s.GetProperties().elementAt(27).GetName());
        assertEquals("soiling", s.GetProperties().elementAt(28).GetName());
        assertEquals("derating", s.GetProperties().elementAt(29).GetName());
        assertEquals("Rated kVA", s.GetProperties().elementAt(30).GetName());
        assertEquals("P_Out", s.GetProperties().elementAt(31).GetName());
        assertEquals("V_Out", s.GetProperties().elementAt(32).GetName());
        assertEquals("I_Out", s.GetProperties().elementAt(33).GetName());
        assertEquals("VA_Out", s.GetProperties().elementAt(34).GetName());
        assertEquals("weather", s.GetProperties().elementAt(35).GetName());
        assertEquals("shading_factor", s.GetProperties().elementAt(36).GetName());
        assertEquals("tilt_angle", s.GetProperties().elementAt(37).GetName());
        assertEquals("orientation_azimuth", s.GetProperties().elementAt(38).GetName());
        assertEquals("latitude_angle_fix", s.GetProperties().elementAt(39).GetName());
        assertEquals("orientation", s.GetProperties().elementAt(40).GetName());
        assertEquals("phases", s.GetProperties().elementAt(41).GetName());
    }

    @Test
    public void testSetProperty(){
        createPs();
        s.SetProperty(ps);

        assertEquals(ps, s.GetProperties());
    }

    @Test
    public void testGetModule(){
        assertEquals(0, s.getModule());
    }
}
