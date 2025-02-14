package com.automation.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UniversalTest {

    @Test
    public void swagLabsTesting(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String standerdUser = "standard_user";
        String password = "secret_sauce";

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys(standerdUser);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Test Cases Start

        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        WebElement aboutbutton = driver.findElement(By.id("about_sidebar_link"));
        aboutbutton.click();

        driver.navigate().back();

        WebElement againMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        againMenuButton.click();

        WebElement logOutbutton = driver.findElement(By.id("logout_sidebar_link"));
        logOutbutton.click();

        driver.quit();





    }
}
