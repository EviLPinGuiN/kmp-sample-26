package com.itis.kmpproj26.core.database

import app.cash.sqldelight.db.SqlDriver
import com.itis.kmpproj26.Database
import com.itis.kmpproj26.Database.Companion.invoke
import com.itis.kmpproj26.feature.DatabaseBookDataSource
import org.koin.core.module.Module
import org.koin.dsl.module

val dbModule = module {

    single<Database> {
        Database(get<SqlDriver>())
    }

    factory {
        DatabaseBookDataSource(get())
    }
}