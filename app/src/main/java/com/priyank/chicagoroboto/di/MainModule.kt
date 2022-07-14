package com.priyank.chicagoroboto.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Scope
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class MainModule {
    
    @Provides
    @Named("Hey")
    fun provideUserID(@ApplicationContext context: Context): String {
        val preferences =
            context.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        return preferences.getString("text", "")!!


    }


    @Singleton
    @Provides
    @Named("Hey")
    fun provideInt() {

    }


}