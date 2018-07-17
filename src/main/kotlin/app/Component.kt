package app

import dagger.Component
import javax.inject.Singleton

@Component(modules = [Module::class])
@Singleton
interface Component {
    fun getTrDatabase() : TrDatabase
}
