package app

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class Module {
    @Provides
    @Singleton
    fun providesDataStore() : DataStore = DataStore()
}