package br.com.rafael.eletriccarapp.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rafael.eletriccarapp.databinding.ActivityCalcularAutonomiaBinding

class CalcularAutonomiaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalcularAutonomiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcularAutonomiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
             binding.tvResultado.text = calculoCusto().toString()
        }
        binding.imvClose.setOnClickListener {
            finish()
        }
    }

    fun calculoCusto(): Float {
        val precoKwh = binding.etValorKwh.text.toString().toFloat()
        val kmPercorrido = binding.etDistanciaViagem.text.toString().toFloat()
        val kmPorKwh = binding.tvKmPorKwh.text.toString().toFloat()
        return ((kmPercorrido / kmPorKwh) * precoKwh)
    }
}