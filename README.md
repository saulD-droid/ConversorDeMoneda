# Conversor de Monedas por Consola   
![Badge de Java](https://img.shields.io/badge/Java-17-orange)  



---

## Descripción del Proyecto  
Este proyecto es un **conversor de monedas por consola** desarrollado en Java.  
Permite al usuario convertir entre diferentes monedas (USD, ARS, BRL, COP, MXN) utilizando las tasas de cambio actuales suministradas por la API ExchangeRate‑API.  
Soluciona la necesidad de obtener rápidamente una conversión de moneda sin interfaz gráfica, ideal para uso rápido desde terminal.  

---

## Estado del Proyecto  
 Proyecto esta  Finalizado. No se piensan implementar mas cambios, al menos de momento. 

---

## Funcionalidades  
- Conversión de monedas desde consola:  
  - Dólar ⇒ Peso argentino  
  - Peso argentino ⇒ Dólar  
  - Dólar ⇒ Real brasileño  
  - Real brasileño ⇒ Dólar  
  - Dólar ⇒ Peso colombiano  
  - Peso colombiano ⇒ Dólar  
  - Dólar ⇒ Peso mexicano  
  - Peso mexicano ⇒ Dólar  
- Uso de la API para obtener tasas en tiempo real.  


---

##Tecnologías Utilizadas

-Java 17

-java.net.http.HttpClient para realizar la solicitud HTTP a la API

-Gson para parsear la respuesta JSON

-API externa: ExchangeRate‑API

##Como utilizar 
por ejemplo a continuacion mostrare un breve ejemplo de como se veria la funcion:
**************************************** 
Sea bienvenido/a al Conversor de Moneda

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Dólar => Peso mexicano
8) Peso mexicano => Dólar
9) Salir
Elija una opción válida: 
***********************************
 - 7 
- Ingrese el monto a convertir: 1
 - 1.00 USD = 18.39 MXN

 Como se puede ver primero elijes 1 de las 9 opciones en este caso se utilizo la opcion numero 7 y despues se ingreso el monto que fue de 1 dolar
 y debajo se hizo la conversion que fue a 18 pesos mexicanos con 39 centavos. esto al momento de hacer la prueba.
 ya despues puedes repetir los mismos pasos con cualquiera de los numeros segun requieras y colocar la opcion 9 cuando requieras salir del programa.
  
  

## Autores 
Saul Ivan Dimas Becerra
