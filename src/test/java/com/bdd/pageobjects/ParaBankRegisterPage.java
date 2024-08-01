package com.bdd.pageobjects;

import com.bdd.util.BaseLogic;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParaBankRegisterPage extends BaseLogic {

    @FindBy(xpath = "//a[contains(@href,'register')]")
    WebElement optRegister;

    @FindBy(xpath = "//h1[@class='title']")
    WebElement pageRegistroTitle;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement inputLastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement inputAddress;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement inputCity;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement inputState;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement inputZip;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement inputPhone;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement inputSsn;

    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement inputPass;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement inputConfirmPass;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement btnRegistrar;

    @FindBy(xpath = "//div[@id='rightPanel']//p")
    WebElement lblRegistroExitoso;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    WebElement btnLogout;

    public void validarPantallaRegistro() {
        Assert.assertTrue(pageRegistroTitle.isDisplayed());
    }

    public void ingresarFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }

    public void ingresarLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void ingresarAddress(String address) {
        inputAddress.sendKeys(address);
    }

    public void ingresarCity(String city) {
        inputCity.sendKeys(city);
    }

    public void ingresarState(String state) {
        inputState.sendKeys(state);
    }

    public void ingresarZip(String zip) {
        inputZip.sendKeys(zip);
    }

    public void ingresarPhone(String phone) {
        inputPhone.sendKeys(phone);
    }

    public void ingresarSsn(String ssn) {
        inputSsn.sendKeys(ssn);
    }

    public void ingresarUserName(String username) {
        inputUsername.sendKeys(username);
    }

    public void ingresarPassword(String pass) {
        inputPass.sendKeys(pass);
    }

    public void ingresarConfirmPassword(String pass) {
        inputConfirmPass.sendKeys(pass);
    }

    public void seleccionarRegistrar() {
        btnRegistrar.click();
    }

    public void validaTextoRegistro(String text) {
        Assert.assertEquals(lblRegistroExitoso.getText().trim(), text.trim());
    }

    public void seleccionarLogout() {
        btnLogout.click();
    }

    public void validarLogueo() {
        Assert.assertTrue(btnLogout.isDisplayed());
    }
}
