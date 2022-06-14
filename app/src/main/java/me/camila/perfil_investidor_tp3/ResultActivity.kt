package me.camila.perfil_investidor_tp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("Name")
        val tvNameResult = findViewById<TextView>(R.id.tvNameResult)
        tvNameResult.text = "Olá ${name}!"

        val score = intent.getIntExtra("Score", 0)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        tvScore.text = "Você obteve $score pontos!"

        val tvProfile = findViewById<TextView>(R.id.tvProfile)
        tvProfile.text = checkProfile(score)


    }

    private fun checkProfile(score: Int): String {

        return if (score <= 12) {
            "Perfil de Investimento: Conservador"
        } else if (score <= 29) {
            "Perfil de Investimento: Moderado"
        } else {
            "Perfil de Investimento: Arrojado"
        }
    }
}