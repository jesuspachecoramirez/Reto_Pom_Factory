package co.com.sofka.selenium.stepdefinitions.contactus;

import co.com.sofka.selenium.model.contactus.ContactUsModel;
import co.com.sofka.selenium.page.contactus.ContactUsPageFunctions;
import co.com.sofka.selenium.stepdefinitions.setup.WebUI;
import co.com.sofka.selenium.utils.UrlPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;


public class ContactUsStepDefinition extends WebUI {
    private static final Logger LOGGER = Logger.getLogger(ContactUsStepDefinition.class);
    private final ContactUsModel contactUsModel = new ContactUsModel();
    private ContactUsPageFunctions contactUsPageFunctions;
    private ContactUsAssertionFunctions contactUsAssertionFunctions;

    @When("Un usuario y posible cliente ingresa a la pagina y se encuentra en el home")
    public void PosibleClienteSeEncuentraEnLaPagina() {
       try{
           setUpLog4j2();
           setUpWebDriver();
           generalSetUp(UrlPages.URL_INDEX.getValue());
       } catch (Exception exception){
           closeDriver();
           Assertions.fail("Fallo entrando al home de la pagina",exception);
           LOGGER.error(exception.getMessage(), exception);
       }
    }
    @Then("existe una opcion de Contact Us")
    public void existeUnaOpcionDeContactUs() {
        try{
            contactUsAssertionFunctions = new ContactUsAssertionFunctions(webDriver);
            Assertions.assertTrue(contactUsAssertionFunctions.isContactUs());
        } catch (Exception exception){
            closeDriver();
            Assertions.fail("No se encontro opcion Contact Us",exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    @Then("Se le redirige a la pagina indicada")
    public void SeLeRedirigeALaPaginaIndicada() {
        try{
            contactUsPageFunctions = new ContactUsPageFunctions(webDriver);
            contactUsAssertionFunctions = new ContactUsAssertionFunctions(webDriver);
            contactUsPageFunctions.pressContactUsOption();
            Assertions.assertEquals(
                    contactUsAssertionFunctions.contactUsCorrectPage(),
                    contactUsAssertionFunctions.contactUsPageValidation());
        } catch (Exception exception){
            Assertions.fail("La pagina de redireccion tiene errores",exception);
            LOGGER.error(exception.getMessage(), exception);
        } finally {
            closeDriver();
        }
    }

    @Given("El usuario ingresa en la pagina de Contact us")
    public void ElusuarioingresaenlapaginadeContactus() {
        try{
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp(UrlPages.URL_CONTACT_US.getValue());
        } catch (Exception exception){
            closeDriver();
            Assertions.fail("Fallo entrando a la pagina de Contact Us",exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    @When("Llena la informacion correspondinete y realiza su consulta")
    public void LlenalaInformacionyConsulta() {
        try{
            contactUsModel.setName("Jesus");
            contactUsModel.setEmail("hallowen8945@gmail.com");
            contactUsModel.setPhone("3002561360");
            contactUsModel.setMessage("Quiero saber que beneficios en temas de ahorro ofrece el banco.");
            contactUsPageFunctions = new ContactUsPageFunctions(webDriver,contactUsModel);
            contactUsPageFunctions.fillContactUsInputs();
        } catch (Exception exception){
            closeDriver();
            Assertions.fail("Fallo entrando a la pagina de Contact Us",exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    @Then("Recibe un mensaje del area correspondiente que lo contactara pronto")
    public void recibeUnMensajeDelAreaCorrespondienteQueLoContactaraPronto() {
        try{
            contactUsAssertionFunctions = new ContactUsAssertionFunctions(webDriver,contactUsModel);
            Assertions.assertEquals(
                    contactUsAssertionFunctions.messageSentSuccessful(),
                    contactUsAssertionFunctions.messageSentUserResult()
            );
        } catch (Exception exception){
            Assertions.fail("No se encontro elemento de mensaje de confirmacion",exception);
            LOGGER.error(exception.getMessage(), exception);
        } finally {
            closeDriver();
        }
    }
}
