package br.com.digitalhouse.aula2011_restapi.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.digitalhouse.aula2011_restapi.R
import br.com.digitalhouse.aula2011_restapi.models.Produtos
import br.com.digitalhouse.aula2011_restapi.models.ProdutosAdapter
import br.com.digitalhouse.aula2011_restapi.services.service
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(service) as T
            }
        }
    }
    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        viewModel.aluno.observe(this, Observer {
//            Log.i("MainActivity", it.toString())
//       })
//// por padrao o android studio vem desligado da INTERNET
//
//        viewModel.listAlunos.observe(this, Observer {
//            it.forEach{
//                Log.i("MainActivity", it.toString())
//            }
//        })
//        viewModel.getAlunoSort()
//        viewModel.getAllAlunos()

//        val listaProd = viewModel.getAllProdutos()
//        val adapter =  ProdutosAdapter(listaProd)
//        rvProdutos.adapter = adapter
//        rvProdutos.layoutManager = LinearLayoutManager(this)
//        rvProdutos.setHasFixedSize(true)

        viewModel.listProdutos.observe(this, Observer {
            Log.i("MainActivity", it.toString())
        })

        viewModel.listProdutos.observe(this, {
            it.forEach{
                Log.i("MainActivity", it.toString())
            }
        })

        viewModel.getAllProdutos()

    }
}

