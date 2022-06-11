package me.camila.perfil_investidor_tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController



class QuestionOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_question_one, container, false)

        val btSend = view.findViewById<Button>(R.id.btSend1)
        var score = 0


        //------------------ RadioButtons
        val rbOptionA = view.findViewById<RadioButton>(R.id.rbOptionA)
        val rbOptionB = view.findViewById<RadioButton>(R.id.rbOptionB)
        val rbOptionC = view.findViewById<RadioButton>(R.id.rbOptionC)
        val rbOptionD = view.findViewById<RadioButton>(R.id.rbOptionD)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)



        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            when (id) {
                rbOptionA?.id -> score =+ 1
                rbOptionB?.id -> score =+ 2
                rbOptionC?.id -> score =+ 3
                rbOptionD?.id -> score =+ 5
            }
        }


        btSend.setOnClickListener {
            val navController = this.findNavController()
//            val bundle = Bundle()
//            bundle.putInt("score",score)

            Toast.makeText(activity,"Pontuação: $score",Toast.LENGTH_LONG).show()
            navController.navigate(R.id.action_questionOne_to_questionTwo)


            //----------

        }

        return view


    }


}
