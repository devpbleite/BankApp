package app.kotlin.devpbleite.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.kotlin.devpbleite.bankapp.adapter.AdapterPagamento
import app.kotlin.devpbleite.bankapp.adapter.AdapterProduto
import app.kotlin.devpbleite.bankapp.databinding.ActivityMainBinding
import app.kotlin.devpbleite.bankapp.model.Pagamento
import app.kotlin.devpbleite.bankapp.model.Produto

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        supportActionBar!!.hide()
        
        val recyclerIcPagamento = binding.recyclerIcPagamento
        recyclerIcPagamento.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIcPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIcPagamento.adapter = adapterPagamento
        listaIconesPagamento()
        
        val recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextoInfo()
    }
    
    private fun listaIconesPagamento() {
        val icone1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone1)
    
        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)
    
        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar \nEmprestado")
        listaPagamento.add(icone3)
    
        val icone4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icone4)
    
        val icone5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)
    
        val icone6 = Pagamento(R.drawable.ic_recarga, "Recarga de\n Celuar")
        listaPagamento.add(icone6)
    
        val icone7 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)
    
        val icone8 = Pagamento(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)
    }
    
    private fun listaTextoInfo() {
        val textInfo1 = Produto("Pix no Crédito: transfira sem usar o saldo da conta.")
        listaProduto.add(textInfo1)
    
        val textInfo2 = Produto("Convide seus amigos para nosso Banco e desbloqueie brasões incríveis.")
        listaProduto.add(textInfo2)
    
        val textInfo3 = Produto("Celular Seguro: 100% de cobertura, 0% estresse. Simule agora mesmo.")
        listaProduto.add(textInfo3)
    
        val textInfo4 = Produto("WhatsApp: Pagamentos seguros, rápidos e sem tarifa. A experiência...")
        listaProduto.add(textInfo4)
    }
}