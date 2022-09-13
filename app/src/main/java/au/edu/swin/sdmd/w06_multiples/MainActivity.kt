package au.edu.swin.sdmd.w06_multiples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //randomly generate two integer factors 1-12
        val factor1 = Random.nextInt(from = 1, until = 13)
        val factor2 = Random.nextInt(from = 1, until = 13)

        //populate factor text views with generated values
        val factor1View = findViewById<TextView>(R.id.factor1)
        val factor2View = findViewById<TextView>(R.id.factor2)
        factor1View.text = factor1.toString()
        factor2View.text = factor2.toString()

        //layout click listener to start result activity
        val layoutView = findViewById<ConstraintLayout>(R.id.layout)
        layoutView.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("factor1", factor1) //int extra
                putExtra("factor2", factor2) //int extra
            }
            startActivity(intent) //start result activity
        }
    }
}