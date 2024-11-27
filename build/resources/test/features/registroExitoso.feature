#language: es
#encoding: utf-8

Característica: Registro en tienda virtual demoblaze

  @RegistroExitoso
  Escenario: Registro exitoso
    Dado que el usuario se dirige al menu de registro
    Cuando ingresa los datos correctamente
    Entonces el registro debe permitirse exitosamente