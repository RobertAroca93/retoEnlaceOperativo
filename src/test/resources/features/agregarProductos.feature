#language: es
#encoding: utf-8

Característica: Busqueda, agregado de productos y validar la suma total de los mismos

  @AgregadoExitoso
  Escenario: Buscar y agregar productos a comprar
    Dado que el usuario se encuentra logueado en la tienda
    Cuando selecciona y agrega los productos a comprar
    Entonces el total del carrito debe coincidir


