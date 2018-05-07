package com.example.felcks.ormlite.dao

import com.example.felcks.ormlite.db_tables.Table_Obra
import com.j256.ormlite.dao.Dao

/**
 * Created by felcks on 5/7/18.
 */
class ObraDAO {

    companion object {
        lateinit var dao: Dao<Table_Obra, Int>
    }

    init {
        dao = DatabaseHelper.getDao(Table_Obra::class.java)
    }

    fun add(table: Table_Obra) = dao.createOrUpdate(table)

    fun update(table: Table_Obra) = dao.update(table)

    fun delete(table: Table_Obra) = dao.delete(table)

    fun queryForAll() = dao.queryForAll()

    fun removeAll() {
        for (table in queryForAll()) {
            dao.delete(table)
        }
    }
    
}