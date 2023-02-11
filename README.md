# CONVERSOR DE MONEDAS
## Etapa 01. Descripcion del Problema 
Se requiere un programa en Java para convertir una cantidad de dinero en otros tipos de monedas (al menos a cinco tipos de monedas distintas)

## Etapa 02. Definicion de la Solucion
 ~~~
-Entrada
 float cantidad
 String moneda
 double conversion
 
-Proceso
 Solicitar moneda a convertir
 Solicitar cantidad a convertir
 
 Si la moneda no se introduce correctamente, se cancela la operacion 
 Si la cantidad es mayor o igual que cero, entonces se convertira a la moneda deseada 
 Si la cantidad es menor que cero entonces se cancela la operacion
 
 
-Salida
+--------+-------------+-------------------+--------------+
|CANTIDAD|MONEDA ORIGEN|CANTIDAD CONVERTIDA|MONEDA DESTINO|
+--------+-------------+-------------------+--------------+
|   1    |     DLLS    |         1.34      |     USD      |
+--------+-------------+-------------------+--------------+
+--------+-------------+-------------------+--------------+
|   1    |     DLLS    |        189.11     |     AFN      |
+--------+-------------+-------------------+--------------+
+--------+-------------+-------------------+--------------+
|   1    |     DLLS    |         34.54     |     BOB      |
+--------+-------------+-------------------+--------------+
+--------+-------------+-------------------+--------------+
|   1    |     DLLS    |         1.33      |     SGD      |
+--------+-------------+-------------------+--------------+
+--------+-------------+-------------------+--------------+
|   1    |     DLLS    |         0.93      |     CHF      |
+--------+-------------+-------------------+--------------+
~~~
 ## Etapa 03. Diseño de la Solucion 
