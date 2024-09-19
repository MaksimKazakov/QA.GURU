package ru.maximkazakov.intro;

import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTestAtrast {
    private static String username ;
    private static String password ;


    public static String getPassword() {
        return password;
    }

    public static String getUsername() {
        return username;
    }

    @BeforeAll
    public static void setup() {
        Properties properties = new Properties();
        try (InputStream input = LoginPageTest.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
