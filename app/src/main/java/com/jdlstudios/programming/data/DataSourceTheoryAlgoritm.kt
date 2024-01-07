package com.jdlstudios.programming.data

import com.jdlstudios.programming.R
import com.jdlstudios.programming.model.TheoryAlgorithmModel

object DataSourceTheoryAlgoritm {

    val theoryAlgorithmList: MutableList<TheoryAlgorithmModel> = mutableListOf(
        TheoryAlgorithmModel(
            index = 1,
            title = "Entender el Problema",
            description = "Imagina que tienes un enigma que resolver. Lee el problema varias veces y pregúntate: ¿Qué estoy tratando de lograr? ¿Qué información tengo y qué necesito?",
            tips = "Lee cuidadosamente la descripción del problema.\n\n" +
                    "Asegúrate de comprender completamente los requisitos y restricciones.",
            image = R.drawable.entender
        ),
        TheoryAlgorithmModel(
            index = 2,
            title = "Identificar la Entrada y la Salida",
            description = "Piensa en la información que necesitarás para resolver el problema (entrada) y qué resultados esperas obtener (salida). Podría ser como seguir una receta, donde necesitas ciertos ingredientes (entrada) y esperas un plato delicioso al final (salida).",
            tips = "Determina qué datos de entrada necesitará el algoritmo.\n\n" +
                    "Especifica claramente qué se espera como resultado o salida.",
            image = R.drawable.entrada_salida
        ),
        TheoryAlgorithmModel(
            index = 3,
            title = "Ejemplos y Casos de Prueba:",
            description = "Piensa en la información que necesitarás para resolver el problema (entrada) y qué resultados esperas obtener (salida). Podría ser como seguir una receta, donde necesitas ciertos ingredientes (entrada) y esperas un plato delicioso al final (salida).",
            tips = "Crea ejemplos específicos del problema.\n\n" +
                    "Desarrolla casos de prueba que cubran diferentes situaciones.",
            image = R.drawable.casos_prueba
        ),
        TheoryAlgorithmModel(
            index = 4,
            title = "Descomposición del Problema:",
            description = "Divide el problema en partes más pequeñas y manejables. Si estás resolviendo un problema sobre organizar una fiesta, podrías dividirlo en encontrar un lugar, hacer una lista de invitados y planificar actividades.",
            tips = "Divide el problema en subproblemas más pequeños y manejables.\n\n" +
                    "Aborda cada subproblema por separado.",
            image = R.drawable.descomposicion
        ),
        TheoryAlgorithmModel(
            index = 5,
            title = "Diseño de Algoritmo",
            description = "Piensa en el enfoque general que tomarás. Si estás organizando una fiesta, podrías pensar primero en elegir la fecha, luego en enviar invitaciones y finalmente en preparar la decoración.",
            tips = "Determina el enfoque general que utilizarás para resolver el problema.\n\n" +
                    "Puedes optar por técnicas específicas como fuerza bruta, recursión, programación dinámica, etc.",
            image = R.drawable.codigo_binario
        ),
        TheoryAlgorithmModel(
            index = 6,
            title = "Diseño del diagrama de flujo",
            description = "Imagina que tienes un enigma que resolver. Lee el problema varias veces y pregúntate: ¿Qué estoy tratando de lograr? ¿Qué información tengo y qué necesito?",
            tips = "Diseña cuidadosamente el diagrama del problema.\n\n" +
                    "Asegúrate de comprender completamente el flujo y el significado de cada elemento.",
            image = R.drawable.diagram_design
        ),
        TheoryAlgorithmModel(
            index = 7,
            title = "Pseudocódigo",
            description = "Escribe pasos sencillos en lenguaje humano. Por ejemplo, para organizar una fiesta, podrías escribir: \"Elegir fecha -> Hacer lista de invitados -> Comprar decoraciones\".",
            tips = "Escribe un pseudocódigo que describa la lógica del algoritmo.\n\n" +
                    "Este paso es opcional, pero puede ayudarte a organizar tus ideas antes de escribir el código real.",
            image = R.drawable.pseudocodigo
        ),
        TheoryAlgorithmModel(
            index = 8,
            title = "Implementación del Código",
            description = "Ahora, traduce tu plan a un lenguaje de programación. Si estás usando una receta de cocina, esto sería como seguir los pasos exactos para hacer un pastel.",
            tips = "Traduce tu pseudocódigo o diseño de algoritmo a un lenguaje de programación específico.\n\n" +
                    "Utiliza buenas prácticas de codificación y comentarios para explicar secciones clave.",
            image = R.drawable.programacion
        ),
        TheoryAlgorithmModel(
            index = 9,
            title = "Pruebas y Depuración",
            description = "Imagina que eres un detective que busca pistas. Ejecuta tu plan y verifica si obtienes el resultado esperado. Si algo no sale bien, es como encontrar un error en tu investigación.",
            tips = "Ejecuta tu algoritmo con los casos de prueba que has diseñado.\n\n" +
                    "Identifica y corrige cualquier error o problema de lógica.",
            image = R.drawable.depuracion
        ),
        TheoryAlgorithmModel(
            index = 10,
            title = "Optimización (si es necesario)",
            description = "Piensa en maneras de hacer las cosas más eficientemente. Por ejemplo, si estás organizando una fiesta, ¿hay alguna manera de hacerlo más divertido sin gastar demasiado?",
            tips = "Si tu algoritmo no es lo suficientemente eficiente, considera optimizaciones.\n\n" +
                    "Asegúrate de que el algoritmo funcione bien para tamaños de entrada grandes.",
            image = R.drawable.mejora
        ),
        TheoryAlgorithmModel(
            index = 11,
            title = "Documentación",
            description = "Es como escribir instrucciones para alguien más. Si estás enseñando a un amigo cómo organizar una fiesta, ¿cómo le explicarías cada paso?",
            tips = "Documenta tu código para que otros (y tu futuro yo) puedan entenderlo fácilmente.\n\n" +
                    "Incluye comentarios explicativos y una descripción general del algoritmo.",
            image = R.drawable.documentacion
        ),
        TheoryAlgorithmModel(
            index = 12,
            title = "Revisión y Mejora Continua",
            description = "Pide opiniones. Si organizas una fiesta y tus amigos sugieren algo, ¡puede hacer que la próxima sea aún mejor!",
            tips = "Pide a colegas o amigos que revisen tu algoritmo.\n\n" +
                    "Está abierto a sugerencias y busca maneras de mejorar tu solución.",
            image = R.drawable.pruebass
        ),
        TheoryAlgorithmModel(
            index = 13,
            title = "Complejidad del Tiempo y Espacio",
            description = "Piensa en cuánto tiempo toma cada paso y cuánto espacio necesitas. Si estás haciendo un pastel, ¿cuánto tiempo pasas mezclando ingredientes y cuánto espacio necesitas en el horno?",
            tips = "Evalúa la complejidad temporal y espacial de tu algoritmo.\n\n" +
                    "Asegúrate de entender la eficiencia del algoritmo en términos de tiempo y memoria.",
            image = R.drawable.tiempo_space
        ),
        TheoryAlgorithmModel(
            index = 14,
            title = "Manejo de Errores",
            description = "Si algo sale mal, ¿cómo puedes arreglarlo? Por ejemplo, si te olvidas de comprar un ingrediente para tu pastel, ¿hay algo que puedas usar como sustituto?",
            tips = "Implementa manejo de errores adecuado.\n\n" +
                    "Considera casos límite y cómo tu algoritmo se comporta en esas situaciones.",
            image = R.drawable.errores_manejo
        ),
        TheoryAlgorithmModel(
            index = 15,
            title = "Validación de Resultados",
            description = "Asegúrate de que el pastel (o el resultado final) sea como esperabas. ¿Tiene el sabor que querías? ¿La fiesta fue tan divertida como imaginabas?",
            tips = "Verifica que los resultados producidos por tu algoritmo sean correctos y cumplen con los requisitos del problema.",
            image = R.drawable.pruebas_depuracion
        ),
        TheoryAlgorithmModel(
            index = 16,
            title = "Optimización Final (si es necesario)",
            description = "¿Hay alguna manera de hacer que la próxima fiesta sea aún mejor? ¿Podrías agregar algo especial al pastel la próxima vez?",
            tips = "Siempre hay margen para mejorar. Busca oportunidades para optimizar tu algoritmo aún más.",
            image = R.drawable.optimizacion_app
        ),
    )
}