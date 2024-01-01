package com.jdlstudios.programming.data

import com.jdlstudios.programming.model.ThemeModel

object DataSourceThemes {
    fun getThemeById(id: Int): ThemeModel? {
        return themeList.find {
            it.id == id
        }
    }

    val themeList: List<ThemeModel> = listOf(
        ThemeModel(
            id = 100,
            title = "Introducción a Kotlin",
            description = "Historia y características de Kotlin.\n" +
                    "Instalación del entorno de desarrollo (por ejemplo, IntelliJ IDEA)."
        ),
        ThemeModel(
            id = 200,
            title = "Conceptos Básicos",
            description = "Variables y tipos de datos.\n" +
                    "Operadores y expresiones.\n" +
                    "Entrada y salida de datos."
        ),
        ThemeModel(
            id = 300,
            title = "Estructuras de Control",
            description = "Condiciones (if, else, when).\n" +
                    "Bucles (for, while)."
        ),
        ThemeModel(
            id = 400,
            title = "Funciones en Kotlin",
            description = "Declaración y llamada de funciones.\n" +
                    "Parámetros y retorno de funciones.\n" +
                    "Funciones de orden superior y lambdas."
        ),
        ThemeModel(
            id = 500,
            title = "Clases y Objetos",
            description = "Creación de clases y objetos en Kotlin.\n" +
                    "Propiedades y métodos.\n" +
                    "Constructores."
        ),
        ThemeModel(
            id = 600,
            title = "Herencia",
            description = "Declaración y uso de herencia en Kotlin.\n" +
                    "Clases y métodos abstractos.\n" +
                    "Interfaces."
        ),
        ThemeModel(
            id = 700,
            title = "Polimorfismo",
            description = "Implementación de polimorfismo en Kotlin.\n" +
                    "Sobrecarga de funciones y operadores."
        ),
        ThemeModel(
            id = 800,
            title = "Listas y Arrays",
            description = "Uso de listas y arrays en Kotlin.\n" +
                    "Métodos y funciones relacionados."
        ),
        ThemeModel(
            id = 900,
            title = "Mapas y Sets",
            description = "Trabajo con mapas y sets en Kotlin.\n" +
                    "Operaciones y funciones específicas."
        ),
        ThemeModel(
            id = 1000,
            title = "Programación Funcional",
            description = "Conceptos básicos de programación funcional.\n" +
                    "Funciones de orden superior, lambdas y expresiones lambda."
        ),
        ThemeModel(
            id = 1100,
            title = "Manejo de Errores en Kotlin",
            description = "Uso de try-catch para manejar excepciones.\n" +
                    "Creación de excepciones personalizadas."
        ),
        ThemeModel(
            id = 1200,
            title = "Desarrollo de Aplicaciones Android con Kotlin",
            description = "Introducción al desarrollo de aplicaciones Android.\n" +
                    "Creación de interfaces de usuario con XML.\n" +
                    "Conexión entre la interfaz y el código Kotlin."
        ),
        ThemeModel(
            id = 1300,
            title = "Persistencia de Datos en Android",
            description = "Uso de SQLite para almacenamiento local.\n" +
                    "Preferencias compartidas y archivos."
        ),
        ThemeModel(
            id = 1400,
            title = "Consumo de Servicios Web",
            description = "Uso de Retrofit para realizar solicitudes HTTP.\n" +
                    "Deserialización de datos JSON.\n"
        ),
        ThemeModel(
            id = 1500,
            title = "Pruebas Unitarias en Kotlin",
            description = "Configuración de pruebas unitarias.\n" +
                    "Uso de bibliotecas de prueba como JUnit."
        ),
        ThemeModel(
            id = 1600,
            title = "Desarrollo de Proyectos Prácticos",
            description = "Aplicación de los conocimientos adquiridos en proyectos reales.\n" +
                    "Colaboración en proyectos de código abierto (opcional)."
        ),
        ThemeModel(
            id = 1700,
            title = "Kotlin Coroutines",
            description = "Introducción a las coroutines para programación asíncrona."
        ),
        ThemeModel(
            id = 1800,
            title = "Inyección de Dependencias",
            description = "Uso de frameworks de inyección de dependencias como Koin o Dagger."
        ),
        ThemeModel(
            id = 1900,
            title = "Buenas Prácticas de Codificación",
            description = "Principios SOLID.\n" +
                    "Convenciones de nomenclatura y estilo de código."
        ),
        ThemeModel(
            id = 2000,
            title = "Patrones de Diseño",
            description = "Uso de patrones comunes como Singleton, Observer, etc."
        )

    )

}