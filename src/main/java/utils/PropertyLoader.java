package utils;

import org.apache.commons.lang.StringUtils;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
/**
 * Property util class to load data from file
 * @author gkalian
 * @version 1.0
 */
public class PropertyLoader {
    /**Static initialisation block*/
    private static Properties properties = new Properties();
    private static String path = "src/main/resources/conf.properties";

    static {
        try (InputStream inputStream = new FileInputStream(path)) {
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**Method to get string property value with property name*/
    public static String getProperty(String propertyName) {
        if (!StringUtils.isBlank(propertyName)) {
            return properties.getProperty(propertyName);
        } else {
            return StringUtils.EMPTY;
        }
    }

    /**Methods to get exact property value*/
    public static int getImplicitlyWait () {
        return Integer.parseInt(getProperty("IMPLICIT_WAIT_TIMEOUT"));
    }

    public static int getExplicitWait () {
        return Integer.parseInt(getProperty("EXPLICIT_WAIT_TIMEOUT"));
    }

    public static int getSleep () {
        return Integer.parseInt(getProperty("SLEEP_TIMEOUT"));
    }

    public static int getPageLoadTimeout () {
        return Integer.parseInt(getProperty("PAGE_LOAD_TIMEOUT"));
    }
}
