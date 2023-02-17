package org.example;

public class Ejercicio6 {
    /*El algoritmo es un juego de adivinanza que le pregunta al usuario cuál es la capital de Francia.
    El usuario tiene un número limitado de intentos (5 en total) para adivinar la respuesta correcta.
    Si el usuario adivina la respuesta correcta, el programa le dirá "Bravo".
    Si el usuario agota todos los intentos sin adivinar la respuesta correcta, el programa le dirá "Revise sus conocimientos en geografía".
    Si el usuario introduce una respuesta incorrecta, el programa le dirá que es incorrecta y cuántos intentos le quedan.

Aquí está una versión corregida del algoritmo:

Algo Adivinanza
Variable numIntentos : entero <- 0
Variable valorIntroducido : texto
Constante MAX_INTENTOS : entero <- 5
   Inicio
    MientrasQue numIntentos < MAX_INTENTOS y valorIntroducido ≠ "París"
    valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
    si valorIntroducido ≠ "París" entonces
        escribir("Respuesta incorrecta")
        numIntentos <- numIntentos + 1
        escribir("Solo quedan " & MAX_INTENTOS - numIntentos &
    " intento(s)")
        sino
    escribir("Bravo")
fsi
FMq
    Si valorIntroducido ≠ "París" Entonces
        escribir("Revise sus conocimientos en geografía")
    FSi
Fin*/
}
