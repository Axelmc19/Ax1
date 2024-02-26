package com.mendoza.axclientes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClientesAdapter(var context: Context,
    var ListaClientes: MutableList<dtClientes>) :
    RecyclerView.Adapter<ClientesAdapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtdescripcion: TextView
        init {
            txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtpreciome: TextView
        init {
            txtpreciome=itemView.findViewById(R.id.txtPreciome)
        }
        lateinit var txtprecioma: TextView
        init {
            txtprecioma=itemView.findViewById(R.id.txtPrecioma)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientesAdapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.vclientes,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
       return ListaClientes.size
    }

    override fun onBindViewHolder(holder: ClientesAdapter.vHolder, position: Int) {
        var clientes = ListaClientes[position]
        holder.txtid.text=clientes.Id
        holder.txtdescripcion.text=clientes.Descripcion
        holder.txtpreciome.text=clientes.Preciome
        holder.txtprecioma.text=clientes.Precioma
    }


}