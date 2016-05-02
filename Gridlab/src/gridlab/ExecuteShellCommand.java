package gridlab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Dylek on 2016-04-19.
 */
public class ExecuteShellCommand {

     public String executeCommand(String command) {

        StringBuffer output = new StringBuffer();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            String lineErrors = "";
            // read any errors from the attempted command
            while ((lineErrors = stdError.readLine()) != null) {
                output.append(lineErrors+"\n");
            }
            String line="";
            // read the output from the command
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }
}
