package dependencyinjection

import dagger.Provides
import dagger.Module
import sample.DataStore
import javax.inject.Singleton

@Module
class Module {
    @Provides
    @Singleton
    fun providesDataStore() : DataStore = DataStore()
}