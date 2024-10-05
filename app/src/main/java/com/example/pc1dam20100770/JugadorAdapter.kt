package com.example.pc1dam20100770

import Jugador
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JugadorAdapter(private val jugadores: List<Jugador>) : RecyclerView.Adapter<JugadorAdapter.JugadorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        // Cambia fragment_gallery por item_jugador
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_gallery, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = jugadores[position]
        holder.bind(jugador)
    }

    override fun getItemCount(): Int = jugadores.size

    class JugadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nombreTextView: TextView = itemView.findViewById(R.id.textView3)
        private val anioNacimientoTextView: TextView = itemView.findViewById(R.id.textView5)
        private val edadTextView: TextView = itemView.findViewById(R.id.textView4)
        private val fotoImageView: ImageView = itemView.findViewById(R.id.imageView2)

        fun bind(jugador: Jugador) {
            nombreTextView.text = jugador.nombre
            anioNacimientoTextView.text = jugador.anioNacimiento
            edadTextView.text = jugador.edad.toString()

            // Cargar imagen desde drawable
            fotoImageView.setImageResource(jugador.fotoResId)
        }
    }
}

