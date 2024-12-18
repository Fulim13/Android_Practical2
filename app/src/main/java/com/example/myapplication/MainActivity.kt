package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.view.MenuProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
//only generated when setting viewBinding = true
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val nav by lazy { supportFragmentManager.findFragmentById(R.id.host)!!.findNavController()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupActionBarWithNavController(nav)

        addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.main, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return menuItem.onNavDestinationSelected(nav)
            }

        }, this)
    }

    override fun onSupportNavigateUp(): Boolean {
        return nav.navigateUp()
    }
}