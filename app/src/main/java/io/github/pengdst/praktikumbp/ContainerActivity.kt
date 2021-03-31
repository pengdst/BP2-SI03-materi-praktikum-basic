package io.github.pengdst.praktikumbp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class ContainerActivity : AppCompatActivity() {

    lateinit var btnLoadHome: Button
    var fragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        btnLoadHome = findViewById(R.id.btn_load_home)

        btnLoadHome.setOnClickListener {
            fragment = HomeFragment()
            fragment?.let {
                loadFragment(it)
            }
        }
    }

    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.fl_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}