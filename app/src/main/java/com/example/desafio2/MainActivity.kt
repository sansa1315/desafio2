package com.example.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.TextView
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private var editTextNumeric: EditText? = null

    private var buttonConfirm: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumeric = findViewById(R.id.etn_main);

        buttonConfirm = findViewById(R.id.btn_main);
        editTextNumeric?.addTextChangedListener(loginTextWatcher);



    }

    private val loginTextWatcher: TextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            val usernameInput: String = editTextNumeric?.getText().toString().trim()

            buttonConfirm?.setEnabled(!usernameInput.isEmpty())
        }

        override fun afterTextChanged(s: Editable) {}
    }

    fun terminos(view: android.view.View) {
        val text_condiciones = findViewById<TextView>(R.id.textView2)

        val intent = Intent(this, condiciones::class.java)


        startActivity(intent)
    }

    fun actividades(view: android.view.View) {
        val intent = Intent(this, activities::class.java)
        val cantPersonas = findViewById<EditText>(R.id.etn_main).text.toString()
        intent.putExtra("cantPersonas", cantPersonas)
        startActivity(intent)
    }


//    textNumerico = (TextView) findViewById(R.id.etn_main)
//    var btn_start = findViewById<Button>(R.id.btn_main)



}