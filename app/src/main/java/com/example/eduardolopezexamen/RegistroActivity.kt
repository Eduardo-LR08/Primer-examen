package com.example.eduardolopezexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eduardolopezexamen.Data.ListUsuarios
import com.example.eduardolopezexamen.Entity.EntityUsuarios
import com.example.eduardolopezexamen.databinding.ActivityRegistroBinding
import com.example.eduardolopezexamen.databinding.ActivitySurveyBinding
import com.google.android.material.snackbar.Snackbar

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegistroBinding
    private var listUsuarios= ListUsuarios()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_registro)

        binding.btnOk.setOnClickListener {

/*
            if (binding.edtEmail.text.isNotEmpty() && binding.edtPassword.text.isNotEmpty()) {

                //Toast.makeText(this@FormActivity,"estoy en evento clic",Toast.LENGTH_SHORT).show()
                val usuario = EntityUsuarios()
                usuario.name = binding.edtEmail.text.toString()
               usuario.promociones = binding.edtPromociones.text.toString()
                usuario.gender = binding.spnGender.selectedItemPosition
                //val genderText:String = binding.spnGender.selectedItem.toString()
                when (binding.rgdEntrega.checkedRadioButtonId) {
                    binding.rdbDomicilio.id -> {
                        usuario.entrega = "Domicilio"
                    }
                    binding.rdbRestaurante.id -> {
                        usuario.entrega = "Restaurante"
                    }
                    binding.rdbFuera.id -> {
                        usuario.entrega = "Fuera"
                    }
                }

                usuario.postres = binding.ckbPostres.isChecked
                usuario.bebidas = binding.ckbBebidas.isChecked
                usuario.saludable = binding.ckbSaludable.isChecked

                usuario.pagoTarjeta = binding.swtPagotarjeta.isChecked

                val index = listUsuarios.add(usuario)
                if (index >= 0) {

                    Toast.makeText(this@SurveyActivity, "Encuesta del Usuario guardado.", Toast.LENGTH_SHORT)
                        .show()
                    binding.edtName.text.clear()
                    binding.edtPromociones.text.clear()
                    binding.rgdEntrega.clearCheck()
                    binding.spnGender.setSelection(0)
                    binding.ckbPostres.isChecked = false
                    binding.ckbBebidas.isChecked = false
                    binding.ckbSaludable.isChecked = false
                    binding.swtPagotarjeta.isChecked = false

                } else {
                    Snackbar.make(it, "Encuesta del Usuario No Guardado.", Snackbar.LENGTH_SHORT).show()
                }
            } else {
                Snackbar.make(
                    it,
                    "El nombre y los apellidos son obligatorios",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
            */

        }
    }
}