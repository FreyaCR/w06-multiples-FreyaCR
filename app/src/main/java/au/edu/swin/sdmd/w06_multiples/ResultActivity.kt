package au.edu.swin.sdmd.w06_multiples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //get result from intent extra
        val result = intent.getIntExtra("result",0)

        //populate result
        val resultView = findViewById<TextView>(R.id.result)
        resultView.text = result.toString()

    }
}