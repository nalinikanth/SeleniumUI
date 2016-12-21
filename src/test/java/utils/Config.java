package utils;

import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static Properties getProperties() throws Exception {
        Properties properties = new Properties();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = contextClassLoader.getResourceAsStream("config.properties");
        properties.load(resourceAsStream);
        resourceAsStream.close();
        return properties;
    }

}

