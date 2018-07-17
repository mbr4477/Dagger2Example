package app

import javax.inject.Inject

class TrDatabase @Inject constructor(val userDao: UserDao){
    fun sayHi() {
        userDao.sayHi()
        println("Hi, I'm the TrDatabase!")
    }
}