package com.jdlstudios.programming.data

import com.jdlstudios.programming.R
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
            shortDescription = "Introducción al mundo de Kotlin",
            description = "Historia y características de Kotlin.\n" +
                    "Instalación del entorno de desarrollo (por ejemplo, IntelliJ IDEA).",
            difficult = 0,
            timeEstimated = "2 - 3 hours",
            image = R.drawable.introduction,
            complete = true
        ),
        ThemeModel(
            id = 200,
            title = "Conceptos Básicos",
            shortDescription = "Fundamentos esenciales para comenzar a programar en Kotlin.",
            description = "Variables y tipos de datos.\n" +
                    "Operadores y expresiones.\n" +
                    "Entrada y salida de datos.",
            difficult = 0,
            timeEstimated = "2 - 3 hours",
            image = R.drawable.concepts_basic,
            complete = false
        ),
        ThemeModel(
            id = 300,
            title = "Estructuras de Control",
            shortDescription = "Controlar el flujo de ejecución en Kotlin.",
            description = "Condiciones (if, else, when).\n" +
                    "Bucles (for, while).",
            difficult = 1,
            timeEstimated = "4 - 5 hours",
            image = R.drawable.struct_control,
            complete = false
        ),
        ThemeModel(
            id = 400,
            title = "Funciones en Kotlin",
            shortDescription = "Exploración de funciones avanzadas en Kotlin.",
            description = "Declaración y llamada de funciones.\n" +
                    "Parámetros y retorno de funciones.\n" +
                    "Funciones de orden superior y lambdas.",
            difficult = 1,
            timeEstimated = "5 - 6 hours",
            image = R.drawable.functions,
            complete = false
        ),
        ThemeModel(
            id = 500,
            title = "Clases y Objetos",
            shortDescription = "Creación de estructuras organizadas para encapsular datos y comportamientos.",
            description = "En Kotlin, una clase es un plano para crear objetos, y los objetos son instancias de esas clases.\n" +
                    "Las clases tienen propiedades y funciones que definen su comportamiento.\n" +
                    "Creación de clases y objetos en Kotlin.\n" +
                    "Propiedades y métodos.\n" +
                    "Constructores.",
            difficult = 2,
            timeEstimated = "4 - 6 hours",
            image = R.drawable.class_objects,
            complete = false
        ),
        ThemeModel(
            id = 600,
            title = "Herencia",
            shortDescription = "Compartir comportamientos entre clases para promover la reutilización del código.",
            description = "La herencia en Kotlin permite a una clase heredar propiedades y funciones de otra. La clase que hereda se llama subclase, y la clase de la que hereda se llama superclase.\n" +
                    "Declaración y uso de herencia en Kotlin.\n" +
                    "Clases y métodos abstractos.\n" +
                    "Interfaces.",
            difficult = 2,
            timeEstimated = "4 - 6 hours",
            image = R.drawable.inheritance,
            complete = false
        ),
        ThemeModel(
            id = 700,
            title = "Polimorfismo",
            shortDescription = "Flexibilidad en el uso de funciones y propiedades para adaptarse a diferentes situaciones.",
            description = "El polimorfismo permite a los objetos tomar muchas formas. En Kotlin, esto se logra mediante la creación de funciones o propiedades que se pueden usar de manera diferente según el contexto.\n" +
                    "Implementación de polimorfismo en Kotlin.\n" +
                    "Sobrecarga de funciones y operadores.",
            difficult = 2,
            timeEstimated = "4 - 6 hours",
            image = R.drawable.polimorfism,
            complete = false
        ),
        ThemeModel(
            id = 800,
            title = "Listas y Arrays",
            shortDescription = " Manipulación eficiente de conjuntos de datos.",
            description = "Listas y arrays son estructuras de datos que almacenan elementos. En Kotlin, las listas son dinámicas, mientras que los arrays tienen un tamaño fijo.\n" +
                    "Uso de listas y arrays en Kotlin.\n" +
                    "Métodos y funciones relacionados.",
            difficult = 0,
            timeEstimated = "2 - 3 hours",
            image = R.drawable.lista,
            complete = false
        ),
        ThemeModel(
            id = 900,
            title = "Mapas y Sets",
            shortDescription = "Trabajo con estructuras de datos para modelar relaciones clave-valor.",
            description = "Mapas almacenan pares clave-valor, mientras que los sets contienen elementos únicos. Estas estructuras son útiles para organizar y acceder a datos de manera eficiente.\n" +
                    "Trabajo con mapas y sets en Kotlin.\n" +
                    "Operaciones y funciones específicas.",
            difficult = 1,
            timeEstimated = "4 - 5 hours",
            image = R.drawable.conjuntos,
            complete = false
        ),
        ThemeModel(
            id = 1000,
            title = "Programación Funcional",
            shortDescription = "Exploración del paradigma funcional en Kotlin.",
            description = "Conceptos básicos de programación funcional.\n" +
                    "Funciones de orden superior, lambdas y expresiones lambda.",
            difficult = 1,
            timeEstimated = "5 - 6 hours",
            image = R.drawable.funcional,
            complete = false
        ),
        ThemeModel(
            id = 1100,
            title = "Manejo de Errores en Kotlin",
            shortDescription = "Manejo efectivo de errores en Kotlin.",
            description = "Uso de try-catch para manejar excepciones.\n" +
                    "Creación de excepciones personalizadas.",
            difficult = 1,
            timeEstimated = "4 - 5 hours",
            image = R.drawable.errores,
            complete = false
        ),
        ThemeModel(
            id = 1200,
            title = "Desarrollo de Aplicaciones Android con Kotlin",
            shortDescription = "Creación de aplicaciones prácticas en Kotlin.",
            description = "Introducción al desarrollo de aplicaciones Android.\n" +
                    "Creación de interfaces de usuario con XML.\n" +
                    "Conexión entre la interfaz y el código Kotlin.",
            difficult = 2,
            timeEstimated = "10 - 14 hours",
            image = R.drawable.android,
            complete = false
        ),
        ThemeModel(
            id = 1300,
            title = "Persistencia de Datos en Android",
            shortDescription = "Almacenamiento y recuperación de datos locales en aplicaciones Android.",
            description = "Uso de SQLite para almacenamiento local.\n" +
                    "Preferencias compartidas y archivos.",
            difficult = 2,
            timeEstimated = "6 - 8 hours",
            image = R.drawable.datos_saved,
            complete = false
        ),
        ThemeModel(
            id = 1400,
            title = "Consumo de Servicios Web",
            shortDescription = "Integración de datos desde servicios externos a la aplicación.",
            description = "Uso de Retrofit para realizar solicitudes HTTP.\n" +
                    "Deserialización de datos JSON.\n",
            difficult = 2,
            timeEstimated = "6 - 8 hours",
            image = R.drawable.web_image_page,
            complete = false
        ),
        ThemeModel(
            id = 1500,
            title = "Pruebas Unitarias en Kotlin",
            shortDescription = "Garantizando la calidad del código con pruebas unitarias.",
            description = "Configuración de pruebas unitarias.\n" +
                    "Uso de bibliotecas de prueba como JUnit.",
            difficult = 2,
            timeEstimated = "5 - 7 hours",
            image = R.drawable.pruebas,
            complete = false
        ),
        ThemeModel(
            id = 1600,
            title = "Desarrollo de Proyectos Prácticos",
            shortDescription = "Aplicación de conocimientos en proyectos del mundo real.",
            description = "Aplicación de los conocimientos adquiridos en proyectos reales.\n" +
                    "Colaboración en proyectos de código abierto (opcional).",
            difficult = 3,
            timeEstimated = "30 - 60 hours",
            image = R.drawable.gestion_de_proyectos,
            complete = false
        ),
        ThemeModel(
            id = 1700,
            title = "Kotlin Coroutines",
            shortDescription = "Exploración de herramientas avanzadas en Kotlin.",
            description = "Introducción a las coroutines para programación asíncrona.",
            difficult = 3,
            timeEstimated = "12 - 16 hours",
            image = R.drawable.asincrona,
            complete = false
        ),
        ThemeModel(
            id = 1800,
            title = "Inyección de Dependencias",
            shortDescription = "Inyección de Dependencias",
            description = "Uso de frameworks de inyección de dependencias como Koin o Dagger.",
            difficult = 1,
            timeEstimated = "6 - 8 hours",
            image = R.drawable.inyeccion,
            complete = false
        ),
        ThemeModel(
            id = 1900,
            title = "Buenas Prácticas de Codificación",
            shortDescription = "Exploración de herramientas avanzadas en Kotlin.",
            description = "Principios SOLID.\n" +
                    "Convenciones de nomenclatura y estilo de código.",
            difficult = 3,
            timeEstimated = "8 - 12 hours",
            image = R.drawable.best_practice,
            complete = false
        ),
        ThemeModel(
            id = 2000,
            title = "Patrones de Diseño",
            shortDescription = "Mejora del diseño y la calidad del código en Kotlin.",
            description = "Uso de patrones comunes como Singleton, Observer, etc.",
            difficult = 3,
            timeEstimated = "12 - 14 hours",
            image = R.drawable.pattern_desing,
            complete = false
        )

    )

}