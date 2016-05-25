package Tests.gridlab.ModulesItemsTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.House;

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
        House h=new House();//to modyfikujesz
        String className="house";//i to też modyfikujesz



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
                s+=p.GetName()+"    "+p.GetValue();
                // if(false)s+=" "+p.GetUnit();
                s+=";\n";
            }
        }
        s+="\n \"\\n}\",";
        s+="\nobjectTest.ToGLM());";
        System.out.println(s);
        System.out.println("\n\n}");
    }
}
