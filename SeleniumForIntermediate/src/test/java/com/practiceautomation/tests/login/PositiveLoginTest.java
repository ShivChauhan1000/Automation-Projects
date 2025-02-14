package com.practiceautomation.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest {
    @Test
    public void positiveLoginTest() {

        //Open page
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        //Type username student into Username field
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("student");

        //Type password Password123 into Password field
        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("Password123");

        //Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl),"URL not matched!");
        //System.out.println("Expected URL - " + expectedUrl);
        //System.out.println("Actual URL - " + actualUrl);

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement successfulMessage = driver.findElement(By.xpath("//div/p[@class='has-text-align-center']"));
        String expectedMessage = "Congratulations student. You successfully logged in!";
        String actualMessage = successfulMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        //System.out.println("Actual Message - " + actualMessage);

        //Verify button Log out is displayed on the new page
        WebElement logOutButton = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logOutButton.isDisplayed(),"LogOut button is not displayed!");
        driver.quit();
    }
}
