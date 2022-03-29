# new feature
# Tags: optional

Feature: Inicio de sesion para clientes
  Como cliente del banco que ya poseo una cuenta en la pagina
  y quiero iniciar sesion para poder verificar mi cuenta bancaria

  Background: Usuario dentro de la pagina web que posee una cuenta
    Given El cliente se encuentra en el inicio de la pagina

  Scenario: Cliente ingresa correctamente
    When Ingresa su username: "Gianse", y su contrasena: "Nezuko" y presiona Login
    Then Al Cliente se le muestra el estado de cuenta

  Scenario: Cliente ingresa no ingresa correctamente su contraseña
    When Cliente ingresa su username: "Gianse", y una contrasena incorrecta: "Nesuko" y presiona Login
    Then El Cliente recibe un mensaje de error