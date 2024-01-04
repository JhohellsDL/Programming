package com.jdlstudios.programming.data

import com.jdlstudios.programming.model.ExerciseDetailModel
import com.jdlstudios.programming.model.ExerciseDetailModel.Companion.mapToDetailFromExercise
import com.jdlstudios.programming.model.ExerciseModel

object DataSourceExercisesDetail {
    fun getExerciseDetail(idTheme: Int, idExercise: Int): ExerciseDetailModel? {
        val exerciseListMap = mapOf(
            100 to listExercisesDetail100,
            200 to listExercisesDetail200
        )
        return exerciseListMap[idTheme]?.find { it.id == idExercise }
    }

    fun getListExercisesSummary(idTheme: Int): List<ExerciseModel> {
        val exerciseList: MutableList<ExerciseModel> = mutableListOf()
        val exerciseDetailList = when (idTheme) {
            100 -> listExercisesDetail100
            200 -> listExercisesDetail200
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

}