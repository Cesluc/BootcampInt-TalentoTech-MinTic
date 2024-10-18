cantidad_inventario, cantidad_comprada, cantidad_vendida, capacidad_maxima, limite_ventas_por_dia, umbral_descuento = map(int, input().split())

if cantidad_comprada > umbral_descuento:
    cantidad_comprada *= 0.9

if cantidad_comprada < 0.2 * capacidad_maxima:
    cantidad_comprada = 0

limite_ventas = limite_ventas_por_dia / 100 * cantidad_inventario
if cantidad_vendida > limite_ventas:
    cantidad_vendida = limite_ventas

if cantidad_inventario < 0.3 * capacidad_maxima:
    maximo_vender = 0.5 * cantidad_inventario
    if cantidad_vendida > maximo_vender:
        cantidad_vendida = maximo_vender

cantidad_inventario += cantidad_comprada
cantidad_inventario -= cantidad_vendida

print(round(cantidad_inventario, 1))
