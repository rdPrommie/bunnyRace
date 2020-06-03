package bunnyrace;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class BunnyRaceGetPropertyValues {

    private InputStream inputStream;
    private Map<String, String> result = new LinkedHashMap<String, String>();

    public Map<String, String> getPropValues() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "resources\\config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

           result.put("width", prop.getProperty("width"));
           result.put("height",prop.getProperty("height"));
            
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }

}
