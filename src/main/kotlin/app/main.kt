import dependencyinjection.DaggerComponent

fun main(args: Array<String>) {
    val database = DaggerComponent.builder().build().getTrDatabase()
    database.sayHi()
    println("Hi, I'm the main function!")
}