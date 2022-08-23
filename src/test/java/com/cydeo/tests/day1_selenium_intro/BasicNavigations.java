package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //create instance of the selenium webdriver
        WebDriver driver = new ChromeDriver(); // opening empty browser

        //this will maximize the browser size
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com"); // go to tesla.com

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("current URL is : " + currentURL);

        Thread.sleep(3000); // this is for execution for 3 seconds

        driver.navigate().back(); // use selenium to navigate back

        Thread.sleep(3000); // this is for execution for 3 seconds

        driver.navigate().forward(); //use selenium to navigate forward

        Thread.sleep(3000); // this is for execution for 3 seconds

        driver.navigate().refresh(); // use selenium to navigate refresh

        Thread.sleep(3000); // this is for execution for 3 seconds

        driver.navigate().to("https://www.google.com");

        System.out.println("driver.getTitle() = "  +driver.getTitle());
        // get the title of the page

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("current URL is : " + currentURL);






    }
}
