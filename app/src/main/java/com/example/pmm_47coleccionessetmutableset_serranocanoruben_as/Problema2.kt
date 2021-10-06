package com.example.pmm_47coleccionessetmutableset_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_47coleccionessetmutableset_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val conjuntoFechas = setOf<Fecha>(
            Fecha(2,3,2019),
            Fecha(7,5,2021),
            Fecha(22,2,2020)
        )

        var existeFecha = ""
        if (conjuntoFechas.contains(Fecha(2,3,2019)))
            existeFecha = "La fecha 2/3/2019 existe en el conjunto\n"

        var fechas = "Conjunto de fechas:\n"
        for (fecha in conjuntoFechas)
            fechas += "Fecha: $fecha\n"

        binding.tvResultado20.text = existeFecha.plus(fechas)

    }
}
data class Fecha(val dia: Int, val mes: Int, val ano: Int){
    override fun toString(): String {
        return "$dia/$mes/$ano"
    }
}