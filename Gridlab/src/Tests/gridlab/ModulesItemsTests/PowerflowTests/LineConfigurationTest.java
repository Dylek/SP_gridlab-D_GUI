package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.Fuse;
import gridlab.ModulesItems.Powerflow.LineConfiguration;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-21.
 */
public class LineConfigurationTest extends TestCase{

    private LineConfiguration f = new LineConfiguration();
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
        //assertEquals("name", f.GetProperties().elementAt().GetUnit());c.GetProperties().elementAt(0).GetName());
        assertEquals("name", f.GetProperties().elementAt(0).GetName());
        assertEquals("", f.GetProperties().elementAt(0).GetValue());
        assertEquals("", f.GetProperties().elementAt(0).GetUnit());
        assertEquals("conductor_A", f.GetProperties().elementAt(1).GetName());
        assertEquals("", f.GetProperties().elementAt(1).GetValue());
        assertEquals("", f.GetProperties().elementAt(1).GetUnit());
        assertEquals("conductor_B", f.GetProperties().elementAt(2).GetName());
        assertEquals("", f.GetProperties().elementAt(2).GetValue());
        assertEquals("", f.GetProperties().elementAt(2).GetUnit());
        assertEquals("conductor_C", f.GetProperties().elementAt(3).GetName());
        assertEquals("", f.GetProperties().elementAt(3).GetValue());
        assertEquals("", f.GetProperties().elementAt(3).GetUnit());
        assertEquals("conductor_N", f.GetProperties().elementAt(4).GetName());
        assertEquals("", f.GetProperties().elementAt(4).GetValue());
        assertEquals("", f.GetProperties().elementAt(4).GetUnit());
        assertEquals("spacing", f.GetProperties().elementAt(5).GetName());
        assertEquals("", f.GetProperties().elementAt(5).GetValue());
        assertEquals("", f.GetProperties().elementAt(5).GetUnit());
        assertEquals("z11", f.GetProperties().elementAt(6).GetName());
        assertEquals("", f.GetProperties().elementAt(6).GetValue());
        assertEquals("", f.GetProperties().elementAt(6).GetUnit());
        assertEquals("z12", f.GetProperties().elementAt(7).GetName());
        assertEquals("", f.GetProperties().elementAt(7).GetValue());
        assertEquals("", f.GetProperties().elementAt(7).GetUnit());
        assertEquals("z13", f.GetProperties().elementAt(8).GetName());
        assertEquals("", f.GetProperties().elementAt(8).GetValue());
        assertEquals("", f.GetProperties().elementAt(8).GetUnit());
        assertEquals("z21", f.GetProperties().elementAt(9).GetName());
        assertEquals("", f.GetProperties().elementAt(9).GetValue());
        assertEquals("", f.GetProperties().elementAt(9).GetUnit());
        assertEquals("z22", f.GetProperties().elementAt(10).GetName());
        assertEquals("", f.GetProperties().elementAt(10).GetValue());
        assertEquals("", f.GetProperties().elementAt(10).GetUnit());
        assertEquals("z23", f.GetProperties().elementAt(11).GetName());
        assertEquals("", f.GetProperties().elementAt(11).GetValue());
        assertEquals("", f.GetProperties().elementAt(11).GetUnit());
        assertEquals("z31", f.GetProperties().elementAt(12).GetName());
        assertEquals("", f.GetProperties().elementAt(12).GetValue());
        assertEquals("", f.GetProperties().elementAt(12).GetUnit());
        assertEquals("z32", f.GetProperties().elementAt(13).GetName());
        assertEquals("", f.GetProperties().elementAt(13).GetValue());
        assertEquals("", f.GetProperties().elementAt(13).GetUnit());
        assertEquals("z33", f.GetProperties().elementAt(14).GetName());
        assertEquals("", f.GetProperties().elementAt(14).GetValue());
        assertEquals("", f.GetProperties().elementAt(14).GetUnit());
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
