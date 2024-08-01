package com.bdd.steps;

import com.bdd.pageobjects.ParaBankRegisterPage;
import net.thucydides.core.annotations.Step;

public class ParaBankRegisterSteps {

    ParaBankRegisterPage paraBankRegisterPage;

    @Step("validar Pantalla Registro")
    public void validarPantallaRegistro() {
        paraBankRegisterPage.validarPantallaRegistro();
    }

    @Step("ingresar FirstName")
    public void ingresarFirstName(String firstName) {
        paraBankRegisterPage.ingresarFirstName(firstName);
    }

    @Step("ingresar LastName")
    public void ingresarLastName(String LastName) {
        paraBankRegisterPage.ingresarLastName(LastName);
    }

    @Step("ingresar Address")
    public void ingresarAddress(String address) {
        paraBankRegisterPage.ingresarAddress(address);
    }

    @Step("ingresar City")
    public void ingresarCity(String City) {
        paraBankRegisterPage.ingresarCity(City);
    }

    @Step("ingresar State")
    public void ingresarState(String state) {
        paraBankRegisterPage.ingresarState(state);
    }

    @Step("ingresar Zip")
    public void ingresarZip(String zip) {
        paraBankRegisterPage.ingresarZip(zip);
    }

    @Step("ingresar Phone")
    public void ingresarPhone(String phone) {
        paraBankRegisterPage.ingresarPhone(phone);
    }

    @Step("ingresar Ssn")
    public void ingresarSsn(String ssn) {
        paraBankRegisterPage.ingresarSsn(ssn);
    }

    @Step("ingresar UserName")
    public void ingresarUserName(String username) {
        paraBankRegisterPage.ingresarUserName(username);
    }

    @Step("ingresar Password")
    public void ingresarPassword(String pass) {
        paraBankRegisterPage.ingresarPassword(pass);
    }

    @Step("ingresar Confirm Password")
    public void ingresarConfirmPassword(String pass) {
        paraBankRegisterPage.ingresarConfirmPassword(pass);
    }

    @Step("seleccionar Registrar")
    public void seleccionarRegistrar() {
        paraBankRegisterPage.seleccionarRegistrar();
    }

    @Step("valida texto al Registrar")
    public void validaTextoRegistro(String text) {
        paraBankRegisterPage.validaTextoRegistro(text);
    }

    @Step("Seleccionar Logout")
    public void seleccionLogout(){
        paraBankRegisterPage.seleccionarLogout();
    }

    @Step("Validar Login")
    public void validarLogueo() {
        paraBankRegisterPage.validarLogueo();
    }
}

