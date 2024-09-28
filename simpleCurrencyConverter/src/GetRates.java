
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GetRates {
    public static float getSpecificRate(String curr) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("res/upd/latest.dat"));
            String response = reader.readLine();

            // Find the start of the currency code
            int start = response.indexOf("\"" + curr + "\":");

            if (start == -1) {
                // Define the options for the dialog
                String[] options = {"OK", "Open Settings"};

                // Show the option dialog
                int choice = JOptionPane.showOptionDialog(
                        null,
                        "Currency code not found\nCheck your currency code input or your API key.",
                        "Currency Code Error",
                        JOptionPane.OK_CANCEL_OPTION, // Use the constant for option type
                        JOptionPane.ERROR_MESSAGE, // Use the constant for message type
                        null, // No icon
                        options, // The options array
                        options[0] // Default selection
                );

                if (choice == 1) {
                    Settings ns = new Settings();
                    ns.setVisible(true);
                } else {
                    System.exit(-1);
                    return -1;
                }
            }

            start = start + curr.length() + 3;
            int end = response.indexOf(",", start);
            if (end == -1) {
                end = response.indexOf("}", start);
            }
            String rateString = response.substring(start, end);
            return Float.parseFloat(rateString.trim());

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "The currency data is not found. Please click the RELOAD icon to generate.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to parse the currency rate.");
        }
        return -99;
    }

    // Flags sourced from @lipis | [https://github.com/lipis/flag-icons/tree/main/flags]
    public static String getFlagDirectory(String curr) {
        return "res/flags/" + curr.substring(0, 2).toLowerCase() + ".png";
    }
}
