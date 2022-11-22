package com.bmharwani.recyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var contactos : MutableList<ContactoMode> = ArrayList()
    lateinit var context : Context


   fun RecyclerViewAdapter(contactos:MutableList<ContactoMode>, context:Context) {
       this.contactos = contactos
       this.context = context
   }

    class ViewHolder (view : View):RecyclerView.ViewHolder(view) {
        val nombre:TextView
        val telefono :TextView

        init {
            nombre = view.findViewById(R.id.tv_nombre)
            telefono = view.findViewById(R.id.tv_telefono)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.nombre.text = contactos[position].nombre
        holder.telefono.text = contactos[position].telefono
    }

    override fun getItemCount() = contactos.size
    }

