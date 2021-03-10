package com.example.eduardolopezexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eduardolopezexamen.Data.ListUsuarios
import com.example.eduardolopezexamen.Tools.Constants
import com.example.eduardolopezexamen.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetalleBinding
    private val listStudents= ListUsuarios()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.text_detalle)

        val id: Int = intent.getIntExtra(Constants.ID, -1)

        if (id!=-1)
        {
            val student = listStudents.getStudent(id)

            binding.txvName.text = "${student.name} "
            binding.txvPromociones.text= "${student.promociones}"
            binding.txvGender.text = "${if (student.gender==1) "Masulino" else if (student.gender==2) "Femenino" else "genero no seleccionado"} "
            binding.txvEntrega.text = "${student.entrega}"
            binding.txvTarjeta.text = "${if(student.pagoTarjeta) "Pago con tarjeta" else "Pago en efectivo"}"
            binding.txvGustos.text = "Pasa Tiempos: ${if(student.postres)"postres" else ""} ${if(student.bebidas)"bebidas" else ""} ${if(student.saludable)"saludable" else ""}"

        }
        else
        {
            Toast.makeText(this@DetalleActivity,"Se genero un problema al intentar cargar esta pagina",
                Toast.LENGTH_SHORT).show()
            //finish()
            super.onBackPressed()
        }

    }
}