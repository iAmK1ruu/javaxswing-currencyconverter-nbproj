
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;

public class CallCurrencyAPI {

    public static String getResult() {
        String apiKey = getAPI();
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";
        try {
            URL url_fetched = new URL(url);
            HttpURLConnection obj = (HttpsURLConnection) url_fetched.openConnection();
            obj.connect();
            System.out.println(obj.getResponseCode());
            if (obj.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(obj.getInputStream()));
                String line;
                StringBuffer response = new StringBuffer();

                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();
                return extractRates(response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "The currency data cannot be updated.\nPlease check your API key.", "Error Updating Data", 0);
        }
         JOptionPane.showMessageDialog(null, "The currency data cannot be updated.\nPlease check your API key.", "Error Updating Data", 0);
        return "NO_RESPONSE";
    }

    public static String extractRates(String text) {
        // Find the start of the "conversion_rates" section
        int start = text.indexOf("\"conversion_rates\"") + 19; // +19 accounts for "conversion_rates": {

        // Find the end of the "conversion_rates" object
        int end = text.indexOf("}", start) + 1; // Find the closing brace for the conversion rates object

        // Return the substring containing the conversion rates
        JOptionPane.showMessageDialog(null, "The currency data was updated successfully.\nPlease restart your application.", "Currency Data Updated", 1);
        return text.substring(start, end);
    }

    public static String getAPI() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("res/api/key.file"));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "NO_API";
    }

    public static void updateWriter() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("res/upd/latest.dat"));
        writer.write(getResult());
        writer.close();
        BufferedWriter datewriter = new BufferedWriter(new FileWriter("res/upd/date.dat"));
        datewriter.write((new Date()).toString());
        datewriter.close();
    }
    public static boolean readForNoResponse() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader (new FileReader("res/upd/latest.dat"));
            if (reader.readLine().equals("NO_RESPONSE"))
                return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CallCurrencyAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CallCurrencyAPI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(CallCurrencyAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}
