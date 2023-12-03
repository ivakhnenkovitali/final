package by.IT.model.entities.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    public static Properties getProperties(String filePath) {
        Properties props = new Properties();
        try (FileReader fr = new FileReader(Thread.currentThread()
                .getContextClassLoader().getResource(filePath).getPath())) {
            props.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}
