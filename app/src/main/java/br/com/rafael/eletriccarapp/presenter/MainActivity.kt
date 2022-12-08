package br.com.rafael.eletriccarapp.presenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.rafael.eletriccarapp.databinding.ActivityMainBinding
import br.com.rafael.eletriccarapp.presenter.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startActivity()
        setupRecyclerView()

    }
    fun setupRecyclerView(){
        val adapter = CarAdapter(arrayOf("Celta", "Gol", "Asdasd", "sodks", "Asdsdkk", "asdrt"))
        rvCarros = binding.rvListaCarros
        rvCarros.adapter = adapter
    }
    private fun startActivity() {
        binding.btnCustosViagem.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}