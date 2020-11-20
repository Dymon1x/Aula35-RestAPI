package br.com.digitalhouse.aula2011_restapi.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.aula2011_restapi.R

class ProdutosAdapter (val listProd: List<Produtos>): RecyclerView.Adapter<ProdutosAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_produtos, parent, false)
        return ItemViewHolder(itemView)
    }
    override fun getItemCount() = listProd.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listProd[position]
        holder.id_prod.text = item.id_prod.toString()
        holder.nome_prod.text = item.nome_prod
        holder.url_prod.text = item.url
        holder.id_emp.text = item.id_emp.toString()
        holder.nome_emp.text = item.nome_emp
        holder.valor.text = item.valor.toString()
//        holder.dt_exp.text = item.dt_exp
        holder.logo_emp.text = item.logo_emp.toString()
        holder.vol_prod.text = item.vol_prod
    }
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val id_prod: TextView = itemView.findViewById(R.id.id_prod)
        val nome_prod: TextView = itemView.findViewById(R.id.nome_item)
        val url_prod: TextView = itemView.findViewById(R.id.url_prod)
        val id_emp: TextView = itemView.findViewById(R.id.id_emp)
        val nome_emp: TextView = itemView.findViewById(R.id.nome_emp)
        val valor: TextView = itemView.findViewById(R.id.valor)
//        val dt_exp: TextView = itemView.findViewById(R.id.dt_exp)
        val logo_emp: TextView = itemView.findViewById(R.id.logo_emp)
        val vol_prod: TextView = itemView.findViewById(R.id.vol_prod)
    }
}

