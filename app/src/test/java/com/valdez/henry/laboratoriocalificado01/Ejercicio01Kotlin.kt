package com.valdez.henry.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {
    // Método de prueba que actúa como el punto de entrada para ejecutar el test
    @Test
    fun main() {
        // Definimos la palabra que será analizada
        val palabra = "hello"

        // Llamamos a la función que cuenta la frecuencia de los caracteres y guardamos el resultado
        val frecuenciaCaracteres = contarFrecuenciaCaracteres(palabra)

        // Imprimir la palabra de entrada
        println("Entrada: \"$palabra\"")

        // Imprimir el mapa con las frecuencias de los caracteres
        println("Salida: $frecuenciaCaracteres")
    }

    // Función privada que cuenta la frecuencia de cada carácter en la palabra
    private fun contarFrecuenciaCaracteres(palabra: String): Map<Char, Int> {
        // Declaramos un mapa mutable para almacenar los caracteres y sus frecuencias
        val frecuencia = mutableMapOf<Char, Int>()

        // Recorremos cada carácter en la palabra
        for (caracter in palabra) {
            // Si el carácter ya está en el mapa, incrementamos su valor en 1
            if (frecuencia.containsKey(caracter)) {
                // Actualizamos el valor existente con el nuevo conteo
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si el carácter no está en el mapa, lo agregamos con valor inicial de 1
                frecuencia[caracter] = 1
            }
        }

        // Devolvemos el mapa con las frecuencias de los caracteres
        return frecuencia
    }
}
