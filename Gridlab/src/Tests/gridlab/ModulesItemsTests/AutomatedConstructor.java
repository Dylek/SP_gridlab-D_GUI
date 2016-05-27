package Tests.gridlab.ModulesItemsTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.*;

/**
 * Created by Dylek on 2016-05-25.
 */
public class AutomatedConstructor {
    public static void main(String[] args) {
        /*
        zamiast House h , dawajcie co chcecie
        dzięki temu wygeneruje wam kod do TestCOnstructor()
        haha ale przechytrzyłem system :v
         */
        Occupants h=new Occupants();//to modyfikujesz
        String className="occupantload";//i to też modyfikujesz


        System.out.println("   private  objectTest=new ();\n" +
                "\n" +
                "    private Vector<Property> ps= new Vector<>();\n" +
                "    private Property p1;\n" +
                "    private Property p2;\n" +
                "    private Property p3;\n" +
                "\n" +
                "    public void createPs(){\n" +
                "        ps.add(p1);\n" +
                "        ps.add(p2);\n" +
                "        ps.add(p3);\n" +
                "    }");
        System.out.println("\n@Test\n public void testConstructor(){\n");
        for(int i=0;i<h.GetProperties().size();i++){
            System.out.println(" assertEquals(\""+h.GetProperties().elementAt(i).GetName()+"\", objectTest.GetProperties().elementAt("+i+").GetName());\n" +
                    "        assertEquals(\""+h.GetProperties().elementAt(i).GetValue()+"\", objectTest.GetProperties().elementAt("+i+").GetValue());\n" +
                    "        assertEquals(\""+h.GetProperties().elementAt(i).GetUnit()+"\", objectTest.GetProperties().elementAt("+i+").GetUnit());\n");
        }



        System.out.println("\n\n}");


        System.out.println("\n@Test\n" +
                "    public void testGetModule(){assertEquals("+h.getModule()+",objectTest.getModule());}");


        String s;
        System.out.println("@Test\npublic void testToGLM(){\n");
        s="assertEquals(\"object "+className+"{ \\n\"+";
        for (Property p: h.GetProperties()){
            if(!p.GetValue().isEmpty())
            {
                s+="\""+p.GetName()+"    "+p.GetValue()+";\n\"+";
                // if(false)s+=" "+p.GetUnit();
                s+=";\n";
            }
        }
        s+="\n \"} \\n\",";
        s+="\nobjectTest.ToGLM());";
        System.out.println(s);
        System.out.println("\n\n}");


        System.out.println(" @Test\n" +
                "    public void testSetProperty(){\n" +
                "        createPs();\n" +
                "        objectTest.SetProperty(ps);\n" +
                "        assertEquals(ps,objectTest.GetProperties());\n" +
                "    }");
    }
}
