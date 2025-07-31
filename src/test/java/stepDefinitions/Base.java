package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.customerPage;
import pageObjects.searchCustomerPage;

public class Base {

    WebDriver driver;
    LoginPage lpage;
    customerPage custPage;
    searchCustomerPage searchPage;


    public static String randomString() {
        return RandomStringUtils.randomAlphanumeric(10);
    }



}