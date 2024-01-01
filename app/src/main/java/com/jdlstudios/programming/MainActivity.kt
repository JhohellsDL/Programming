package com.jdlstudios.programming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.jdlstudios.programming.databinding.ActivityMainBinding
import com.jdlstudios.programming.ui.views.HomeFragment
import com.jdlstudios.programming.ui.views.PriorKnowledgeFragment
import com.jdlstudios.programming.ui.views.ThemesFragment
import com.jdlstudios.programming.ui.views.UserFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, insets ->
            insets.isVisible(WindowInsetsCompat.Type.ime())
            insets
        }

        binding.buttonNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.button_home -> makeCurrentFragment(HomeFragment())
                R.id.button_knowledge -> makeCurrentFragment(PriorKnowledgeFragment())
                R.id.button_exercises -> makeCurrentFragment(ThemesFragment())
                R.id.button_user -> makeCurrentFragment(UserFragment())
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