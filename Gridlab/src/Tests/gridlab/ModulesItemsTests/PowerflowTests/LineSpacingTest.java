package Tests.gridlab.ModulesItemsTests.PowerflowTests;

import gridlab.ModulesItems.Powerflow.LineSpacing;
import gridlab.ModulesItems.Property;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dell on 2016-05-31.
 */
public class LineSpacingTest extends TestCase{

    private LineSpacing ls = new LineSpacing();

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

        assertEquals("name", ls.GetProperties().elementAt(0).GetName());
        assertEquals("", ls.GetProperties().elementAt(0).GetValue());
        assertEquals("", ls.GetProperties().elementAt(0).GetUnit());

        assertEquals("distance_AB", ls.GetProperties().elementAt(1).GetName());
        assertEquals("", ls.GetProperties().elementAt(1).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(1).GetUnit());

        assertEquals("distance_BC", ls.GetProperties().elementAt(2).GetName());
        assertEquals("", ls.GetProperties().elementAt(2).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(2).GetUnit());

        assertEquals("distance_CA", ls.GetProperties().elementAt(3).GetName());
        assertEquals("", ls.GetProperties().elementAt(3).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(3).GetUnit());

        assertEquals("distance_AN", ls.GetProperties().elementAt(4).GetName());
        assertEquals("", ls.GetProperties().elementAt(4).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(4).GetUnit());

        assertEquals("distance_BN", ls.GetProperties().elementAt(5).GetName());
        assertEquals("", ls.GetProperties().elementAt(5).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(5).GetUnit());

        assertEquals("distance_CN", ls.GetProperties().elementAt(6).GetName());
        assertEquals("", ls.GetProperties().elementAt(6).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(6).GetUnit());

        assertEquals("distance_AE", ls.GetProperties().elementAt(7).GetName());
        assertEquals("", ls.GetProperties().elementAt(7).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(7).GetUnit());

        assertEquals("distance_BE", ls.GetProperties().elementAt(8).GetName());
        assertEquals("", ls.GetProperties().elementAt(8).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(8).GetUnit());

        assertEquals("distance_CE", ls.GetProperties().elementAt(9).GetName());
        assertEquals("", ls.GetProperties().elementAt(9).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(9).GetUnit());

        assertEquals("distance_NE", ls.GetProperties().elementAt(10).GetName());
        assertEquals("", ls.GetProperties().elementAt(10).GetValue());
        assertEquals("ft", ls.GetProperties().elementAt(10).GetUnit());



    }

    @Test
    public void testGetModule(){assertEquals(1,ls.getModule());}
//    @Test
//    public void testToGLM(){
//
//        assertEquals("object occupantload{ \n"+
//                        "} \n",
//                ls.ToGLM());
//
//
//    }
    @Test
    public void testSetProperty(){
        createPs();
        ls.SetProperty(ps);
        assertEquals(ps,ls.GetProperties());
    }
}
