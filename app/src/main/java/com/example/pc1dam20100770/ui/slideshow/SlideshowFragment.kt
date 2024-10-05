package com.example.pc1dam20100770.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pc1dam20100770.R
import com.example.pc1dam20100770.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {


    private lateinit var editTextKilometros: EditText
    private lateinit var editTextMinutos: EditText
    private lateinit var buttonCalcular: Button
    private lateinit var textViewResultado: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        editTextKilometros = view.findViewById(R.id.edTxKil)
        editTextMinutos = view.findViewById(R.id.edTxJug)
        buttonCalcular = view.findViewById(R.id.btnFormula)
        textViewResultado = view.findViewById(R.id.txReultado)

        buttonCalcular.setOnClickListener { calcularRendimiento() }

        return view
    }

    private fun calcularRendimiento() {
        val kilometros = editTextKilometros.text.toString().toFloatOrNull()
        val minutos = editTextMinutos.text.toString().toFloatOrNull()

        if (kilometros != null && minutos != null && minutos > 0) {
            val rendimiento = kilometros / minutos
            textViewResultado.text = "Rendimiento físico: ${"%.2f".format(rendimiento)} km/min"
        } else {
            textViewResultado.text = "Por favor, ingrese valores válidos."
        }
    }
}