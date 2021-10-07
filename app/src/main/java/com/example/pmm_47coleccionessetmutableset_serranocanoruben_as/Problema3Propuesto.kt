package com.example.pmm_47coleccionessetmutableset_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_47coleccionessetmutableset_serranocanoruben_as.databinding.ActivityProblema3PropuestoBinding

class Problema3Propuesto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3_propuesto)

        val binding = ActivityProblema3PropuestoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val conjuntoCarton = mutableSetOf<Int>()
        generarCarton(conjuntoCarton)

        val conjuntoValores = mutableSetOf<Int>()
        generarValores(conjuntoValores)

        var cantidadValores = 0
        var intentos = 0
        var aciertos = 0

        for (valor in conjuntoValores){
            cantidadValores++
            if (valor in conjuntoCarton){
                aciertos++
                intentos++
            } else
                intentos++
        }

        val cantidadAciertos = "La cantidad de números acertados en el cartón: $aciertos de 6\n"
        val cantidadIntentos = "Los intentos para acertar han sido: $intentos"

        binding.tvResultado30.text = cantidadAciertos.plus(cantidadIntentos)
    }
    fun generarCarton(carton: MutableSet<Int>){
        while (carton.size != 6){
            carton.add((1..50).random())
        }
    }
    fun generarValores(valores: MutableSet<Int>){
        while (valores.size != 50){
            valores.add((1..50).random())
        }
    }
}