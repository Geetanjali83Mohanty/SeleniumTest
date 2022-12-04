package com.uniblox.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {
    public static Properties auto = new Properties();

    public static void readProperties() {
        auto = new Properties();
        try {
            FileInputStream objFile = new FileInputStream(System.getProperty("user.dir")+ "/resources/user.properties");
            auto.load(objFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw  new IllegalStateException("Unable to read file");
        }
    }

}
