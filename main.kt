enum class Gender {
    FEMALE,
    MALE
}

fun saludar(nombreCompleto: String, saludo: String = "Hola"): Unit {
   val saludoCompleto: String = "$saludo, mi nombre es $nombreCompleto"
   println(saludoCompleto)
}

fun obtenerGenero(genero: Gender): String {
    
    var mensaje: String = "Mi genero es "
    
    when(genero) {
        Gender.FEMALE -> mensaje += "Femenino"
        Gender.MALE -> mensaje += "Masculino"
    }
    
    return mensaje
}

fun main() {
    val saludo: String = "Bienvenido a la materia de aplicaciones moviles"
    val nombreCompleto: String = "Rafael Andres Vargas Mamani"
    val genero: Gender = Gender.MALE
    
    //print -> "Bienvenido a la materia de aplicaciones moviles, mi nombre es Rafael Andres Vargas Mamani"
    saludar(nombreCompleto = nombreCompleto, saludo = saludo)

    //return -> "Mi genero es Masculino"
    println(obtenerGenero(genero = genero))
    
    //return -> "Hola, mi nombre es Rafael Andres Vargas Mamani"
	saludar(nombreCompleto = nombreCompleto)
}