package com.example.pmm_47coleccionessetmutableset_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_47coleccionessetmutableset_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val conjunto = mutableSetOf(11,32,21,64,3,1)

        var elementosConjunto = ""
        for (elemento in conjunto){
            elementosConjunto += "Elementos en el conjunto: $elemento\n"
        }

        val cantidadElementos = "Cantidad de elementos: ${conjunto.size}\n"

        conjunto.add(7)
        var elementosConjuntoModificado = ""
        for (elemento in conjunto){
            elementosConjuntoModificado += "Elementos en el conjunto modificado: $elemento\n"
        }

        binding.tvResultado10.text = elementosConjunto.plus(cantidadElementos)
            .plus(elementosConjuntoModificado)

    }
}