package gridlab.ModulesItems;

/**
 * Created by Dylek on 2016-04-16.
 */
public class Property {

    private String name;
    private Object value;
    private String unit;
    public Property(){};
    public Property(String name, Object value,String unit) {
        this.name=name;
        this.value=value;
        this.unit=unit;
    }

    @Override
    public Property clone() {
        return new Property(name,value,unit);
    }

}
