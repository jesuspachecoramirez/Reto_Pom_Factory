package co.com.sofka.selenium.stepdefinitions.login;

import co.com.sofka.selenium.model.login.LoginModel;
import co.com.sofka.selenium.page.login.LoginPageFunctions;
import co.com.sofka.selenium.stepdefinitions.setup.WebUI;
import co.com.sofka.selenium.utils.UrlPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;



public class LoginStepDefinition extends WebUI {
    private static final Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);
    private LoginPageFunctions loginPageFunctions;
    private LoginAssertionFunctions loginAssertionFunctions;
    private final LoginModel loginModel = new LoginModel();


    @Given("El cliente se encuentra en el inicio de la pagina")
    public void Elclienteseencuentraeneliniciodelapagina() {
        try {
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp(UrlPages.URL_INDEX.getValue());
        } catch (Exception exception) {
            closeDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @When("Ingresa su username: {string}, y su contrasena: {string} y presiona Login")
    public void ingresaSuUsernameYSuContrasenaYPresionaLogin(String username, String password) {
        try {
            loginModel.setUsername(username);
            loginModel.setPassword(password);
            loginPageFunctions = new LoginPageFunctions(webDriver, loginModel);
            loginPageFunctions.fillLoginInputs();
        } catch (Exception exception) {
            closeDriver();
            Assertions.fail("Fallo rellenando los campos", exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

   

    @Then("Al Cliente se le muestra el estado de cuenta")
    public void AlClienteselemuestraelestadodecuenta() {
        try {
            loginAssertionFunctions = new LoginAssertionFunctions(webDriver, loginModel);
            //Assertions.assertEquals(loginAssertionFunctions.successfulLoginMessage());
            Assertions.assertTrue(loginAssertionFunctions.successfulLoginTable(), "No aparece la tabla overview");
        } catch (Exception exception) {
            Assertions.fail("No se encontro elemento de login correcto esperado");
            LOGGER.error(exception.getMessage(), exception);
        } finally {
            closeDriver();
        }
    }

    @When("Cliente ingresa su username: {string}, y una contrasena incorrecta: {string} y presiona Login")
    public void clienteIngresaSuUsernameyUnaContrasenaIncorrectaYPresionaLogin(String username, String invalidPassword) {
        try {
            loginModel.setUsername(username);
            loginModel.setPassword(invalidPassword);
            loginPageFunctions = new LoginPageFunctions(webDriver, loginModel);
            loginPageFunctions.fillLoginInputs();
        } catch (Exception exception) {
            closeDriver();
            Assertions.fail("Fallo rellenando los campos con contrasena incorrecta", exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }


    @Then("El Cliente recibe un mensaje de error")
    public void elClienteRecibeUnMensajeDeError() {
        try {
            loginAssertionFunctions = new LoginAssertionFunctions(webDriver, loginModel);
            Assertions.assertEquals(
                    loginAssertionFunctions.invalidCredentialsMessage(),
                    loginAssertionFunctions.errorUserResult());
        } catch (Exception exception) {
            Assertions.fail("No se encontro elemento de error esperado", exception);
            LOGGER.error(exception.getMessage(), exception);
        } finally {
            closeDriver();
        }
    }


}
