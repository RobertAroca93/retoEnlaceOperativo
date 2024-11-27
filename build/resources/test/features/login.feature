#language: es
#encoding: utf-8

Característica: Login en la tienda viertual demoblaze

  @LoginExitoso
  Escenario: Registro Exitoso
    Dado que el usuario se ha registrado exitosamente
    Cuando se dirige al home
    Y realiza el inicio de sesion correctamente
    Entonces se debe mostrar el titulo Log out