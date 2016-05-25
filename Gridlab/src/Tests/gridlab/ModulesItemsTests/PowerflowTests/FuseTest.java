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
    
    private Fuse f = new Fuse();
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
        //assertEquals("name", f.GetProperties().elementAt().Get());c.GetProperties().elementAt(0).GetName());
        assertEquals("name", f.GetProperties().elementAt(0).GetName());
        assertEquals("", f.GetProperties().elementAt(0).GetValue());
        assertEquals("", f.GetProperties().elementAt(0).GetUnit());
        assertEquals("phases", f.GetProperties().elementAt(1).GetName());
        assertEquals("ABC", f.GetProperties().elementAt(1).GetValue());
        assertEquals("", f.GetProperties().elementAt(1).GetUnit());
        assertEquals("from", f.GetProperties().elementAt(2).GetName());
        assertEquals("", f.GetProperties().elementAt(2).GetValue());
        assertEquals("", f.GetProperties().elementAt(2).GetUnit());
        assertEquals("to", f.GetProperties().elementAt(3).GetName());
        assertEquals("", f.GetProperties().elementAt(3).GetValue());
        assertEquals("", f.GetProperties().elementAt(3).GetUnit());
        assertEquals("current_limit", f.GetProperties().elementAt(4).GetName());
        assertEquals("", f.GetProperties().elementAt(4).GetValue());
        assertEquals("A", f.GetProperties().elementAt(4).GetUnit());
        assertEquals("mean_replacement_time", f.GetProperties().elementAt(5).GetName());
        assertEquals("", f.GetProperties().elementAt(5).GetValue());
        assertEquals("s", f.GetProperties().elementAt(5).GetUnit());
        assertEquals("phase_A_status", f.GetProperties().elementAt(6).GetName());
        assertEquals("GOOD", f.GetProperties().elementAt(6).GetValue());
        assertEquals("", f.GetProperties().elementAt(6).GetUnit());
        assertEquals("phase_B_status", f.GetProperties().elementAt(7).GetName());
        assertEquals("GOOD", f.GetProperties().elementAt(7).GetValue());
        assertEquals("", f.GetProperties().elementAt(7).GetUnit());
        assertEquals("phase_C_status", f.GetProperties().elementAt(8).GetName());
        assertEquals("BLOWN", f.GetProperties().elementAt(8).GetValue());
        assertEquals("", f.GetProperties().elementAt(8).GetUnit());
        assertEquals("repair_dist_type", f.GetProperties().elementAt(9).GetName());
        assertEquals("NONE", f.GetProperties().elementAt(9).GetValue());
        assertEquals("", f.GetProperties().elementAt(9).GetUnit());
    }

    @Test
    public void testSetProperty(){
        createPs();
        f.SetProperty(ps);

        assertEquals(ps, f.GetProperties());
    }

    @Test
    public void testGetModule(){
        assertEquals(0, f.getModule());
    }
}
