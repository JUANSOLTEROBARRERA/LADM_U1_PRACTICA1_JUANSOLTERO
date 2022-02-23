package mx.tecnm.tepic.ladm_u1_practica1_juansoltero

import android.content.Intent
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import mx.tecnm.tepic.ladm_u1_practica1_juansoltero.databinding.ActivityScrolling2Binding

class ScrollingActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityScrolling2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrolling2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            llamarActivity()
        }
    }
    private fun llamarActivity() {
        val otroact = Intent(this, MainActivity2::class.java)
        startActivity(otroact)
    }
}