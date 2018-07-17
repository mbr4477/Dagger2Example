package sample

import javax.inject.Inject


class LanguageDao @Inject constructor(val dataStore: DataStore){
    fun sayHi() {
        dataStore.sayHi()
        println("Hi, I'm the language dao!")
    }
}