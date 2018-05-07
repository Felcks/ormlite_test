package com.example.felcks.ormlite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.widget.Button
import com.example.felcks.ormlite.dao.ContratoDAO
import com.example.felcks.ormlite.dao.DatabaseHelper
import com.example.felcks.ormlite.dao.ObraDAO
import com.example.felcks.ormlite.db_tables.Table_Contrato
import com.example.felcks.ormlite.db_tables.Table_Obra
import com.example.felcks.ormlite.domain.Obra

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.teste) as Button).setOnClickListener{
            test()
        }
    }

    private fun test(){

        val obraDao = ObraDAO()
        val obra = Obra("contrato 1", "endereço 1")
        val table_obra = Table_Obra(null, obra.contrato, obra.endereco)

        val contrato = Table_Contrato(null, "", 1)
        val contratoDao = ContratoDAO()
        contratoDao.add(contrato)


        Log.i("script2", "Inicio do teste")
        for(table in contratoDao.queryForAll()){

            Log.i("script2", "${table.obra}")
        }
    }
}
