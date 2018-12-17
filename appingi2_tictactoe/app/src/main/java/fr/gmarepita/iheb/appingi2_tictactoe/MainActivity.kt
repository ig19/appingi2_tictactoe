package fr.gmarepita.iheb.appingi2_tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            val explicitIntent = Intent(this@MainActivity, GameActivity::class.java)
            val inputName = input_name.text
            explicitIntent.putExtra("name", inputName.toString())
            startActivity(explicitIntent)
        }
    }
}
