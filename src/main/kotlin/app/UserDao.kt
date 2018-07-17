package app

import javax.inject.Inject

class UserDao @Inject constructor(val dataStore: DataStore) {
    fun sayHi() {
        dataStore.sayHi()
        println("Hi, I'm the user dao!")
    }
}