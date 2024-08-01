package com.bdd.stepdefinitions;

import com.bdd.steps.ParaBankRegisterSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class ParaBankRegistroStepDefinitions {

    @Steps
    ParaBankRegisterSteps paraBankRegisterSteps;

    @Entonces("^visualiza la pantalla de registro$")
    public void visualizaLaPantallaDeRegistro() {
        paraBankRegisterSteps.validarPantallaRegistro();
    }

    @Cuando("^ingresa el first name \"([^\"]*)\"$")
    public void ingresaElFirstName(String firstName) {
        paraBankRegisterSteps.ingresarFirstName(firstName);
    }

    @E("^ingresa el last name \"([^\"]*)\"$")
    public void ingresaElLastName(String lastName) {
        paraBankRegisterSteps.ingresarLastName(lastName);
    }

    @E("^ingresa el address \"([^\"]*)\"$")
    public void ingresaElAddress(String address) {
        paraBankRegisterSteps.ingresarAddress(address);
    }

    @E("^ingresa el city \"([^\"]*)\"$")
    public void ingresaElCity(String city) {
        paraBankRegisterSteps.ingresarCity(city);
    }

    @E("^ingresa el state \"([^\"]*)\"$")
    public void ingresaElState(String state) {
        paraBankRegisterSteps.ingresarState(state);
    }

    @E("^ingresa el zip code \"([^\"]*)\"$")
    public void ingresaElZipCode(String zip) {
        paraBankRegisterSteps.ingresarZip(zip);
    }

    @E("^ingresa el phone \"([^\"]*)\"$")
    public void ingresaElPhone(String phone) {
        paraBankRegisterSteps.ingresarPhone(phone);
    }

    @E("ingresa el ssn \"([^\"]*)\"$")
    public void ingresaElSsn(String ssn) {
        paraBankRegisterSteps.ingresarSsn(ssn);
    }

    @E("^ingresa el username \"([^\"]*)\"$")
    public void ingresaElUsername(String username) {
        paraBankRegisterSteps.ingresarUserName(username);
    }

    @E("^ingresa el password \"([^\"]*)\"$")
    public void ingresaElPassword(String pass) {
        paraBankRegisterSteps.ingresarPassword(pass);
    }

    @E("^ingresa la confirmacino del password \"([^\"]*)\"$")
    public void ingresaLaConfirmacinoDelPassword(String pass) {
        paraBankRegisterSteps.ingresarConfirmPassword(pass);
    }

    @Y("^selecciona la opcion Register$")
    public void seleccionaLaOpcionRegister() {
        paraBankRegisterSteps.seleccionarRegistrar();
    }

    @Entonces("^valida que se visualiza el mensaje \"([^\"]*)\"$")
    public void validaQueSeVisualizaElMensaje(String text) {
        paraBankRegisterSteps.validaTextoRegistro(text);
    }

    @Cuando("^selecciona la opcion de Logout$")
    public void seleccionarLogout() {
        paraBankRegisterSteps.seleccionLogout();
    }

    @Entonces("valida que se logueo correctamente")
    public void validaQueSeLogueoCorrectamente() {
        paraBankRegisterSteps.validarLogueo();
    }
}
