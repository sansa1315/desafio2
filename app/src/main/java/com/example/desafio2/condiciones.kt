package com.example.desafio2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio2.databinding.ActivityCondicionesBinding

class condiciones : AppCompatActivity() {

    private lateinit var binding: ActivityCondicionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCondicionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setImageDrawable(getDrawable(R.drawable.ic_baseline_close_24))
        binding.fab.setOnClickListener{ view ->
//            Snackbar.make(view,"hola mundo" ,Snackbar.LENGTH_SHORT).setAction("Accion", null).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}