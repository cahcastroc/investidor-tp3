package me.camila.perfil_investidor_tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class QuestionOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        val view = inflater.inflate(R.layout.fragment_question_one, container, false)

        val btSend = view.findViewById<Button>(R.id.btSend1)
        val score = 0

        btSend.setOnClickListener {
            val navController = this.findNavController()
//            val bundle = Bundle()
////            bundle.putString("teste")

            navController.navigate(R.id.action_questionOne_to_questionTwo)


            //----------

        }
        return view



    }




}