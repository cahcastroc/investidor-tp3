package me.camila.perfil_investidor_tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = this.findViewById<EditText>(R.id.etName)

        val btStart = this.findViewById<Button>(R.id.btStart)

        btStart.setOnClickListener {
            val intentResult = Intent(this,ResultActivity::class.java)
            val intentQuestions = Intent(this,QuestionsActivity::class.java)

            if(validated(etName)){
                intentResult.putExtra("Name", etName.text.toString())
                startActivity(intentQuestions)
            }else{
                Toast.makeText(this,"Insira o seu nome no campo indicado",Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun validated(name:EditText): Boolean {
            return name.text.isNotBlank()
    }
}