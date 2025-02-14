import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //findElementsLocators(driver);
        findExpectionPageElements(driver);

        driver.quit();
    }

    private static void findExpectionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        //Find WebElements for the linkText and partialPage link
        WebElement LinkTextPage = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement partialPageLinkText = driver.findElement(By.partialLinkText(" with Java for beginners "));

        //Find WebElements for the input Fields using tag, classname, Xpath, Css
        WebElement inputByTag = driver.findElement(By.tagName("input"));
        WebElement inputByClassName = driver.findElement(By.className("input-field"));
        WebElement inputByXpath = driver.findElement(By.xpath("//input[@class='input-field']"));
        WebElement inputByCss = driver.findElement(By.cssSelector("input.input-field"));

        //Create a list of WebElements for all buttons using tag
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        //Identify both buttons, Using ID, name, Css, Xpath for each
        WebElement editButtonById = driver.findElement(By.id("edit_btn"));
        WebElement editButtonByName = driver.findElement(By.name("Edit"));
        WebElement editButtonByCss = driver.findElement(By.cssSelector("button#edit_btn"));
        WebElement editButtonByXpath = driver.findElement(By.xpath("//button[@id='edit_btn']"));

        WebElement addButtonById = driver.findElement(By.id("add_btn"));
        WebElement addButtonByName = driver.findElement(By.name("Add"));
        WebElement addButtonByCss = driver.findElement(By.cssSelector("button#add_btn"));
        WebElement addButtonByXpath = driver.findElement(By.xpath("//button[@id='add_btn']"));
    }

    private static void findElementsLocators(WebDriver driver){
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.clear();
        usernameInputField.sendKeys("anyUsername");

       // WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//*[@id=\"username\"]"));
       // WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("#username"));

        WebElement PasswordInputField = driver.findElement(By.name("password"));
        usernameInputField.clear();
        PasswordInputField.sendKeys("anyPassword");
        //WebElement PasswordInputFieldXpath = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        //WebElement PasswordInputFieldCss = driver.findElement(By.cssSelector("#password"));

        WebElement submitButton = driver.findElement(By.className("btn"));
        submitButton.isDisplayed();
        submitButton.click();
        //WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        //WebElement submitButtonCss = driver.findElement(By.cssSelector("#submit"));
    }

    private static String chromeTest(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

    private static String firefoxTest(String url) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}
