# new feature
# Tags: optional

Feature: Registro para nuevos usuarios
  Como cliente del banco ParaBank
  quiero registrarme en la pagina web
  para realizar el manejo de mi cuenta desde alli

  Background: Usuario dentro de la pagina de registro
    Given Cliente se encuentra en la pagina de registro

  Scenario: Registro exitoso de nuevo usuario
    When Cliente ingresa la informacion en todos los campos obligatorios y presiona register
    Then Se le muestra al usuario un mensaje con su username y se confirma su registro

  Scenario: Cliente no ingresa su confirmacion de contraseña correctamente
    When Cliente ingresa su informacion en los campos obligatorios se equivoca en la confirmacion de contrasena
    Then Cliente recibe el mensaje de error Passwords did not match