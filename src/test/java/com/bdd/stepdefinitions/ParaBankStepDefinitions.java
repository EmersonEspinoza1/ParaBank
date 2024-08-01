package com.bdd.stepdefinitions;

import com.bdd.steps.ParaBankRegisterSteps;
import com.bdd.steps.ParaBankSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class ParaBankStepDefinitions {

    @Steps
    ParaBankSteps paraBankSteps;

    @Dado("^que ingresa a la web de ParaBank$")
    public void ingreso_web() {
        paraBankSteps.open();
    }

    @Cuando("^selecciona opcion de Register$")
    public void seleccionaOpcionDeRegister() {
        paraBankSteps.seleccionarRegister();
    }

    @Entonces("^valida que se visualiza la pagina del Login$")
    public void validaQueSeVisualizaLaPaginaDelLogin() {
        paraBankSteps.validarPaginaLogin();
    }

    @Cuando("^ingresa el dato del username \"([^\"]*)\"$")
    public void ingresaElDatoDelUsername(String username) {
        paraBankSteps.ingresaUsername(username);
    }

    @E("^ingresa el dato del password \"([^\"]*)\"$")
    public void ingresaElDatoDelPassword(String pass) {
        paraBankSteps.ingresaPassword(pass);
    }

    @Y("^selecciona la opcion Login$")
    public void seleccionaLaOpcionLogin() {
        paraBankSteps.seleccionarLogin();
    }
}
