package au.edu.swin.sdmd.w06_multiples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //get result from intent extra
        val factor1 = intent.getIntExtra("factor1",0)
        val factor2 = intent.getIntExtra("factor2",0)

        //calculate result
        val result = factor1 * factor2

        //populate result
        val resultView = findViewById<TextView>(R.id.result)
        resultView.text = result.toString()

    }
}