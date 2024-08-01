#language:es
Característica: Ingreso y validacion de Logueo en ParaBank
  Como usuario
  quiero ingresar a ParaBank
  para registrarme y loguearme

  Antecedentes:
    Dado que ingresa a la web de ParaBank

  @HappyPath @ParaBank
  Esquema del escenario: Creacion de cuenta en ParaBank
    Cuando selecciona opcion de Register
    Entonces visualiza la pantalla de registro
    Cuando ingresa el first name "<name>"
    E ingresa el last name "espinoza"
    E ingresa el address "ica"
    E ingresa el city "ica"
    E ingresa el state "ica"
    E ingresa el zip code "11000"
    E ingresa el phone "999999999"
    E ingresa el ssn "123123"
    E ingresa el username "<username>"
    E ingresa el password "<pass>"
    E ingresa la confirmacino del password "<confirmpass>"
    Y selecciona la opcion Register
    Entonces valida que se visualiza el mensaje "Your account was created successfully. You are now logged in."
    Cuando selecciona la opcion de Logout
    Entonces valida que se visualiza la pagina del Login
    Cuando ingresa el dato del username "<username>"
    E ingresa el dato del password "<pass>"
    Y selecciona la opcion Login
    Entonces valida que se logueo correctamente
    Ejemplos:
    #Para nuevos usuarios considerar modificar el name y userName
      | name    | username    | pass            | confirmpass     |
      | Edmundo | Edmundo.123 | emersonespinoza | emersonespinoza |