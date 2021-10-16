package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //Atributos
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private WebDriver driver;

    //Construtor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Métodos
    public WebElement getUserNameField(){
        return this.driver.findElement(usernameField);
    }
    public WebElement getPasswordField(){
        return this.driver.findElement(passwordField);
    }
    public WebElement getLoginButton(){
        return this.driver.findElement(loginButton);
    }
}

