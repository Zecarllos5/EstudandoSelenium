package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //Atributos
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By logoImagem = By.xpath("//*[@id=\"root\"]/div/div[1]");
    private By botImagem = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");
    private By mensageerrorContainer = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
    private By credentialsLogin = By.id("login_credentials");
    private By passwordLogin = By.id("login_password");
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

    public WebElement getLogoImagem(){
        return this.driver.findElement(logoImagem);
    }
    public WebElement getBotImagem(){
        return this.driver.findElement(botImagem);
    }
    public WebElement getMensageerrorContainer(){
        return this.driver.findElement(mensageerrorContainer);
    }
    public WebElement getCredentialsLogin(){
        return this.driver.findElement(credentialsLogin);
    }
    public WebElement getPasswordLogin() {
        return this.driver.findElement(passwordLogin);
    }
}

