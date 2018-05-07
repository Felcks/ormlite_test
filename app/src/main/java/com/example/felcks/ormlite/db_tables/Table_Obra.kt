package com.example.felcks.ormlite.db_tables

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

/**
 * Created by felcks on 5/7/18.
 */
@DatabaseTable(tableName = "obra")
data class Table_Obra(

        @DatabaseField(generatedId = true)
        var id: Int? = null,

        @DatabaseField
        var contrato: String = "",

        @DatabaseField
        var endereco: String = ""
)