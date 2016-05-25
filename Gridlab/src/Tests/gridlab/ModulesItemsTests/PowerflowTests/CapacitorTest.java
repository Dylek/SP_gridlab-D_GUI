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
    
    private Capacitor c = new Capacitor();
    private Vector<Property> ps;
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
        assertEquals("name", c.GetProperties().elementAt(0).GetName());
        assertEquals("", c.GetProperties().elementAt(0).GetValue());
        assertEquals("", c.GetProperties().elementAt(0).GetUnit());
        
        assertEquals("phases", c.GetProperties().elementAt(1).GetName());
        assertEquals("ABC", c.GetProperties().elementAt(1).GetValue());
        assertEquals("", c.GetProperties().elementAt(1).GetUnit());
        
        assertEquals("pt_phase", c.GetProperties().elementAt(2).GetName());
        assertEquals("", c.GetProperties().elementAt(2).GetValue());
        assertEquals("", c.GetProperties().elementAt(2).GetUnit());
        
        assertEquals("phases_connected", c.GetProperties().elementAt(3).GetName());
        assertEquals("", c.GetProperties().elementAt(3).GetValue());
        assertEquals("", c.GetProperties().elementAt(3).GetUnit());
        
        assertEquals("switchA", c.GetProperties().elementAt(4).GetName());
        assertEquals("OPEN", c.GetProperties().elementAt(4).GetValue());
        assertEquals("", c.GetProperties().elementAt(4).GetUnit());
        
        assertEquals("switchB", c.GetProperties().elementAt(5).GetName());
        assertEquals("OPEN", c.GetProperties().elementAt(5).GetValue());
        assertEquals("", c.GetProperties().elementAt(5).GetUnit());
                
        assertEquals("switchC", c.GetProperties().elementAt(6).GetName());
        assertEquals("CLOSED", c.GetProperties().elementAt(6).GetValue());
        assertEquals("", c.GetProperties().elementAt(6).GetUnit());
                
        assertEquals("control", c.GetProperties().elementAt(7).GetName());
        assertEquals("", c.GetProperties().elementAt(7).GetValue());
        assertEquals("", c.GetProperties().elementAt(7).GetUnit());
        
        assertEquals("nominal_voltage", c.GetProperties().elementAt(8).GetName());
        assertEquals("7200", c.GetProperties().elementAt(8).GetValue());
        assertEquals("V", c.GetProperties().elementAt(8).GetUnit());
                
        assertEquals("voltage_set_high", c.GetProperties().elementAt(9).GetName());
        assertEquals("", c.GetProperties().elementAt(9).GetValue());
        assertEquals("V", c.GetProperties().elementAt(9).GetUnit());
                
        assertEquals("voltage_set_low", c.GetProperties().elementAt(10).GetName());
        assertEquals("", c.GetProperties().elementAt(10).GetValue());
        assertEquals("V", c.GetProperties().elementAt(10).GetUnit());
                
        assertEquals("VAr_set_high", c.GetProperties().elementAt(11).GetName());
        assertEquals("", c.GetProperties().elementAt(11).GetValue());
        assertEquals("VAr", c.GetProperties().elementAt(11).GetUnit());
                
        assertEquals("VAr_set_low", c.GetProperties().elementAt(12).GetName());
        assertEquals("", c.GetProperties().elementAt(12).GetValue());
        assertEquals("VAr", c.GetProperties().elementAt(12).GetUnit());
                
        assertEquals("capacitor_A", c.GetProperties().elementAt(13).GetName());
        assertEquals("0.5", c.GetProperties().elementAt(13).GetValue());
        assertEquals("MVAr", c.GetProperties().elementAt(13).GetUnit());
                
        assertEquals("capacitor_B", c.GetProperties().elementAt(14).GetName());
        assertEquals("0.5", c.GetProperties().elementAt(14).GetValue());
        assertEquals("MVAr", c.GetProperties().elementAt(14).GetUnit());
                
        assertEquals("capacitor_C", c.GetProperties().elementAt(15).GetName());
        assertEquals("0.5", c.GetProperties().elementAt(15).GetValue());
        assertEquals("MVAr", c.GetProperties().elementAt(15).GetUnit());
                
        assertEquals("cap_nominal_voltage", c.GetProperties().elementAt(16).GetName());
        assertEquals("", c.GetProperties().elementAt(16).GetValue());
        assertEquals("V", c.GetProperties().elementAt(16).GetUnit());
                
        assertEquals("time_delay", c.GetProperties().elementAt(17).GetName());
        assertEquals("", c.GetProperties().elementAt(17).GetValue());
        assertEquals("s", c.GetProperties().elementAt(17).GetUnit());
                
        assertEquals("dwell_time", c.GetProperties().elementAt(18).GetName());
        assertEquals("", c.GetProperties().elementAt(18).GetValue());
        assertEquals("s", c.GetProperties().elementAt(18).GetUnit());
        
        assertEquals("lockout_time", c.GetProperties().elementAt(19).GetName());
        assertEquals("", c.GetProperties().elementAt(19).GetValue());
        assertEquals("s", c.GetProperties().elementAt(19).GetUnit());
        
        assertEquals("remote_sense", c.GetProperties().elementAt(20).GetName());
        assertEquals("", c.GetProperties().elementAt(20).GetValue());
        assertEquals("", c.GetProperties().elementAt(20).GetUnit());
        
        assertEquals("remote_sense_B", c.GetProperties().elementAt(21).GetName());
        assertEquals("", c.GetProperties().elementAt(21).GetValue());
        assertEquals("", c.GetProperties().elementAt(21).GetUnit());
        
        assertEquals("control_level", c.GetProperties().elementAt(22).GetName());
        assertEquals("INDIVIDUAL", c.GetProperties().elementAt(22).GetValue());
        assertEquals("", c.GetProperties().elementAt(22).GetUnit());
    }

    @Test
    public void testSetProperty(){
        createPs();
        c.SetProperty(ps);

        assertEquals(ps, c.GetProperties());
    }

    @Test
    public void testGetModule(){
        assertEquals(0, c.getModule());
    }
}
