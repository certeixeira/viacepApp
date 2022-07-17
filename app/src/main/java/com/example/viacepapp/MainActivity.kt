package com.example.viacepapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.reflect.TypeToken.get
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cepVar: CEP

        val etCep = findViewById<EditText>(R.id.etCep)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnFindCep = findViewById<Button>(R.id.btnFindCep)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnFindCep.setOnClickListener {
            val call: Call<CEP> = RetrofitConfig().cepService.findCEP(etCep.getText().toString())

            call.enqueue(object : Callback<CEP?> {
                override fun onResponse(call: Call<CEP?>, response: Response<CEP?>) {
                    val cep: CEP? = response.body()
                    tvResult.setText(cep.toString())
                }

                override fun onFailure(call: Call<CEP?>, t: Throwable) {
                    Log.e("CEPService   ", "Erro ao buscar o cep:" + t.message)
                }
            })




        }

        btnClear.setOnClickListener {
            etCep.text.clear()
            tvResult.text = ""
        }


    }
}