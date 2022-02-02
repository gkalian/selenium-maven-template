package utils;

import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * Property util class to load data from file
 * @author gkalian
 * @version 1.0
 */
public class PropertyLoader {

    public static String getPropertyByName(String propertyFile, String propertyValue) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/" + propertyFile));
        } catch (IOException e) {
            System.out.println("Read properties file error");
            e.printStackTrace();
        }

        String property = prop.getProperty(propertyValue);
        Assert.assertFalse(property.isEmpty());
        return property;
    }
}
