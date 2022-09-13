package au.edu.swin.sdmd.w06_multiples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //get parcelable object from intent extra
        val multiples = intent.getParcelableExtra<Multiples>("multiples")

        //populate result
        val resultView = findViewById<TextView>(R.id.result)
        resultView.text = multiples!!.result.toString()

    }
}