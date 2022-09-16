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

        //layout click listener to start result activity
        val layoutView = findViewById<ConstraintLayout>(R.id.layout)
        layoutView.setOnClickListener {

            //populate factor text views with generated values
            val factor1View = findViewById<TextView>(R.id.factor1)
            val factor2View = findViewById<TextView>(R.id.factor2)

            if (factor1View.text.toString() != "" && factor2View.text.toString() != "") { //blank string checks
                //get factors from text input fields
                val factor1 = factor1View.text.toString().toInt()
                val factor2 = factor2View.text!!.toString().toInt()

                if (factor1 in 1..12 && factor2 in 1..12) { //factors in range checks
                    //place factors in Multiples parcelable object
                    val multiples = Multiples(factor1, factor2)

                    val intent = Intent(this, ResultActivity::class.java).apply {
                        putExtra("multiples", multiples) //parcelable object extra
                    }
                    startActivity(intent) //start result activity
                }
                else { //one or both factors not in range, throw error(s)
                    if (factor1 !in 1..12) {
                        factor1View.error = "Must be 1-12"
                    }
                    if (factor2 !in 1..12) {
                        factor2View.error = "Must be 1-12"
                    }
                }
            }
            else { //one or both text fields blank, throw error(s)
                if (factor1View.text.toString() == "") {
                    factor1View.error = "Must be 1-12"
                }
                if (factor2View.text.toString() == "") {
                    factor2View.error = "Must be 1-12"
                }
            }
        }
    }
}