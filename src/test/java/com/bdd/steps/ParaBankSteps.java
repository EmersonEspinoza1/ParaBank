package com.bdd.steps;

import com.bdd.pageobjects.ParaBankPage;
import net.thucydides.core.annotations.Step;

public class ParaBankSteps {

    ParaBankPage paraBankPage;

    public void open() {
        paraBankPage.open();
    }

    @Step("Seleccionar Register")
    public void seleccionarRegister() {
        paraBankPage.seleccionarRegister();
    }

    @Step("Validar pagina login")
    public void validarPaginaLogin() {
        paraBankPage.validarPaginaLogin();
    }

    @Step("Ingresa username")
    public void ingresaUsername(String username) {
        paraBankPage.ingresaUsername(username);
    }

    @Step("Ingresa Password")
    public void ingresaPassword(String pass) {
        paraBankPage.ingresaPassword(pass);
    }

    @Step("Selecciona Login")
    public void seleccionarLogin() {
        paraBankPage.seleccionarLogin();
    }
}






