package com.bmharwani.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler : RecyclerView = findViewById(R.id.recycler)
        val adapter : RecyclerViewAdapter = RecyclerViewAdapter()

// Configuracion del adapter
        adapter.RecyclerViewAdapter(contacts(),this)



// Configuracion de Reycycler view
        recycler.hasFixedSize()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
        

    }

    private fun contacts(): MutableList<ContactoMode> {
        var contactosModels : MutableList<ContactoMode> = ArrayList()
        contactosModels.add(ContactoMode("Mi Amorsito","096046294"))
        contactosModels.add(ContactoMode("Byron","0995278890"))
        contactosModels.add(ContactoMode("Johannes","0983875374"))
        contactosModels.add(ContactoMode("Julitooo","0980366561"))
        contactosModels.add(ContactoMode("Juan","0987156456"))
        contactosModels.add(ContactoMode("Luiggi","+1 (713) 2056116"))
        contactosModels.add(ContactoMode("Zea","0986032246"))
        contactosModels.add(ContactoMode("Christian","0987726326"))
        contactosModels.add(ContactoMode("Josee","0989400941"))
        contactosModels.add(ContactoMode("Prias","0980112215"))

        return contactosModels

    }
}