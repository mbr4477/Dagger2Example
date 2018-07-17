package dependencyinjection

import sample.TrDatabase
import javax.inject.Singleton
import dagger.Component

@Component(modules = [Module::class])
@Singleton
interface Component {
    fun getTrDatabase() : TrDatabase
}
