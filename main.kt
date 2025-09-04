enum class Gender {
    FEMALE,
    MALE
}

fun saludar(nombreCompleto: String, saludo: String = "Hola"): String {
   val saludoCompleto: String = "$saludo, mi nombre es $nombreCompleto"
   return saludoCompleto
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
    
    println(saludar(nombreCompleto = nombreCompleto, saludo = saludo))
    println(obtenerGenero(genero = genero))
    
    
    println(saludar(nombreCompleto = nombreCompleto))
}