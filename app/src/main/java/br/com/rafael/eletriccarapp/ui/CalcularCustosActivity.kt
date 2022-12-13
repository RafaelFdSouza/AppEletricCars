package br.com.rafael.eletriccarapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rafael.eletriccarapp.databinding.ActivityCalcularCustosBinding

class CalcularCustosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalcularCustosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcularCustosBinding.inflate(layoutInflater)
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