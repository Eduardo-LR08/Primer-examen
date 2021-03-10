package com.example.eduardolopezexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.eduardolopezexamen.Data.ListUsuarios
import com.example.eduardolopezexamen.Tools.Constants
import com.example.eduardolopezexamen.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    private val listStudents= ListUsuarios()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.text_list)
        listStudents.showListStudents()

        val adapter = ArrayAdapter<String>(this@HomeActivity,android.R.layout.simple_list_item_1,listStudents.getStringArray())
        binding.ltvUsuarios.adapter = adapter

        binding.ltvUsuarios.setOnItemClickListener(){ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
           // miDialogo()
        }
        binding.ltvUsuarios.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, position: Int, id: Long ->
            //miDialogo().show()
            val selectedItem= adapterView.getItemAtPosition(position)

            Toast.makeText(this@HomeActivity,"$position $id $selectedItem", Toast.LENGTH_SHORT).show()


            val intent = Intent(this@HomeActivity,DetalleActivity::class.java).apply{

                putExtra(Constants.ID,position)
            }
            startActivity(intent)
        }
    }
    private fun miDialogo(position :Int,name :String): AlertDialog {
        val miAlerta= AlertDialog.Builder(this@HomeActivity)

        miAlerta.setTitle("Editar o eliminar ")
        miAlerta.setMessage("Usuario")
        miAlerta.setPositiveButton("Eliminar"){_,_ ->
            var answer = listStudents.delete(name)
            if(answer == true)
            {
                Toast.makeText(this,"Usuario eliminado", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Usuario No Eliminado", Toast.LENGTH_SHORT).show()
            }
        }
        miAlerta.setNegativeButton("editar"){_,_ ->

        }
        return miAlerta.create()

    }

    override fun onRestart() {
        super.onRestart()
        val adapter = ArrayAdapter<String>(this@HomeActivity,android.R.layout.simple_list_item_1,listStudents.getStringArray())
        binding.ltvUsuarios.adapter = adapter
    }
}