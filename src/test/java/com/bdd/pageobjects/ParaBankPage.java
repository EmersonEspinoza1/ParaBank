package com.bdd.pageobjects;

import com.bdd.util.BaseLogic;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParaBankPage extends BaseLogic {

    @FindBy(xpath = "//a[contains(@href,'register')]")
    WebElement optRegister;

    @FindBy(xpath = "//input[@name='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement btnLogin;

    public void seleccionarRegister() {
        optRegister.click();
    }

    public void validarPaginaLogin() {
        Assert.assertTrue(optRegister.isDisplayed());
    }

    public void ingresaUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void ingresaPassword(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void seleccionarLogin() {
        btnLogin.click();
    }
}
