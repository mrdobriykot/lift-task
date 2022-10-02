package com.jru.reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class PropertiesReader {
    protected static final String CONFIG_READER = "config.properties";
    protected final Properties properties = new Properties();

    protected PropertiesReader() {
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(CONFIG_READER);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
