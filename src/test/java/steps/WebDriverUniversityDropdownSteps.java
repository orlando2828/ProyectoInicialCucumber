package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebDriverUniversityDropdownPage;

public class WebDriverUniversityDropdownSteps {

    WebDriverUniversityDropdownPage obj = new WebDriverUniversityDropdownPage();

    @Given("Estoy en la pagina de pruebas")
    public void estoyEnLaPaginaDeGoogle(){
        obj.navToWDUDropdownPage();

    }
    @When("Selecciono python en el dropdown")
    public void seleccionoPythonEnElDropdown(){
        obj.selectElementFromDropdown("Python");

    }

    @Then("Veo el resultado de la seleccion")
    public void veoElResultadoDeLaSeleccion(){


    }
}
