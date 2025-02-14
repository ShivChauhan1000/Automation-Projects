package com.practiceautomation.tests.login;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomationTests {

@Test
    public void youTubetest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        //implicit Wait for locator
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement searchBox = driver.findElement(By.cssSelector("#center > yt-searchbox > div.ytSearchboxComponentInputBox > form > input"));
        searchBox.sendKeys("automation by rahul shetty");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='center']/yt-searchbox/button"));

        searchButton.click();

        WebElement automationVideosLink = driver.findElement(By.linkText("Rahul Shetty Academy"));
        automationVideosLink.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "automation by rahul shetty - YouTube";
        Assert.assertEquals(actualTitle, expectedTitle,"Title not matched!");
        System.out.println("Title name = " + actualTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement fullscreenButton = driver.findElement(By.xpath("//*[@id=\'c4-player\']/div[32]/div[2]/div[2]/button[6]"));
        fullscreenButton.click();

         driver.close();
    }
@Test
    public void youTubeExplore(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/@RahulShettyAcademy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement moreButton = driver.findElement(By.xpath("//*[@id=\'page-header\']/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-description-preview-view-model/truncated-text/button/span/span"));
        moreButton.click();

        WebElement shareButton = driver.findElement(By.xpath("//*[@id=\'share-channel\']/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        shareButton.click();

        WebElement shareChanel = driver.findElement(By.xpath("//*[@id=\'items\']/ytd-menu-service-item-renderer[1]/tp-yt-paper-item/yt-formatted-string"));
        shareChanel.click();

        WebElement copyButton = driver.findElement(By.xpath("//*[@id=\'copy-button\']/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        copyButton.click();

        driver.close();
    }

}
