package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

 class MainActivity2 : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
     lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
      lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//makes toggle a back arrow when open
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                    R.id.nav_home ->
                        Toast.makeText(this@MainActivity2, "Home is clicked", Toast.LENGTH_SHORT).show()

                    R.id.nav_about -> {
                        Toast.makeText(this@MainActivity2, "About is clicked", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this,AboutActivity::class.java)
                        startActivity(intent)
                        finish()

                    }
                    R.id.nav_services -> {
                        Toast.makeText(this@MainActivity2, "Services is clicked", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this,ServicesActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    R.id.nav_reviews -> {
                        Toast.makeText(this@MainActivity2, "Reviews is clicked", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this,ReviewsActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    R.id.nav_events -> {
                        Toast.makeText(this@MainActivity2, "Events is clicked", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this,EventsActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    R.id.nav_share -> {
                        Toast.makeText(this@MainActivity2, "Share is clicked", Toast.LENGTH_SHORT).show()
                        val appMsg :String = "Hey! Check Out This App for Share :- " +
                                "Link Here"
                        val intent = Intent()
                        intent.action = Intent.ACTION_SEND
                        intent.putExtra(Intent.EXTRA_TEXT,appMsg)
                        intent.type = "text/plain"
                        startActivity(intent)

                    }
                    R.id.nav_logOut -> {
                        Toast.makeText(this@MainActivity2, "log out is clicked", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this,LoginActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
                true
            }
        }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
     if (toggle.onOptionsItemSelected(item)){

         return true
     }
         return super.onOptionsItemSelected(item)
     }

     override fun onBackPressed() {
         if (drawerLayout.isDrawerOpen(GravityCompat.START)){
             drawerLayout.closeDrawer(GravityCompat.START)
         }else {
             onBackPressedDispatcher.onBackPressed()
         }
     }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {
         TODO("Not yet implemented")
     }
 }























































































