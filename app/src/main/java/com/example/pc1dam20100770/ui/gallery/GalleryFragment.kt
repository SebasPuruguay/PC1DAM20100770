package com.example.pc1dam20100770.ui.gallery

import Jugador
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pc1dam20100770.JugadorAdapter
import com.example.pc1dam20100770.R

class GalleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var jugadorAdapter: JugadorAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        recyclerView = view.findViewById(R.id.recvieJug)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Cargar los datos de los jugadores
        cargarJugadores()

        return view
    }

    private fun cargarJugadores() {
        val jugadores = listOf(
            Jugador("Tengo HAMBREERE", "1987", R.drawable.cuto),
            Jugador("Cuevita por queee", "1985", R.drawable.cueva),
            Jugador("Manco que no tenia nada de manco", "1992", R.drawable.manco)
        )

        jugadorAdapter = JugadorAdapter(jugadores)
        recyclerView.adapter = jugadorAdapter
    }
}