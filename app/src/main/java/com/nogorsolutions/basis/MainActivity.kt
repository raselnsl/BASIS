package com.nogorsolutions.basis

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)

        val badgeLayoutNotification = menu.findItem(R.id.action_notification)
        badgeLayoutNotification.setActionView(R.layout.badge_layout_notification)

       /* val bundle = Bundle()
        bundle.putParcelableArrayList("notificationList", notificationList)
        badgeLayoutNotification.actionView.setOnClickListener {
            navController.navigate(R.id.notificationFragment, bundle, options)
        }
        textViewCount = badgeLayoutNotification.actionView.findViewById(R.id.badge_textView)
        textViewCount.visibility = View.INVISIBLE*/

        val badgeLayoutMail = menu.findItem(R.id.action_mail)
        badgeLayoutMail.setActionView(R.layout.badge_layout_mail)

       /* badgeLayoutMail.actionView.setOnClickListener {
            navController.navigate(R.id.mailFragment, null, options)
        }*/

        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onResume() {
        super.onResume()

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id in arrayOf(
                    R.id.nav_main,
                    R.id.nav_login,
                    R.id.nav_signup
                )
            ){
                toolbar.visibility = View.GONE
            }else {
                toolbar.visibility = View.VISIBLE
            }
        }
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {

            when (navController.getCurrentDestination()!!.getId()){
                navController.graph.startDestination -> {

                    MaterialAlertDialogBuilder(this)
                        .setTitle("Alert !")
                        .setMessage("Are you sure you want to exit ?")
                        .setPositiveButton("Ok", { dialogInterface, i ->
                            super.onBackPressed()
                           /* Intent(this, LoginFourActivity::class.java).also {
                                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                startActivity(it)
                                // overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                            }*/
                        })
                        .setNegativeButton("Cancel", null)
                        .show();
                }
                else -> navController.navigateUp()
            }
        }
    }
}
