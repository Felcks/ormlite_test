package com.example.felcks.ormlite.dao

import android.database.sqlite.SQLiteDatabase
import com.example.felcks.ormlite.App
import com.example.felcks.ormlite.db_tables.Table_Contrato
import com.example.felcks.ormlite.db_tables.Table_Obra
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
import com.j256.ormlite.support.ConnectionSource
import com.j256.ormlite.table.TableUtils

/**
 * Created by felcks on 5/7/18.
 */
object DatabaseHelper : OrmLiteSqliteOpenHelper(App.instance, "test.db", null, 3){

    override fun onCreate(database: SQLiteDatabase?, connectionSource: ConnectionSource?) {
        TableUtils.createTableIfNotExists(connectionSource, Table_Obra::class.java)
        TableUtils.createTableIfNotExists(connectionSource, Table_Contrato::class.java)
    }

    override fun onUpgrade(database: SQLiteDatabase?, connectionSource: ConnectionSource?, oldVersion: Int, newVersion: Int) {
        TableUtils.dropTable<Table_Obra, Any>(connectionSource, Table_Obra::class.java, true)
        TableUtils.dropTable<Table_Contrato, Any>(connectionSource, Table_Contrato::class.java, true)
        onCreate(database, connectionSource)
    }
}