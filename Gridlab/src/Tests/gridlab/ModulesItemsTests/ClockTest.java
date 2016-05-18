package Tests.gridlab.ModulesItemsTests;

import gridlab.ModulesItems.Clock;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-18.
 */
public class ClockTest extends TestCase {
    private Clock c;
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
    public void testConstructor() {
        c = new Clock();

        assertEquals("timezone", c.GetProperties().firstElement().GetName());
        assertEquals("PST+8PDT", c.GetProperties().firstElement().GetValue());
        assertEquals("", c.GetProperties().firstElement().GetUnit());

        assertEquals("timestamp", c.GetProperties().elementAt(1).GetName());
        assertEquals("", c.GetProperties().elementAt(1).GetValue());
        assertEquals("", c.GetProperties().elementAt(1).GetUnit());

        assertEquals("starttime", c.GetProperties().elementAt(2).GetName());
        assertEquals("'2016-04-01 00:00:00'", c.GetProperties().elementAt(2).GetValue());
        assertEquals("", c.GetProperties().elementAt(2).GetUnit());

        assertEquals("stoptime", c.GetProperties().lastElement().GetName());
        assertEquals("'2016-04-02 00:00:00'", c.GetProperties().lastElement().GetValue());
        assertEquals("", c.GetProperties().lastElement().GetUnit());
    }

    @Test
    public void testSetProperty(){
        createPs();
        c.SetProperty(ps);

        assertEquals(ps, c.GetProperties());
    }

    @Test
    public void testToGLM(){
        assertEquals("clock{ \ntimezone    ;\n" +
                "timestamp    ;\n" +
                "starttime    '2016-04-01 00:00:00';\n" +
                "stoptime    '2016-04-02 00:00:00';\n" +
                "} \n", c.ToGLM());
    }

    @Test
    public void testIfGetModuleEquals999(){
        assertEquals(999, c.getModule());
    }


}
