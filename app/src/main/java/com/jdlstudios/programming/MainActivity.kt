package com.jdlstudios.programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jdlstudios.programming.databinding.ActivityMainBinding
import com.jdlstudios.programming.ui.views.HomeFragment
import com.jdlstudios.programming.ui.views.PriorKnowledgeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.button_home -> makeCurrentFragment(HomeFragment())
                R.id.button_knowledge -> makeCurrentFragment(PriorKnowledgeFragment())
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment, fragment)
            commit()
        }
    }
}