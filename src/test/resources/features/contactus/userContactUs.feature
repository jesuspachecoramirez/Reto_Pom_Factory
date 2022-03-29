# new feature
# Tags: optional

Feature: Atencion al cliente para visitantes de la pagina web
  Como visitante de la pagina web de ParaBank
  quiero resolver unas duda mediante un trabajador del banco


  Scenario: Visitante de la pagina acceder a la opcion de Contact Us
    When Un usuario y posible cliente ingresa a la pagina y se encuentra en el home
    Then existe una opcion de Contact Us
    And Se le redirige a la pagina indicada

  Scenario: Usuario recibe mensaje de pronta atención
    Given El usuario ingresa en la pagina de Contact us
    When Llena la informacion correspondinete y realiza su consulta
    Then Recibe un mensaje del area correspondiente que lo contactara pronto