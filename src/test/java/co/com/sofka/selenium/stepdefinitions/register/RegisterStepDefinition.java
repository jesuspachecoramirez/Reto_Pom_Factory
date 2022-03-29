package co.com.sofka.selenium.stepdefinitions.register;

import co.com.sofka.selenium.model.register.RegisterModel;
import co.com.sofka.selenium.page.register.RegisterPageFunctions;
import co.com.sofka.selenium.stepdefinitions.setup.WebUI;
import co.com.sofka.selenium.utils.UrlPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class RegisterStepDefinition extends WebUI {

    private static final Logger LOGGER = Logger.getLogger(RegisterStepDefinition.class);
    private RegisterPageFunctions registerPageFunctions;
    private RegisterAssertionFunctions registerAssertionFunctions;
    private final RegisterModel registerModel = new RegisterModel();

    @Given("Cliente se encuentra en la pagina de registro")
    public void Clienteseencuentraenlapaginaderegistro() {
        try{
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp(UrlPages.URL_REGISTER.getValue());
        } catch (Exception exception){
            closeDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }
    }
    @When("Cliente ingresa la informacion en todos los campos obligatorios y presiona register")
    public void Clienteingresalainformacionentodosloscamposobligatoriosypresionaregister() {
        try {
            registerModel.setFirstName("Gian");
            registerModel.setLastName("Ropero");
            registerModel.setAddress("Calle 45 Sur");
            registerModel.setCity("Envigado");
            registerModel.setState("Antioquia");
            registerModel.setZipCode("001257");
            registerModel.setSocialSecurityNumber("147852");
            registerModel.setUsername("Gianse");
            registerModel.setPassword("Nezuko");
            registerModel.setConfirmPassword("Nezuko");

            registerPageFunctions = new RegisterPageFunctions(webDriver, registerModel);
            registerPageFunctions.fillAllRequiredInputs();
        } catch (Exception exception){
            closeDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }
    }
    @Then("Se le muestra al usuario un mensaje con su username y se confirma su registro")
    public void Selemuestraalusuariounmensajeconsuusernameyseconfirmasuregistro() {
        try{
            registerAssertionFunctions = new RegisterAssertionFunctions(webDriver,registerModel);
            Assertions.assertEquals(
                    registerAssertionFunctions.userRegistrationResult(),
                    registerAssertionFunctions.successfulUserCreated());
        } catch (Exception exception){
            LOGGER.error(exception.getMessage(),exception);
        } finally {
            closeDriver();
        }
    }

    @When("Cliente ingresa su informacion en los campos obligatorios se equivoca en la confirmacion de contrasena")
    public void Clienteingresasuinformacionenloscamposobligatoriosseequivocaenlaconfirmaciondecontrasena() {
        try {
            registerModel.setFirstName("Zullybeth");
            registerModel.setLastName("Ortiz");
            registerModel.setAddress("Carrera 22");
            registerModel.setCity("Santa Marta");
            registerModel.setState("Magdalena");
            registerModel.setZipCode("105447");
            registerModel.setSocialSecurityNumber("369852");
            registerModel.setUsername("Gily");
            registerModel.setPassword("Gily+86");
            registerModel.setConfirmPassword("Gily86");
            registerPageFunctions = new RegisterPageFunctions(webDriver, registerModel);
            registerPageFunctions.fillAllRequiredInputs();
        } catch (Exception exception){
            closeDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }
    }
    @Then("Cliente recibe el mensaje de error Passwords did not match")
    public void Clienterecibeelmensajedeerror() {
        try{
            registerAssertionFunctions = new RegisterAssertionFunctions(webDriver,registerModel);
            Assertions.assertEquals(
                  registerAssertionFunctions.userRegistrationResult(),
                  registerAssertionFunctions.passwordConfirmationError());
        } catch (Exception exception){
            Assertions.fail("No se encontro elemento de mensaje de error",exception);
            LOGGER.error(exception.getMessage(),exception);
        } finally {
            closeDriver();
        }
    }
}
