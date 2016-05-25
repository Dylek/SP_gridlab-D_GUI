package Tests.gridlab.ModulesItemsTests.TapeTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Tape.Player;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class PlayerTest extends TestCase{
    private Player objectTest=new Player();
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
        objectTest=new Player();
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

        assertEquals("loop", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("0", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetUnit());


        assertEquals("flags", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("DELTAMODE", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetUnit());

    }

    @Test
    public void testToGLM(){
        assertEquals("object player{ \n"+
                        "loop    0;\n"+
                        "flags    DELTAMODE;\n"+
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
