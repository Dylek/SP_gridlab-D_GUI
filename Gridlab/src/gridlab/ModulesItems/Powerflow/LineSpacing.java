package gridlab.ModulesItems.Powerflow;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Pavlo on 16.04.2016.
 */
public class LineSpacing implements ToGLMParser {
    private Vector<Property> properties;
    public LineSpacing(){
        properties=new Vector<Property>();
        properties.add(new Property("name", "", ""));
        properties.add(new Property("distance_AB", "", "ft"));
        properties.add(new Property("distance_BC", "", "ft"));
        properties.add(new Property("distance_CA", "", "ft"));
        properties.add(new Property("distance_AN", "", "ft"));
        properties.add(new Property("distance_BN", "", "ft"));
        properties.add(new Property("distance_CN", "", "ft"));
        properties.add(new Property("distance_AE", "", "ft"));
        properties.add(new Property("distance_BE", "", "ft"));
        properties.add(new Property("distance_CE", "", "ft"));
        properties.add(new Property("distance_NE", "", "ft"));
   }

    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object line_spacing { \n";
        for (Property p: properties){
            if(p.GetName()!=null)s+=p.GetName()+"    "+p.GetValue()+"    "+p.GetUnit()+";\n";
        }
        s+="} \n";
        return s;
    }
}
