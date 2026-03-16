package com.itis.kmpproj26.core

import com.itis.kmpproj26.core.config.Configuration
import com.itis.kmpproj26.core.netwrok.networkModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.koinApplication
import org.koin.dsl.module

object CommonKmp {

    fun initKoin(
        configuration: Configuration,
        appDeclaration: KoinAppDeclaration = {},
    ) {
        startKoin {
            appDeclaration()
            modules(
                createConfiguration(configuration),
                networkModule,
            )
        }
    }

    private fun createConfiguration(configuration: Configuration) = module {
        single<Configuration> { configuration }

    }
}
