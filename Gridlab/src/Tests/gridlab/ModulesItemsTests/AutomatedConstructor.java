package Tests.gridlab.ModulesItemsTests;

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
        House h=new House();
        for(int i=0;i<h.GetProperties().size();i++){
            System.out.println(" assertEquals(\""+h.GetProperties().elementAt(i).GetName()+"\", objectTest.GetProperties().elementAt("+i+").GetName());\n" +
                    "        assertEquals(\""+h.GetProperties().elementAt(i).GetValue()+"\", objectTest.GetProperties().elementAt("+i+").GetValue());\n" +
                    "        assertEquals(\""+h.GetProperties().elementAt(i).GetUnit()+"\", objectTest.GetProperties().elementAt("+i+").GetUnit());\n");
        }
    }
}
