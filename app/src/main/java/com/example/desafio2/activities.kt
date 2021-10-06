package com.example.desafio2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2.databinding.ActivityActivitiesBinding

class activities : AppCompatActivity() {

    private lateinit var binding: ActivityActivitiesBinding
    var cantPersonas = ""
    val actividades = listOf<String>("Education", "Recreational", "social", "diy", "charity", "cooking", "relaxion", "music", "busywork")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setImageDrawable(getDrawable(R.drawable.ic_baseline_compare_arrows_24))
        binding.fab.setOnClickListener { view ->
            var posicion = (0..9).random()
//            Snackbar.make(view, actividades[posicion], Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()


        }
        val intent = getIntent()

        if (intent != null) {
            cantPersonas = intent.getStringExtra("cantPersonas").toString()
        }

        initRecycler()

    }

    fun initRecycler(){
        val recyler = findViewById<RecyclerView>(R.id.recView)
        recyler.layoutManager = LinearLayoutManager(this)
        val adapter = ActivityAdapter(actividades)
        recyler.adapter = adapter
    }

    fun sugerencia(view: android.view.View) {
        val intent = Intent(this, sugerencia::class.java)
        intent.putExtra("cantPersonas", cantPersonas)

        startActivity(intent)
    }
}