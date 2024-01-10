package com.jdlstudios.programming.data

import com.jdlstudios.programming.model.ExerciseDetailModel
import com.jdlstudios.programming.model.ExerciseDetailModel.Companion.mapToDetailFromExercise
import com.jdlstudios.programming.model.ExerciseModel

object DataSourceExercisesDetail {
    fun getExerciseDetail(idTheme: Int, idExercise: Int): ExerciseDetailModel? {
        val exerciseListMap = mapOf(
            100 to listExercisesDetail100,
            200 to listExercisesDetail200,
            300 to listExercisesDetail300
        )
        return exerciseListMap[idTheme]?.find { it.id == idExercise }
    }

    fun getListExercisesSummary(idTheme: Int): List<ExerciseModel> {
        val exerciseList: MutableList<ExerciseModel> = mutableListOf()
        val exerciseDetailList = when (idTheme) {
            100 -> listExercisesDetail100
            200 -> listExercisesDetail200
            300 -> listExercisesDetail300
            else -> emptyList()
        }
        exerciseDetailList.forEach {
            exerciseList.add(it.mapToDetailFromExercise())
        }
        return exerciseList
    }

    val listExercisesDetail100: List<ExerciseDetailModel> = listOf(
        ExerciseDetailModel(
            id = 101,
            title = "Declara variables",
            description = "Declara dos variables llamadas numero1 y numero2 y asígnales valores enteros. Luego, imprime la suma de ambos.",
            difficulty = 0,
            date = "2023-01-01",
            time = "10:00 AM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 102,
            title = "Saludo",
            description = "Crea una variable llamada nombre y asígnale tu nombre. Imprime un saludo personalizado.",
            difficulty = 0,
            date = "2023-01-02",
            time = "02:30 PM",
            timeUser = "45 min",
            complete = true
        )

    )

    val listExercisesDetail200: List<ExerciseDetailModel> = listOf(
        ExerciseDetailModel(
            id = 201,
            title = "Área de un Círculo",
            description = "Declara una constante llamada PI y asígnale el valor de 3.14159. Calcula el área de un círculo con un radio de 5 unidades.",
            difficulty = 0,
            date = "2023-01-03",
            time = "11:15 AM",
            timeUser = "40 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 202,
            title = "Comparación de Números",
            description = "Crea una variable booleana llamada esMayor y asígnale el resultado de comparar numero1 con numero2. Imprime el resultado.",
            difficulty = 0,
            date = "2023-01-04",
            time = "03:45 PM",
            timeUser = "35 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 203,
            title = "Longitud de Cadena",
            description = "Declara una variable cadena y asígnale una frase. Luego, imprime la longitud de la cadena.",
            difficulty = 0,
            date = "2023-01-05",
            time = "01:30 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 204,
            title = "División de Números",
            description = "Crea dos variables numeroA y numeroB de tipo Double. Realiza la división de numeroA entre numeroB y muestra el resultado.",
            difficulty = 0,
            date = "2023-01-06",
            time = "02:00 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 205,
            title = "Mensaje de Edad",
            description = "Declara una variable edad y asígnale tu edad. Luego, imprime un mensaje que indique si eres menor o mayor de edad.",
            difficulty = 0,
            date = "2023-01-07",
            time = "10:30 AM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 206,
            title = "Descuento de Precio",
            description = "Crea una variable llamada precio de tipo Float y asígnale un valor. Calcula el precio con un descuento del 10% e imprímelo.",
            difficulty = 1,
            date = "2023-01-08",
            time = "04:15 PM",
            timeUser = "35 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 207,
            title = "Operación Matemática",
            description = "Declara una variable resultado y asígnale el valor de numero1 + numero2 * 2. Imprime el resultado.",
            difficulty = 1,
            date = "2023-01-09",
            time = "12:45 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 208,
            title = "Área de un Triángulo",
            description = "Crea dos variables llamadas altura y base y calcula el área de un triángulo (área = base * altura / 2).",
            difficulty = 1,
            date = "2023-01-10",
            time = "02:30 PM",
            timeUser = "40 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 209,
            title = "Declara variables",
            description = "Declara dos variables llamadas numero1 y numero2 y asígnales valores enteros. Luego, imprime la suma de ambos.",
            difficulty = 0,
            date = "2023-01-01",
            time = "10:00 AM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 210,
            title = "Saludo",
            description = "Crea una variable llamada nombre y asígnale tu nombre. Imprime un saludo personalizado.",
            difficulty = 0,
            date = "2023-01-02",
            time = "02:30 PM",
            timeUser = "45 min",
            complete = true
        ),
        ExerciseDetailModel(
            id = 211,
            title = "Conversión de Temperatura",
            description = "Declara una variable tempCelsius y asígnale un valor. Convierte esta temperatura a Fahrenheit usando la fórmula F = C * 9/5 + 32.",
            difficulty = 1,
            date = "Viernes 12 de Enero",
            time = "11:30 AM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 212,
            title = "Redondeo de Número Decimal",
            description = "Crea una variable numDecimal de tipo Double y redondea su valor a dos decimales antes de imprimirlo.",
            difficulty = 1,
            date = "Viernes 12 de Enero",
            time = "02:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 213,
            title = "Cálculo de Costo Total",
            description = "Declara una variable precioProducto y otra cantidad de tipo Int. Calcula el costo total multiplicando ambas variables e imprímelo.",
            difficulty = 1,
            date = "Viernes 12 de Enero",
            time = "03:30 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 214,
            title = "Incremento y Multiplicación",
            description = "Crea una variable puntuacion de tipo Int. Incrementa su valor en 10 y luego multiplícalo por 2. Imprime el resultado.",
            difficulty = 2,
            date = "Viernes 12 de Enero",
            time = "04:45 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 215,
            title = "Concatenación de Cadenas",
            description = "Declara una variable cadena1 y otra cadena2. Concatena ambas cadenas e imprime el resultado.",
            difficulty = 1,
            date = "Viernes 12 de Enero",
            time = "05:15 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 216,
            title = "Conversión de Distancia",
            description = "Crea una variable distanciaKm y conviértela a millas (1 km = 0.621371 millas).",
            difficulty = 2,
            date = "Viernes 12 de Enero",
            time = "06:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 217,
            title = "Par o Impar",
            description = "Declara una variable numero de tipo Int y comprueba si es par o impar. Imprime el resultado.",
            difficulty = 2,
            date = "Viernes 12 de Enero",
            time = "07:00 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 218,
            title = "Categorización de Edad",
            description = "Crea una variable edadPersona y determina si es un niño (menor de 12 años), adolescente (entre 12 y 18 años) o adulto.",
            difficulty = 2,
            date = "Viernes 12 de Enero",
            time = "08:00 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 219,
            title = "Intercambio de Valores",
            description = "Declara dos variables valorA y valorB. Intercambia sus valores sin utilizar una variable temporal.",
            difficulty = 2,
            date = "Viernes 12 de Enero",
            time = "09:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 220,
            title = "Categorización de Calificación",
            description = "Crea una variable calificacion de tipo Int y determina si es A, B, C, D o F.",
            difficulty = 3,
            date = "Viernes 12 de Enero",
            time = "10:00 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 221,
            title = "Operación Matemática Compleja",
            description = "Declara una variable num1 y otra num2 de tipo Double. Realiza una operación matemática compleja que involucre ambas variables y imprime el resultado.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "11:00 AM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 222,
            title = "Extracción de Caracteres",
            description = "Crea una variable cadenaLarga con un texto extenso. Luego, extrae e imprime solo los primeros 20 caracteres.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "12:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 223,
            title = "Operación Matemática con Potencia",
            description = "Declara una variable num3 y realiza una operación matemática que incluya una potencia (por ejemplo, elevar al cuadrado).",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "01:30 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 224,
            title = "Determinar si Puede Votar",
            description = "Crea una variable edadUsuario y otra puedeVotar de tipo Boolean. Asigna un valor a edadUsuario y determina si el usuario puede votar.",
            difficulty = 2,
            date = "Sábado 13 de Enero",
            time = "03:00 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 225,
            title = "Cálculo de Distancia",
            description = "Declara dos variables velocidad y tiempo de tipo Double. Calcula la distancia recorrida utilizando la fórmula distancia = velocidad * tiempo.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "04:30 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 226,
            title = "Comprobación de Tipo",
            description = "Crea una variable numeroGrande de tipo Long. Añade 1 a este número y verifica si sigue siendo de tipo Long.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "06:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 227,
            title = "Conversión de Número Entero",
            description = "Declara una variable numeroEntero y conviértela a una cadena. Luego, convierte esa cadena de nuevo a un número entero.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "07:30 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 228,
            title = "Cálculo de Edad en Años Humanos",
            description = "Crea una variable edadPerro y una constante factorEdad de tipo Double. Calcula la edad del perro en años humanos (edadHumana = edadPerro * factorEdad).",
            difficulty = 2,
            date = "Sábado 13 de Enero",
            time = "08:30 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 229,
            title = "Parte Entera y Decimal",
            description = "Crea una variable numDecimal de tipo Float. Imprime la parte entera y la parte decimal por separado.",
            difficulty = 3,
            date = "Sábado 13 de Enero",
            time = "09:30 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 230,
            title = "Mensaje Dependiendo del Día",
            description = "Crea una variable diaSemana de tipo String. Utiliza una expresión when para imprimir un mensaje dependiendo del día.",
            difficulty = 2,
            date = "Sábado 13 de Enero",
            time = "10:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 231,
            title = "Reverso de una Cadena",
            description = "Pide al usuario que ingrese una palabra. Luego, imprime la palabra al revés.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "11:00 AM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 232,
            title = "Contador de Vocales",
            description = "Pide al usuario que ingrese una frase. Cuenta y muestra la cantidad de vocales (a, e, i, o, u) en la frase.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "12:00 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 233,
            title = "Palíndromo",
            description = "Pide al usuario que ingrese una palabra. Determina si la palabra es un palíndromo.",
            difficulty = 4,
            date = "Domingo 14 de Enero",
            time = "01:30 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 234,
            title = "Cifrado César",
            description = "Pide al usuario que ingrese una frase y un número de desplazamiento. Cifra la frase utilizando el cifrado César y muestra el resultado.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "03:00 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 235,
            title = "Separador de Palabras",
            description = "Pide al usuario que ingrese una cadena de texto sin espacios y en minúsculas. Separa las palabras en la cadena e imprímelas.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "04:30 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 236,
            title = "Contador de Palabras",
            description = "Pide al usuario que ingrese una oración. Cuenta y muestra la cantidad de palabras en la oración.",
            difficulty = 2,
            date = "Domingo 14 de Enero",
            time = "06:00 PM",
            timeUser = "15 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 237,
            title = "Reemplazo de Caracteres",
            description = "Pide al usuario que ingrese una frase y dos caracteres. Reemplaza todas las instancias del primer carácter con el segundo en la frase.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "07:30 PM",
            timeUser = "25 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 238,
            title = "Contador de Palabras Palíndromas",
            description = "Pide al usuario que ingrese una frase. Cuenta y muestra la cantidad de palabras palíndromas en la frase.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "08:30 PM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 239,
            title = "Eliminación de Espacios",
            description = "Pide al usuario que ingrese una cadena con espacios en blanco. Elimina los espacios en blanco y muestra la cadena resultante.",
            difficulty = 2,
            date = "Domingo 14 de Enero",
            time = "09:30 PM",
            timeUser = "20 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 240,
            title = "Cifrado de Sustitución",
            description = "Pide al usuario que ingrese una frase y una clave de sustitución. Cifra la frase utilizando el cifrado de sustitución y muestra el resultado.",
            difficulty = 3,
            date = "Domingo 14 de Enero",
            time = "10:00 PM",
            timeUser = "25 min",
            complete = false
        )
    )

    val listExercisesDetail300 = listOf(
        ExerciseDetailModel(
            id = 301,
            title = "Determinar par o impar",
            description = "Escribe un programa que determine si un número es par o impar.",
            difficulty = 0,
            date = "2024-01-06",
            time = "12:00 PM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 302,
            title = "Comparar dos números",
            description = "Crea un programa que compare dos números e imprima el mayor.",
            difficulty = 1,
            date = "2024-01-06",
            time = "01:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 303,
            title = "Verificar positivo, negativo o cero",
            description = "Desarrolla un programa que verifique si un número es positivo, negativo o cero.",
            difficulty = 0,
            date = "2024-01-06",
            time = "03:00 PM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 304,
            title = "Determinar si es mayor de edad",
            description = "Implementa un programa que solicite la edad del usuario y determine si es mayor de edad.",
            difficulty = 0,
            date = "2024-01-06",
            time = "04:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 305,
            title = "Verificar si es divisible por 3",
            description = "Crea un programa que verifique si un número es divisible por 3.",
            difficulty = 0,
            date = "2024-01-06",
            time = "06:00 PM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 306,
            title = "Conversión de temperatura",
            description = "Escribe un programa que convierta una temperatura de Celsius a Fahrenheit y viceversa, permitiendo al usuario elegir la dirección de la conversión.",
            difficulty = 1,
            date = "2024-01-07",
            time = "09:00 AM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 307,
            title = "Cálculo de horas extras",
            description = "Desarrolla un programa que calcule el pago de horas extras de un trabajador, considerando que las horas extras se pagan al doble del salario regular.",
            difficulty = 2,
            date = "2024-01-07",
            time = "10:30 AM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 308,
            title = "Mensaje según número ingresado",
            description = "Escribir un programa que pida al usuario que introduzca un número y muestre un mensaje en función de si el número es mayor que 10, menor que 10 o igual a 10.",
            difficulty = 1,
            date = "2024-01-07",
            time = "12:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 309,
            title = "Par o impar según número ingresado",
            description = "Escribir un programa que pida al usuario que introduzca un número y muestre un mensaje en función de si el número es par o impar.",
            difficulty = 1,
            date = "2024-01-07",
            time = "01:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 310,
            title = "Mayúscula o minúscula según letra ingresada",
            description = "Escribir un programa que pida al usuario que introduzca una letra y muestre un mensaje en función de si la letra es mayúscula o minúscula.",
            difficulty = 1,
            date = "2024-01-07",
            time = "03:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 311,
            title = "Mostrar números del 1 al 10",
            description = "Escribir un programa que muestre los números del 1 al 10.",
            difficulty = 0,
            date = "2024-01-07",
            time = "04:30 PM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 312,
            title = "Mostrar números pares del 1 al 10",
            description = "Escribir un programa que muestre los números pares del 1 al 10.",
            difficulty = 1,
            date = "2024-01-07",
            time = "06:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 313,
            title = "Mostrar números impares del 1 al 10",
            description = "Escribir un programa que muestre los números impares del 1 al 10.",
            difficulty = 1,
            date = "2024-01-08",
            time = "09:00 AM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 314,
            title = "Mostrar números impares del 1 al 10",
            description = "Escribir un programa que muestre los números impares del 1 al 10.",
            difficulty = 1,
            date = "2024-01-08",
            time = "10:30 AM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 315,
            title = "Calcular factorial",
            description = "Desarrolla un programa que calcule el factorial de un número.",
            difficulty = 2,
            date = "2024-01-08",
            time = "12:00 PM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 316,
            title = "Verificar palíndromo",
            description = "Escribe un programa que determine si una palabra es un palíndromo.",
            difficulty = 1,
            date = "2024-01-08",
            time = "01:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 317,
            title = "Generar serie Fibonacci",
            description = "Implementa un programa que genere la serie Fibonacci hasta un número dado.",
            difficulty = 2,
            date = "2024-01-08",
            time = "03:00 PM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 318,
            title = "Sumar dígitos de un número entero",
            description = "Crea un programa que sume los dígitos de un número entero.",
            difficulty = 1,
            date = "2024-01-08",
            time = "04:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 319,
            title = "Encontrar números primos en un rango",
            description = "Desarrolla un programa que encuentre los números primos en un rango dado.",
            difficulty = 2,
            date = "2024-01-08",
            time = "06:00 PM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 320,
            title = "Evaluar nota del usuario",
            description = "Escribir un programa que pida al usuario que introduzca una nota y muestre un mensaje en función de si la nota es suficiente, bien, notable o sobresaliente.",
            difficulty = 1,
            date = "2024-01-09",
            time = "09:00 AM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 321,
            title = "Evaluar fecha ingresada",
            description = "Escribir un programa que pida al usuario que introduzca una fecha y muestre un mensaje en función de si la fecha es posterior a hoy, anterior a hoy o hoy mismo.",
            difficulty = 1,
            date = "2024-01-09",
            time = "10:30 AM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 322,
            title = "Verificar número primo",
            description = "Escribir un programa que pida al usuario que introduzca un número y muestre un mensaje en función de si el número es primo o no.",
            difficulty = 2,
            date = "2024-01-09",
            time = "12:00 PM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 323,
            title = "Evaluar temperatura ingresada",
            description = "Escribir un programa que pida al usuario que introduzca una temperatura y muestre un mensaje en función de si la temperatura es fría, templada o caliente.",
            difficulty = 1,
            date = "2024-01-09",
            time = "01:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 324,
            title = "Evaluar condición meteorológica",
            description = "Escribir un programa que pida al usuario que introduzca una condición meteorológica y muestre un mensaje en función de si el tiempo es soleado, nublado, lluvioso o nevado.",
            difficulty = 1,
            date = "2024-01-09",
            time = "03:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 325,
            title = "Evaluar hora ingresada",
            description = "Escribir un programa que pida al usuario que introduzca una hora y muestre un mensaje en función de si es de día, de noche o madrugada.",
            difficulty = 1,
            date = "2024-01-09",
            time = "04:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 326,
            title = "Mostrar tabla de multiplicar",
            description = "Escribir un programa que muestre la tabla de multiplicar de un número.",
            difficulty = 0,
            date = "2024-01-09",
            time = "06:00 PM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 327,
            title = "Resolver ecuación cuadrática",
            description = "Implementa un programa que resuelva una ecuación cuadrática.",
            difficulty = 2,
            date = "2024-01-09",
            time = "07:30 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 328,
            title = "Ordenar lista de números",
            description = "Escribe un programa que ordene una lista de números de menor a mayor.",
            difficulty = 2,
            date = "2024-01-10",
            time = "09:00 AM",
            timeUser = "25 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 329,
            title = "Búsqueda binaria en lista ordenada",
            description = "Desarrolla un programa que realice una búsqueda binaria en una lista ordenada.",
            difficulty = 3,
            date = "2024-01-10",
            time = "10:30 AM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 330,
            title = "Conversión decimal a binario",
            description = "Crea un programa que convierta un número decimal a binario.",
            difficulty = 2,
            date = "2024-01-10",
            time = "12:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 331,
            title = "Juego de Piedra, Papel o Tijera",
            description = "Implementa un programa que simule el juego de Piedra, Papel o Tijera contra la computadora.",
            difficulty = 2,
            date = "2024-01-10",
            time = "01:30 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 332,
            title = "Verificar frase palíndroma",
            description = "Escribir un programa que pida al usuario que introduzca una frase y muestre un mensaje en función de si la frase es palíndroma o no.",
            difficulty = 2,
            date = "2024-01-10",
            time = "03:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 333,
            title = "Verificar número capicúa",
            description = "Escribir un programa que pida al usuario que introduzca un número y muestre un mensaje en función de si el número es capicúa o no.",
            difficulty = 2,
            date = "2024-01-10",
            time = "04:30 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 334,
            title = "Verificar secuencia de números",
            description = "Escribir un programa que pida al usuario que introduzca una secuencia de números y muestre un mensaje en función de si la secuencia es creciente, decreciente o aleatoria.",
            difficulty = 2,
            date = "2024-01-10",
            time = "06:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 335,
            title = "Mostrar números Fibonacci hasta 100",
            description = "Escribir un programa que muestre los números Fibonacci hasta el número 100.",
            difficulty = 3,
            date = "2024-01-11",
            time = "09:00 AM",
            timeUser = "15 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 336,
            title = "Mostrar números cuadrados perfectos del 1 al 100",
            description = "Escribir un programa que muestre los números cuadrados perfectos del 1 al 100.",
            difficulty = 2,
            date = "2024-01-11",
            time = "10:30 AM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 337,
            title = "Mostrar números triangulares del 1 al 100",
            description = "Escribir un programa que muestre los números triangulares del 1 al 100.",
            difficulty = 2,
            date = "2024-01-11",
            time = "12:00 PM",
            timeUser = "20 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 338,
            title = "Implementar QuickSort",
            description = "Desarrolla un programa que implemente un algoritmo de ordenamiento rápido (QuickSort).",
            difficulty = 3,
            date = "2024-01-11",
            time = "01:30 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 339,
            title = "Multiplicación de dos matrices",
            description = "Escribe un programa que realice la multiplicación de dos matrices.",
            difficulty = 3,
            date = "2024-01-11",
            time = "03:00 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 340,
            title = "Resolución de laberinto con A*",
            description = "Implementa un programa que resuelva un laberinto utilizando el algoritmo de búsqueda A*.",
            difficulty = 3,
            date = "2024-01-11",
            time = "04:30 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 341,
            title = "Implementar árbol AVL",
            description = "Crea un programa que implemente un árbol AVL y realice operaciones de inserción y eliminación.",
            difficulty = 3,
            date = "2024-01-11",
            time = "06:00 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 342,
            title = "Simular sistema de recomendación",
            description = "Desarrolla un programa que simule un sistema de recomendación basado en contenido.",
            difficulty = 3,
            date = "2024-01-12",
            time = "09:00 AM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 343,
            title = "Mostrar números primos gemelos del 1 al 1000",
            description = "Escribir un programa que muestre los números primos gemelos del 1 al 1000.",
            difficulty = 3,
            date = "2024-01-12",
            time = "10:30 AM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 344,
            title = "Mostrar números perfectos hasta el 1000",
            description = "Escribir un programa que muestre los números perfectos hasta el número 1000.",
            difficulty = 3,
            date = "2024-01-12",
            time = "12:00 PM",
            timeUser = "30 minutos",
            complete = false
        ),
        ExerciseDetailModel(
            id = 345,
            title = "Mostrar números triangulares perfectos hasta el 1000",
            description = "Escribir un programa que muestre los números triangulares perfectos hasta el número 1000.",
            difficulty = 3,
            date = "2024-01-12",
            time = "01:30 PM",
            timeUser = "30 minutos",
            complete = false
        )
    )


}