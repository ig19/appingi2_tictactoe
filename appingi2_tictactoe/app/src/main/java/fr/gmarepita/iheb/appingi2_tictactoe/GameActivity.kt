package fr.gmarepita.iheb.appingi2_tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fr.gmarepita.iheb.appingi2_tictactoe.R.string.Name
import kotlinx.android.synthetic.main.game_activity.*

class GameActivity : AppCompatActivity() {

    var turn = true
    var gameOver = false
    var str = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)
        val originIntent = intent

        Name.text = originIntent.getStringExtra("name")


        playerTurn1.isEnabled = false

        btn1.setTextColor(Color.BLACK)
        btn2.setTextColor(Color.BLACK)
        btn3.setTextColor(Color.BLACK)
        btn4.setTextColor(Color.BLACK)
        btn5.setTextColor(Color.BLACK)
        btn6.setTextColor(Color.BLACK)
        btn7.setTextColor(Color.BLACK)
        btn8.setTextColor(Color.BLACK)
        btn9.setTextColor(Color.BLACK)


        btn1.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false
                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"
                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn1.text = str


        }

        btn2.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false
                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"
                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn2.text = str

        }
        btn3.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn3.text = str

        }
        btn4.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn4.text = str

        }
        btn5.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn5.text = str

        }
        btn6.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn6.text = str

        }
        btn7.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn7.text = str
        }
        btn8.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn8.text = str

        }
        btn9.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            } else {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            btn9.text = str

        }
    }
}