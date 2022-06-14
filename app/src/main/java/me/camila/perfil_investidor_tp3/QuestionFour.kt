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
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class QuestionFour : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_question_four, container, false)

        val btSend = view.findViewById<Button>(R.id.btSend4)

        var score = arguments?.getInt("score")

        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        var check = false


        radioGroup.setOnCheckedChangeListener { _, id ->
            val rbOptionA = view.findViewById<RadioButton>(R.id.rbOptionA)
            val rbOptionB = view.findViewById<RadioButton>(R.id.rbOptionB)
            val rbOptionC = view.findViewById<RadioButton>(R.id.rbOptionC)


            when (id) {
                rbOptionA?.id -> score = score?.plus(0)
                rbOptionB?.id -> score = score?.plus(2)
                rbOptionC?.id -> score = score?.plus(4)

            }
            check = true
        }

        btSend.setOnClickListener {

            if (check) {

                val navController = this.findNavController()

                val bundle = bundleOf("score" to score)

                navController.navigate(R.id.action_questionFour_to_questionFive, bundle)

            } else {

                Toast.makeText(activity, "Selecione uma opção", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }
}