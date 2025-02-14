package com.practiceAutomation.Test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NegativeLoginTests {
    @Test(groups = {"mixed","negative","All"})
    public void negativeUsernameTest() {
        // Open page
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Type username incorrectUser into Username field
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("incorrectUser");

        //Type password Password123 into Password field
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("Password123");

        //Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Verify error message is displayed
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'error\']")));
        Assert.assertTrue(errorMessage.isDisplayed(),"Error message is not displayed!");

        //Verify error message text is Your username is invalid!
        String actualMessage = errorMessage.getText();
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(actualMessage, expectedMessage);
        driver.quit();
    }
    @Test(groups = {"negative","All"})
    public void negativePasswordTest() {
        // Open page
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Type username student into Username field
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("student");

        //Type password incorrectPassword into Password field
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("incorrectPassword");

        //Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Verify error message is displayed
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'error\']")));
        Assert.assertTrue(errorMessage.isDisplayed(),"Error message is not displayed!");

        //Verify error message text is Your password is invalid!
        String actualMessage = errorMessage.getText();
        String expectedMessage = "Your password is invalid!";
        Assert.assertEquals(actualMessage, expectedMessage);
        driver.quit();
    }
}
