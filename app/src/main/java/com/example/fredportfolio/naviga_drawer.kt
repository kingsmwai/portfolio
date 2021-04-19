package com.example.fredportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class naviga_drawer : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer:DrawerLayout
    private lateinit var toolbar:Toolbar
    private lateinit var navview:NavigationView
    private lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naviga_drawer)
        drawer= findViewById(R.id.drawerLayout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navview=findViewById(R.id.nav_drawer)
        navview.setNavigationItemSelectedListener(this)
        val toggle:ActionBarDrawerToggle= ActionBarDrawerToggle(this,drawer,toolbar,
        R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_homepage->{
                val intentHome= Intent(this@naviga_drawer,home::class.java)
                startActivity(intentHome)

            }
            R.id.nav_contact_us->{
                val intentContact_Us= Intent(this@naviga_drawer,Contact_Us::class.java)
                startActivity(intentContact_Us)

            }
            R.id.nav_about->{
                Toast.makeText(this,"fredfred ",Toast.LENGTH_LONG).show()

            }
        }
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }
    }
}