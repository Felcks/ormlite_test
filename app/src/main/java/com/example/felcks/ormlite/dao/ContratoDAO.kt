package com.example.felcks.ormlite.dao

import com.example.felcks.ormlite.db_tables.Table_Contrato
import com.j256.ormlite.dao.Dao

/**
 * Created by felcks on 5/7/18.
 */
class ContratoDAO {

    companion object {
        lateinit var dao: Dao<Table_Contrato, Int>
    }

    init {
        dao = DatabaseHelper.getDao(Table_Contrato::class.java)
    }


    fun add(table: Table_Contrato) = dao.createOrUpdate(table)

    fun update(table: Table_Contrato) = dao.update(table)

    fun delete(table: Table_Contrato) = dao.delete(table)

    fun queryForAll() = dao.queryForAll()

    fun removeAll() {
        for (table in queryForAll()) {
            dao.delete(table)
        }
    }
}