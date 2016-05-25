package Tests.gridlab.ModulesItemsTests.TapeTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.Lights;
import gridlab.ModulesItems.Tape.Recorder;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class RecorderTest extends TestCase{
    private Recorder objectTest=new Recorder();
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
        objectTest=new Recorder();
        assertEquals("name", objectTest.GetProperties().firstElement().GetName());
        assertEquals("", objectTest.GetProperties().firstElement().GetValue());
        assertEquals("", objectTest.GetProperties().firstElement().GetUnit());

        assertEquals("parent", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("property", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("file", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("interval", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("limit", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("0", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("trigger", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("flags", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("DELTAMODE", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("flush", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("multifile", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("plotcommands", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("xdata", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("columns", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("output", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("header_units", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("DEFAULT", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("line_units", objectTest.GetProperties().lastElement().GetName());
        assertEquals("DEFAULT", objectTest.GetProperties().lastElement().GetValue());
        assertEquals("", objectTest.GetProperties().lastElement().GetUnit());
    }

    @Test
    public void testToGLM(){
        assertEquals("object recorder{ \n"+
                        "limit    0;\n"+
                        "flags    DELTAMODE;\n"+
                        "header_units    DEFAULT;\n"+
                        "line_units    DEFAULT;\n"+
                    "} \n",
                objectTest.ToGLM());

    }
    @Test
    public void testSetProperty(){
        createPs();
        objectTest.SetProperty(ps);
        assertEquals(ps,objectTest.GetProperties());
    }

    @Test
    public void testGetModule(){assertEquals(3,objectTest.getModule());}
}
