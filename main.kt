enum class Gender {
    FEMALE,
    MALE
}

fun main() {
    
    val name: String = "Rafael Andres"
    val lastName: String = "Vargas Mamani"
    
    val subject: String = "Aplicaciones mobiles"
    val weight: Double = 60.3
    val height: Float = 1.72f
   	val age: Int = 20
    val gender: Gender = Gender.MALE
   
    val ageIsEven = (age % 2 == 0)

    val greeting: String =
    """
    |Hi, mi name is $name $lastName
    |The subject is $subject
    |I am $age years old
    |My weight is $weight kilos
    |I am $height centimeters tall
    |And my age is ${if (ageIsEven) "even" else "odd"}
   	|My gender is ${gender.name.lowercase()}
    """.trimMargin()
    
    println(greeting)
}