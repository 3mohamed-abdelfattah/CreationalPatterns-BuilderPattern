package builder

fun main() {
    val car1 = Car.build {
        brand = "BMW"
        color = "black"
        license = "Apache License, Version 2.0"
    }
    println(car1)
}
