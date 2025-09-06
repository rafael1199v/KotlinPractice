enum class Gender(val descripcion: String) {
    FEMALE("Femenino"),
    MALE("Masculino")
}

fun main() {
    val saludo: String = "Bienvenido a la materia de aplicaciones moviles"
    
    val nombre: String = "Rafael Andres"
    val apellido: String = "Vargas Mamani"
    val materia: String = "Aplicaciones Moviles"
    val peso: Double = 60.0
    val altura: Double = 1.72
    val edad: Int = 20
    val genero: Gender = Gender.MALE

    val rafael: Persona = Persona(nombre, apellido, materia, peso, altura, edad, genero)
    
    // print -> Hola, mi nombre es Rafael Andres Vargas Mamani
    rafael.saludar()
    
    // print -> Bievenido a la materia de aplicaciones moviles, mi nombre es Rafael Andres Vargas Mamani
    rafael.saludar(saludo = "Bienvenido a la materia de aplicaciones moviles")
    
    // rafael.esMayorEdad() returns -> true
   	println("Soy ${if (rafael.esMayorEdad()) "mayor" else "menor"} de edad")
    
    // rafael.obtenerGenero() returns -> "Masculino"
    println("Mi genero es ${rafael.obtenerGenero()}")
}


data class Persona(
	val nombre: String,
    val apellido: String,
    val materia: String,
    val peso: Double,
    val altura: Double,
    val edad: Int,
    val genero: Gender
) {
    fun saludar(saludo: String = "Hola"): Unit {
        println("$saludo, mi nombre es $nombreCompleto")
    }
    
    fun esMayorEdad(): Boolean {
        return edad >= 18
    }
    
    fun obtenerGenero(): String {
        return genero.descripcion
    }
    
    val nombreCompleto: String
    	get() = "$nombre $apellido"
}