package com.nogorsolutions.basis.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.nogorsolutions.basis.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dash_board)

      /*  val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

      val  navController = findNavController(R.id.nav_host_fragment)
      val  nav_view = findViewById<NavigationView>(R.id.nav_view)

      val  appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_DashBoard
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)*/
    }
}
