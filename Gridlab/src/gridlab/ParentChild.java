package gridlab;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dylek on 2016-05-29.
 */
public class ParentChild{
    JLabel parentJLabel;
    //String parentName;
    JLabel childJLabel;
    // String childName;

    private ParentChild() {
    }
    public ParentChild(JLabel parent,JLabel child){
        parentJLabel=parent;
        childJLabel=child;

    }
    public boolean Conntain(JLabel jlabel){
        if(parentJLabel.equals(jlabel)|| childJLabel.equals(jlabel)){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "{"+parentJLabel.getLocation()+","+childJLabel.getLocation()+"}";
    }

    public int howToDrawLine(){
        Point point1=parentJLabel.getLocation();
        Point point2=childJLabel.getLocation();
        if (point1.x > point2.x)
        {
            return 1;
        }
        else if (point1.x < point2.x)
        {
            return 2;
        }
        else if (point1.y > point2.y)
        {
            return 3;
        }
        else if (point1.y < point2.y)
        {
            return 4;
        }
        else
            return 5;
    }

    public JLabel getChildJLabel() {
        return childJLabel;
    }

    public JLabel getParentJLabel() {
        return parentJLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParentChild that = (ParentChild) o;

        if (parentJLabel != null ? !parentJLabel.equals(that.parentJLabel) : that.parentJLabel != null) return false;
        return childJLabel != null ? childJLabel.equals(that.childJLabel) : that.childJLabel == null;
    }


}
