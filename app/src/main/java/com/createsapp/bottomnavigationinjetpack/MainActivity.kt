package com.createsapp.bottomnavigationinjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Finding the navigation Controller
        val navController = findNavController(R.id.fragNavHost)

        //Setting Navigation Controller with the BottomNavigationView
        bottomNavigationView.setupWithNavController(navController)

        //Setting Up ActionBar with Navigation Controller
        setupActionBarWithNavController(navController)

        // Setting Up ActionBar with Navigation Controller
        // Pass the IDs of top-level destinations in AppBarConfiguration
        var appBarConfiguration = AppBarConfiguration(
                topLevelDestinationIds = setOf(
                        R.id.home,
                        R.id.search,
                        R.id.favourite,
                        R.id.profile
                )
        )

        setupActionBarWithNavController(navController,appBarConfiguration)
    }
}