package com.mendoza.axclientes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaClientes: MutableList<dtClientes> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaClientes.add(
            dtClientes("Takis fuego","Sabritas de chile","$17","$10"))
        listaClientes.add(
            dtClientes("Takis texas","Sabritas de chile","$17","$10"))
        listaClientes.add(
            dtClientes("Takis azules","Sabritas de chile","$18","$10"))
        listaClientes.add(
            dtClientes("Fritos sal y limon","Sabrita de maiz","$16","$8"))
        listaClientes.add(
            dtClientes("Totis sal y limon","Sabrita de harina","$10","$5"))
        listaClientes.add(
            dtClientes("Totis chile y limon","Sabrita de harina","$10","$5"))
        listaClientes.add(
            dtClientes("Chettos","Sabrita de maiz","$15","$8"))
        listaClientes.add(
            dtClientes("Cacahuates enchilados","Cacahuates","$20","$8"))
        listaClientes.add(
            dtClientes("Fanta","Refresco de naranja de 1.5L","$25","$14"))
        listaClientes.add(
            dtClientes("Sprite","Refresco de toronja de 1.5L","$25","$14"))
        listaClientes.add(
            dtClientes("Fresca","Refresco de toronja de 3L","$38","$29"))
        listaClientes.add(
            dtClientes("Valle","Jugo del valle de 1.5L","$18","$12"))
        listaClientes.add(
            dtClientes("Pan Bimbo","Pan de caja","$38","$27"))
        listaClientes.add(
            dtClientes("Mantecadas","Pan dulce","$18","$12"))
        listaClientes.add(
            dtClientes("Roles de canela","Pan dulce","$30","$20"))
        listaClientes.add(
            dtClientes("Dona de chocolate","Pan dulce","$10","$5"))
        listaClientes.add(
            dtClientes("Dona de azucar","Pan dulce","$10","$5"))
        listaClientes.add(
            dtClientes("Dona glazeada","Pan dulce","$10","$5"))
        listaClientes.add(
            dtClientes("Valle","Jugo de uva de 1.5L","$$18","$12"))
        listaClientes.add(
            dtClientes("Cafe","Cafe de 200gramos","$42","$20"))

        var tabla = findViewById<RecyclerView>(R.id.tablaClientes)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ClientesAdapter(this,listaClientes)


    }
}