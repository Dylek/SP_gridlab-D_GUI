package gridlab.ModulesItems;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public interface ToGLMParser {
    public String ToGLM();
    public int getModule();
    public Vector<Property> GetProperties();
    public ImageIcon getIcon();
}
