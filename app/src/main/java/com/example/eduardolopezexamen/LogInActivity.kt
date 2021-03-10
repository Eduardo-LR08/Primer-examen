package com.example.eduardolopezexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.eduardolopezexamen.Data.ListUsuarios
import com.example.eduardolopezexamen.databinding.ActivityMainBinding
import com.example.eduardolopezexamen.databinding.ActivitySurveyBinding

class LogInActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var listUsuarios =ListUsuarios()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


        binding.button.setOnClickListener{
            if(binding.editTextTextEmailAddress.text.isNotEmpty() && binding.editTextTextPassword.text.isNotEmpty()) {

                val intent = Intent(this@LogInActivity,HomeActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"inicio de sesion",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Usuario o contraseña incorrecto",Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_form,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.itmRegistro->{
                val intent = Intent(this@LogInActivity,RegistroActivity::class.java)
                startActivity(intent)
            }
            R.id.itmEncuesta->{
                val intent = Intent(this@LogInActivity,SurveyActivity::class.java)
                startActivity(intent)
            }
            R.id.itmExit->{
                finish()

            }
        }


        return super.onOptionsItemSelected(item)
    }
}