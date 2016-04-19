package gridlab.ModulesItems;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Property {

    private String name;
    private String value;
    private String unit;
    public Property(){
    };
    public Property(String name, String value,String unit) {
        this.name=name;
        this.value=value;
        this.unit=unit;
    }

    public void SetName(String name){
        this.name=name;
    }
    public void SetValue(String value){
        this.value=value;
    }
    public void SetUnit(String unit){
        this.unit=unit;
    }
    public String GetName(){
        return name;
    }
    public String GetValue(){
        return value;
    }
    public String GetUnit(){
        return unit;
    }
    @Override
    public Property clone() {
        return new Property(name,value,unit);
    }

}
