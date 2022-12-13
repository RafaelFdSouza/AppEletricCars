package br.com.rafael.eletriccarapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import br.com.rafael.eletriccarapp.databinding.ActivityMainBinding
import br.com.rafael.eletriccarapp.domain.Carro
import br.com.rafael.eletriccarapp.ui.adapter.CarAdapter
import br.com.rafael.eletriccarapp.ui.adapter.TabsAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupTabs()
    }

    //Configurados o TabsLayout com o ViewPager2
    private fun setupTabs() {
        val listTabs = arrayOf("Carros", "Favoritos")

        val tabsAdapter = TabsAdapter(supportFragmentManager, lifecycle)
        binding.vpViewPager.adapter = tabsAdapter

        TabLayoutMediator(binding.tabLayout, binding.vpViewPager) { tab, position ->
            binding.vpViewPager.currentItem
            tab.text = listTabs[position]
        }.attach()
    }

}


