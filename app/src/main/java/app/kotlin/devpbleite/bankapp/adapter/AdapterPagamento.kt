package app.kotlin.devpbleite.bankapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.kotlin.devpbleite.bankapp.databinding.PagamentoItemBinding
import app.kotlin.devpbleite.bankapp.model.Pagamento

class AdapterPagamento(
    private val context: Context,
    private val listaPagamento: MutableList<Pagamento>
) :
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {
    
    
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterPagamento.PagamentoViewHolder {
        val itemLista = PagamentoItemBinding.inflate(
            LayoutInflater.from(context),
            parent, false
        )
        return PagamentoViewHolder(itemLista)
    }
    
    override fun onBindViewHolder(
        holder: AdapterPagamento.PagamentoViewHolder,
        position: Int
    ) {
        holder.iconePagamento.setBackgroundResource(listaPagamento[position].icone!!)
        holder.txtTituloPagamento.text = listaPagamento[position].titulo
    }
    
    override fun getItemCount() = listaPagamento.size
    
    inner class PagamentoViewHolder(binding: PagamentoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        
        val iconePagamento = binding.icPagamento
        val txtTituloPagamento = binding.txtTituloPagamento
    }
}