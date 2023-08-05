package app.kotlin.devpbleite.bankapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.kotlin.devpbleite.bankapp.databinding.ProdutoItemBinding
import app.kotlin.devpbleite.bankapp.model.Produto

class AdapterProduto(
    private val context: Context,
    private val listaProduto: MutableList<Produto>
) : RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {
    
    
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context),
            parent, false)
        return ProdutoViewHolder(itemLista)
    }
    
    override fun getItemCount() = listaProduto.size
    
    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
       holder.txtTextoInfo.text = listaProduto[position].texto
    }
    
    inner class ProdutoViewHolder(binding: ProdutoItemBinding): RecyclerView.ViewHolder(binding.root) {
        
        val txtTextoInfo = binding.txtTextoInfo
    
    }
}