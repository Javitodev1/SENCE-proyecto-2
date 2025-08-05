package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;
    JavascriptExecutor js;

    By newuser = By.id("newUser");
    By firstname = By.id("firstname");
    By lastname = By.id("lastname");
    By username = By.id("userName");
    By password = By.id("password");
    By register = By.id("register");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    private void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void createNewUser() {
        WebElement newUserButton = driver.findElement(newuser);
        scrollIntoView(newUserButton);
        newUserButton.click();
    }

    public void setFirstname(String name) {
        driver.findElement(firstname).sendKeys(name);
    }

    public void setLastname(String last) {
        driver.findElement(lastname).sendKeys(last);
    }

    public void setUsername(String user) {
        driver.findElement(firstname).sendKeys(user);
    }

    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void register() {
        WebElement registerButton = driver.findElement(register);
        scrollIntoView(registerButton);
        registerButton.click();
    }

    public void saveScreenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshots/registro_error.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
